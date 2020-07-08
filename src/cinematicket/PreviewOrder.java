/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicket;

/**
 *
 * @author Oscar
 */
public class PreviewOrder {

    // Here is all my variables that i decided to use to create a PreviewOrder
    private String prevOrderDate;
    private String prevOrderClientName;
    private String prevOrderPrice;
    private String prevOrderMovieName;
    private String prevOrderGenres;
    private String prevOrderNumberOfTickets;

    //Constructor receiving the parameters that i use to create the PreviewOrder
    public PreviewOrder(String prevOrderDate, String prevOrderClientName, String prevOrderMovieName, String prevOrderGenres, String prevOrderNumberOfTickets, String prevOrderPrice) {

        this.prevOrderDate = prevOrderDate;
        this.prevOrderClientName = prevOrderClientName;
        this.prevOrderGenres = prevOrderGenres;
        this.prevOrderMovieName = prevOrderMovieName;
        this.prevOrderPrice = prevOrderPrice;
        this.prevOrderNumberOfTickets = prevOrderNumberOfTickets;
    }

    //empty constructor to let me create a PreviewOrder object without use the parameters
    public PreviewOrder() {

    }

    //getters and setters
    public String getprevOrderClientName() {
        return prevOrderClientName;
    }

    public void setprevOrderClientName(String prevOrderClientName) {
        this.prevOrderClientName = prevOrderClientName;
    }

    public String getprevOrderPrice() {
        return prevOrderPrice;
    }

    public void setprevOrderPrice(String prevOrderPrice) {
        this.prevOrderPrice = prevOrderPrice;
    }

    public String getprevOrderMovieName() {
        return prevOrderMovieName;
    }

    public void setprevOrderMovieName(String prevOrderMovieName) {
        this.prevOrderMovieName = prevOrderMovieName;
    }

    public String getprevOrderGenres() {
        return prevOrderGenres;
    }

    public void setprevOrderGenres(String prevOrderGenres) {
        this.prevOrderGenres = prevOrderGenres;
    }

    public String getPrevOrderNumberOfTickets() {
        return prevOrderNumberOfTickets;
    }

    public void SetPrevOrderNumberOfTickets(String prevOrderNumberOfTickets) {
        this.prevOrderNumberOfTickets = prevOrderNumberOfTickets;
    }

    public String getPrevOrderDate() {
        return prevOrderDate;
    }

    public void setPrevOrderDate(String prevOrderDate) {
        this.prevOrderDate = prevOrderDate;
    }

    //toString method
    @Override
    public String toString() {
        return prevOrderDate + "\n"
                + prevOrderClientName + "\n"
                + prevOrderMovieName + "\n"
                + prevOrderGenres + "\n"
                + prevOrderNumberOfTickets + "\n"
                + prevOrderPrice;

    }
}
