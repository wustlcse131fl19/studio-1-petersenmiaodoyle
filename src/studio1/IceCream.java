package studio1;

import support.cse131.ArgsProcessor;

public class IceCream {

    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);

        Integer tD = ap.nextInt("How many times have you been to Ted Drewes?");

        Boolean lc = ap.nextBoolean("I like vanilla frozen custard. True or False?");

        Integer cs = ap.nextInt("How many people can you take in your car?");

        Double pc = ap.nextDouble("What is the price of a small cup of vanilla frozen custard?");

        String fs = ap.nextString("What is your favorite special offering at Ted Drewes?");

        String ctd = ap.nextString("Where is the closest Ted Drewes?");

        Double cal = ap.nextDouble("What percentage of calories in vanilla frozen custard come from fat?");

        Double saf = ap.nextDouble("What is the probability that you will see a friend at Ted Drewes?");


        System.out.println("You have been to Ted Drewes " + tD + " time(s).");
        System.out.println("It is " + lc + " that you like frozen custard.");
        System.out.println("You can take " + cs + " people in your car.");
        System.out.println("The price of a small cup of vanilla frozen custard is " + "$" + pc +".");
        System.out.println("Your favorite special offering is " + fs + ".");
        System.out.println("The closest Ted Drewes is at " + ctd + ".");
        System.out.println(cal + "% of calories in vanilla frozen custard come from fat.");
        System.out.println("The probability that you will see a friend is "+ saf + " %.");


    }}