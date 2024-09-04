package com.jyq.java;

import com.jyq.strategy.optimize.DiscountStrategy;

import java.io.File;
import java.net.URL;
import java.util.*;

public class FinalCode {

    static Map<String, DiscountStrategy> factory = new HashMap<>();
    static List<Class<?>> discountStrategies = new ArrayList<>();
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        for (Class<?> clazz : discountStrategies) {
            factory.put(clazz.getSimpleName(), (DiscountStrategy) clazz.newInstance());
            System.out.println("Found implementation: " + clazz.getName());
        }

        System.out.println(factory.get("HalfPriceDiscountStrategy").applyDiscount(100));
    }

    static{
        try {
            discountStrategies = getClassesImplementingInterface(DiscountStrategy.class);
//            for (Class<?> clazz : discountStrategies) {
//                System.out.println("Found implementation: " + clazz.getName());
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Class<?>> getClassesImplementingInterface(Class<?> interfaceClass) throws Exception {
        if (!interfaceClass.isInterface()) {
            throw new IllegalArgumentException("Provided class is not an interface");
        }

        List<Class<?>> classes = new ArrayList<>();
        String packageName = interfaceClass.getPackage().getName();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(path);

        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            File directory = new File(resource.getFile());
            classes.addAll(findClasses(directory, packageName, interfaceClass));
        }

        return classes;
    }

    private static List<Class<?>> findClasses(File directory, String packageName, Class<?> interfaceClass) throws ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<>();
        if (!directory.exists()) {
            return classes;
        }

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    classes.addAll(findClasses(file, packageName + "." + file.getName(), interfaceClass));
                } else if (file.getName().endsWith(".class")) {
                    Class<?> clazz = Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6));
                    if (interfaceClass.isAssignableFrom(clazz) && !clazz.isInterface()) {
                        classes.add(clazz);
                    }
                }
            }
        }

        return classes;
    }
}
