/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicket;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Logic {

    //creating the PreviewOrder object
    PreviewOrder prev = new PreviewOrder();
    //creating the objects to get imput from the client,
    Scanner askUser = new Scanner(System.in);
    //instantiating the  date class
    Date date = new Date();
    //instantiating the  DecimalFormat class
    DecimalFormat decimalFormat = new DecimalFormat();
    //instantiating the  SimpleDateFormat class
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    //instantiating the PrintWriter class
    PrintWriter writer;

    String costumerName;

    //method used to dont let the program crash if the client use String as a imput.
    public int readInteger() {

        boolean read = false;
        int intVal = 0;

        while (!read) {
            try {
                intVal = askUser.nextInt();
                read = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please, insert a valid number.");
                askUser.next();
            }
        }
        return intVal;
    }

    //method used to dont let the client go forward if the try to use a empty imput or null.
    public String readString() {

        boolean read = false;
        String strVal = null;

        while (strVal == null || strVal.isEmpty()) {
            try {
                strVal = askUser.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please, insert a valid entry.");
                askUser.next();
            }
        }
        return strVal;
    }

    //method used to print all Movies
    public void allMovies(ArrayList<Movies> movieList) {

        for (Movies element : movieList) {

            System.out.println(element.toString());
            System.out.println("--------------------------------------------");

        }
    }

    //method used to let the client creat a Order with how many ticket the client wish, getting the final price of the order.
    //ater the order is created is stored in a text file called Orders.txt.
    public void creatOrder(ArrayList<Movies> movieList, int price, int age, String costumerName) {

        //movie name
        Movies[] currentMovie = new Movies[1];
        System.out.println("These are the movies that are currently playing ");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < movieList.size(); i++) {

            System.out.println((i + 1) + "-" + movieList.get(i).getName());
            System.out.println("--------------------------------------------");

        }
        System.out.println("What movie do you want to see??");

        int userMovie;
        int index = 0;
        do {
            userMovie = readInteger();
            if (userMovie > 0 && userMovie <= movieList.size()) {
                index = (userMovie - 1);
                break;
            } else if (userMovie > movieList.size() || userMovie < 1) {
                System.out.println("insert a valid option");
            }
        } while (userMovie > movieList.size() || userMovie < 1);
        currentMovie[0] = movieList.get(index);

        //ticket
        double finalPrice = 0;
        double ticketPrice = 0;

        int countTickets;
        int tempPrice1 = currentMovie[0].getMoviePrice();
        int age1;
        System.out.println("--------------------------------------------");

        System.out.println("How many tickets do you want?");
        int userTickts = readInteger();
        for (countTickets = 0; countTickets < userTickts; countTickets++) {
            System.out.println("--------------------------------------------");

            System.out.println("How old is customer number " + (countTickets + 1) + " ?");
            age1 = readInteger();

            if (age1 > 0 && age1 <= 12) {
                ticketPrice = tempPrice1 - (tempPrice1 * 0.4);
            } else if (age1 >= 13 && age1 <= 64) {
                ticketPrice = tempPrice1;
            } else if (age1 > 64) {
                ticketPrice = tempPrice1 - (tempPrice1 * 0.2);
            }

            finalPrice = finalPrice + ticketPrice;
            

        }
        dateFormat.format(date);
        
        System.out.println("--------------------------------------------");

        System.out.println("this is the value of your order: " + decimalFormat.format(finalPrice) + "€");
        Order order = new Order(date, costumerName, finalPrice, currentMovie[0].getName(), currentMovie[0].getGenres(), userTickts);

        try {
            BufferedWriter myWriter = new BufferedWriter(new FileWriter("Orders.txt", true));

            myWriter.write(order.toString() + "\n");
            myWriter.close();
        } catch (Exception e) {
            System.out.println("Error");
            System.exit(1);
        }
    }

    //method used to print all the preview orders that is stored in the Orders.txt file
    //used a for looping to check the name of every index to check if is match with the current costumer name.
    public void previewOrder(ArrayList<PreviewOrder> prevOrderList, String costumerName) {

        System.out.println("Your previews orders:");

        for (int i = 0; i < prevOrderList.size(); i++) {

            if (prevOrderList.get(i).toString().toLowerCase().contains(costumerName.toLowerCase())) {
                System.out.println("--------------------------------------------");

                System.out.println(prevOrderList.get(i).toString());
            }
        }

    }

    //method used to exit the program asking to the client if he is sure about to quit.
    public void exitProgram(String costumerName) {
        System.out.println("--------------------------------------------");
        System.out.println(costumerName + ", are you sure you have finished? -- (Yes/No)");
        String answer = askUser.nextLine();
        while (!answer.equalsIgnoreCase("yes") || !answer.equalsIgnoreCase("No")) {
            if (answer.equalsIgnoreCase("yes")) {
                System.exit(0);
            } else if (answer.equalsIgnoreCase("No")) {
                break;
            } else {
                System.out.println("--------------------------------------------");

                System.out.println("Please insert a valid answer");
                answer = askUser.nextLine();
            }
        }
    }
}
