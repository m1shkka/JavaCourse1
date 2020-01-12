package com.softserve.edu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String min;
        String max = null;

        System.out.print("Input min: ");
        min = in.nextLine();
        char[] minArray = min.toCharArray();

        while (minArray.length != 6) {
            System.out.print("Incorrect number. The length should be equal 6 \n");
            System.out.print("Input min: ");
            min = in.nextLine();
            minArray = min.toCharArray();
        }

        System.out.print("Input max: ");
        max = in.nextLine();
        char[] maxArray = max.toCharArray();

        while (maxArray.length != 6) {
            System.out.print("Incorrect number. The length should be equal 6 \n");
            System.out.print("Input max: ");
            max = in.nextLine();
            maxArray = max.toCharArray();
        }

        String type = getBetterType(min, max);
        System.out.print(type + " type is better");
    }

    public static String getBetterType(String min1, String max1) {

        int min = Integer.parseInt(min1);
        int max = Integer.parseInt(max1);
        int easy = 0;
        int hard = 0;

        for (int a = min; a < max; a++) {

            String n = Integer.toString(a);
            char[] charArray = n.toCharArray();
            int scoreOne = 0, scoreTwo = 0;

            for (int j = 0; j < 3; j++) {
                scoreOne = +Character.getNumericValue(charArray[j]);
            }
            for (int j = 3; j < 6; j++) {
                scoreTwo = +Character.getNumericValue(charArray[j]);
            }

            if (scoreOne == scoreTwo) {
                easy++;
            }

            int sumPar = 0, sumNePar = 0;
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] % 2 == 0) {
                    sumPar += Character.getNumericValue(charArray[i]);
                } else {
                    sumNePar += Character.getNumericValue(charArray[i]);
                }
            }
            if (sumNePar == sumPar) {
                hard++;
            }
        }

        System.out.print("easy: " + easy + "\n");
        System.out.print("hard: " + hard + "\n");
        if (easy < hard) return "hard";
        else return "easy";
    }
}
