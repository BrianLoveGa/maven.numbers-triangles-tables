package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        /// return getRange(start %2 == 0 ? start :start +1, stop,2);
        String answerEven = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                answerEven += i;
            }
        }
        return answerEven;
    }


    public static String getOddNumbers(int start, int stop) {
        String answerOdd = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                answerOdd += i;
            }
        }
        return answerOdd;

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String answerSquare = "";
        for (int i = start; i < stop; i+= step) {
            int j = i*i;
            answerSquare += j;

        }
        return answerSquare;
    }

    public static String getRange(int stop) {
        String range = "";
        for (int i=0;i<stop;i++)
            range+=i;
        return range;
    }

    public static String getRange(int start, int stop) {
        String solution = "";
        for (int i=start;i<stop;i++){
            solution+=i;
        }
        return solution;
    }


    public static String getRange(int start, int stop, int step) {
        String tripleInput = "";
        for (int i=start; i<stop;i+=step){
            tripleInput+=i;
        }
        return tripleInput;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String answer = "";
        for(int i=start;i<stop;i+=step){
            Double resultAsDouble = Math.pow(i,exponent);
            Integer resultAsInteger = resultAsDouble.intValue();
            answer += resultAsInteger;
            //answer+= (int)Math.pow(i,exponent);
        }

        return answer;
    }
}
