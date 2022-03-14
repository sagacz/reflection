package com.kodilla.reflection.homework;

import java.lang.reflect.Field;

public class ReflectionHomework {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student();
        Field indexNumberField = Student.class.getDeclaredField("indexNumber");
        indexNumberField.setAccessible(true);
        String value = (String) indexNumberField.get(student);
        System.out.println(value);
    }
}
