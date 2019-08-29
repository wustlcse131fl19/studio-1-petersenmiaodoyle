package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
    ArgsProcessor ap = new ArgsProcessor(args);

        Integer n1 = ap.nextInt("The first number:");
        Integer n2 = ap.nextInt("The second number:");

        int sum = n1 + n2;
        double average = (double) sum / 2;
        System.out.println("The average of " + n1 + " and " + n2 + " is " + average + ".");
}}