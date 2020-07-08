/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicket;

import java.util.Date;

/**
 *
 * @author Oscar
 */
public class Order {

    // Here is all my variables that i decided to use to create a Order
    private Date date;
    private String clientName;
    private double price;
    private String movieName;
    private String genres;
    private int numberOfTickets;

    //Constructor receiving the parameters that i use to create the Order
    public Order(Date date, String clientName, double price, String movieName,  String genres, int numberOfTickets) {

        this.date = date;
        this.clientName = clientName;
        this.genres = genres;
        this.movieName = movieName;
        this.price = price;
        this.numberOfTickets = numberOfTickets;
    }

    //empty constructor to let me create a Order object without use the parameters
    public Order() {

    }

    //getters and setters
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //toString method
    @Override
    public String toString() {
        return "Date: " + date + "\n"
                + "Costumer: " + clientName + "\n"
                + "Movie: " + movieName + "\n"
                + "Genre: " + genres + "\n"
                + "Number of tickts: " + numberOfTickets + "\n"
                + "price: " + price;

    }

}
