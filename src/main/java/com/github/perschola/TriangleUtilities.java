package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            answer.append(getRow(i)+ "\n");

        }
        return answer.toString();
    }

    public static String getRow(int numberOfStars) {
        return new String(new char[numberOfStars]).replaceAll("\u0000", "*");
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}


