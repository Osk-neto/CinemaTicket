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
public class Movies {

    // Here is all my variables that i decided to use to create a Movie 
    private String name;
    private String runningTime;
    private String director;
    private String genres;
    private String starring;
    private String time;
    private int idMovie;
    private String date;
    int moviePrice;

    //Constructor receiving the parameters that i use to create the Movie,
    public Movies(String name, String runningTime, String time, String starring, String director, String genrs, int moviePrice) {

        this.name = name;
        this.time = time;
        this.runningTime = runningTime;
        this.director = director;
        this.genres = genrs;
        this.starring = starring;
        this.moviePrice = moviePrice;
    }
    
    //empty constructor to let me create a movie object without use the parameters
    public Movies() {

    }
    
     //getters and setters
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getStarring() {
        return starring;
    }

    public void setStarring(String starring) {
        this.starring = starring;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        this.moviePrice = moviePrice;
    }
    
    //toString method
    @Override
    public String toString() {
        return "Movie: " + name + "\n"
                + "RunningTime: " + runningTime + "\n"
                + "Time: " + time + "\n"
                + "Starring: " + starring + "\n"
                + "Director: " + director + "\n"
                + "Genres: " + genres + "\n"
                + moviePrice + "€";

    }
}
