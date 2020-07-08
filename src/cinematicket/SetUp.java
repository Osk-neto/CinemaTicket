/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicket;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class SetUp {

    //creating the ArrayList that is going to be used to take the movies from a file.
    ArrayList<Movies> movieList = new ArrayList();
    ArrayList<PreviewOrder> prevOrderList = new ArrayList();

    //method used to creat the List of movies , storing all movies in the arrayList
    //Getting all movies from the MoviesList.txt
    //Try/catch used to retrieve data from the file, and while loop to creat a list of movies
    public ArrayList<Movies> Movies(ArrayList<Movies> movieList) {

        try {

            Scanner myScanner = new Scanner(new File("MovieList.txt"));

            while (myScanner.hasNext()) {

                String name = myScanner.nextLine();
                String runningTime = myScanner.nextLine();
                String time = myScanner.nextLine();

                String starring = myScanner.nextLine();
                String director = myScanner.nextLine();
                String geners = myScanner.nextLine();
                String tempPrice = myScanner.nextLine();
                int moviePrice = Integer.parseInt(tempPrice);
                Movies currentMovie = new Movies(name, runningTime, time, starring, director, geners, moviePrice);

                movieList.add(currentMovie);
            }
        } catch (Exception e) {
            System.out.println("That file does not exist!!");
            System.exit(1);
        }

        return movieList;
    }

    //method used to creat the List of PreviewOrders , storing all Orthers in the arrayList
    //Getting all Orthers from the Orders.txt
    //Try/catch used to retrieve data from the file, and while loop to creat a list of orthers
    public ArrayList<PreviewOrder> PrevOrders(ArrayList<PreviewOrder> prevOrderList) {

        try {

            Scanner myScanner = new Scanner(new File("Orders.txt"));

            while (myScanner.hasNext()) {
                String date = myScanner.nextLine();
                String clientName = myScanner.nextLine();
                String movieName = myScanner.nextLine();
                String genres = myScanner.nextLine();
                String numberOfTickets = myScanner.nextLine();
                String price = myScanner.nextLine();

                PreviewOrder currentPrevOrder = new PreviewOrder(date, clientName, movieName, genres, numberOfTickets, price);

                prevOrderList.add(currentPrevOrder);

            }
        } catch (Exception e) {
            System.out.println("That file does not exist!!");
            System.exit(1);
        }

        return prevOrderList;
    }
}
