/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicket;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class CinemaTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //here are my objects
        SetUp set = new SetUp();
        Movies m = new Movies();
        Menu menu = new Menu();
        Logic logic = new Logic();
        Scanner askUser = new Scanner(System.in);

        //creating the arrays and arraylist
        ArrayList<Movies> movieList = new ArrayList();
        ArrayList<PreviewOrder> prevOrderList = new ArrayList();

        //Creating the movie list  and the preview orders
        movieList = set.Movies(movieList);
        prevOrderList = set.PrevOrders(prevOrderList);

        int option;

        System.out.println("---CCTCinema---");
        System.out.println("Welcome to our system, what is your name?");
        String Name = askUser.next();

        //Asking the costumer`s name to keep it saved
        logic.costumerName = Name;

        //using a do/while loop to keeping calling the menu every time the client finish a task.
        do {
            System.out.println("--------------------------------------------");

            System.out.println("Hello " + Name + ",please chose one of the option below:");
            System.out.println("1- To see all movies");
            System.out.println("2- To creat order");
            System.out.println("3- To see your preview orders");
            System.out.println("4- To exit");
            System.out.println("--------------------------------------------");

            option = logic.readInteger();
            //calling my menu class
            menu.CinemaMenu(option, movieList, 0, 0, prevOrderList, Name);
        } while (option >= 0);

    }

}
