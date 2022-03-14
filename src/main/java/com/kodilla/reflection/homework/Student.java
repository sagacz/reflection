package com.kodilla.reflection.homework;


import java.util.Random;

public class Student {
    private String indexNumber;

    private String generateString(){
        int leftLimit = 'A';
        int rightLimit = 'z';
        int targetStringLength = 10;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public Student(){
        this.indexNumber = generateString();
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }
}
