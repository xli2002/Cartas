package es.ieslavereda.utils;
import java.util.Scanner;

public class Input {
    private static final String YES="Y";
    private static final String NO="N";

    /**
     * Method to get an integer from console
     *
     * @param message to display
     * @return the integer entered
     */
    public static int getInteger(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (!sc.hasNextInt()) {
            System.err.println("Please, enter an integer");
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * Method to get a double from console
     *
     * @param message to display
     * @return the double entered
     */
    public static double getDouble(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (!sc.hasNextDouble()) {
            System.err.println("Please, enter a real number");
            sc.next();
        }
        return sc.nextDouble();
    }

    /**
     * Method to get a String from console
     *
     * @param message to display
     * @return the String entered
     */
    public static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.next();
    }

    public static String getOption(String message){
        String option = getString(message).toUpperCase();
        while (!option.equals(YES)&& !option.equals(NO)){
            option = getString("Just Y and N are valids ").toUpperCase();
        }
        return option;
    }
}
