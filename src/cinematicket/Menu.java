/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicket;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class Menu {

    //instantiating the Logic class to call the methods from there
    Logic logic = new Logic();

    //method used to creat the menu using the switch/case to let the client chose the option that he want
    public void CinemaMenu(int option, ArrayList<Movies> movieList, int price, int age, ArrayList<PreviewOrder> prevOrderList, String costumerName) {

        switch (option) {

            case 1:
                logic.allMovies(movieList);
                break;
            case 2:
                logic.creatOrder(movieList, price, age, costumerName);
                break;
                
            //this case will print all preview orther that the client made before,
            //the current order that the client made will be in his preview order just when he quit the program. 
            case 3:
                logic.previewOrder(prevOrderList, costumerName);
                break;

            case 4:

                logic.exitProgram(costumerName);
                break;

            default:
                System.out.println("--------------------------------------------");

                System.out.println("Invalid option, please chose another option");

        }
    }

}
