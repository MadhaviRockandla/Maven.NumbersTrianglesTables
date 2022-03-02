package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {

        String evenNum = "";
        for (int i = start; i < stop; i++) {
        if (i % 2 == 0) {
            evenNum = evenNum + i;
        }
    }
        return evenNum;
}


    public static String getOddNumbers(int start, int stop) {
        String oddNum = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0)
                oddNum = oddNum + i;
        }
        return oddNum;
    }



    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int start) {
        String result = "";
        for (int i = 0; i < start; i++) {
            result += i;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++)
        {
            result += i;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {

        String result = "";
        for (int i = start; i < stop; i+=step){
            result += i;
        }
        return result;
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start; i<=stop; i=i+step) {
            result = result + Math.round(Math.pow(i, exponent));
        }
        return result ;
    }
}
