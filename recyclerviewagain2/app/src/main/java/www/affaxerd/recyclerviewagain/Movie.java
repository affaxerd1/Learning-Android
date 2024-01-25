package www.affaxerd.recyclerviewagain;

public class Movie {
//STEP 5: CREATE 3 STRINGS

    private String title, genre, date;

//STEP 6: CREATE A CONSTRUCTOR: both parametized and non-parametized
    public Movie(String title, String genre, String date) {
        this.title = title;
        this.genre = genre;
        this.date = date;
    }

    public Movie(){

    }

//STEP 7: GET THE GETTERS AND SETTERS

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
