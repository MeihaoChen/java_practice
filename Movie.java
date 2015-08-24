class Movie {
    String title;
    String genre;
    int rating;

    void playit() {
        System.out.println("Playing the movie");
    }
}

class MovieTestDrive {
    public static void main (String[] args) {
        Movie one = new Movie();
        one.title = "gone with the wind";
        one.genre = "tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "little forest";
        two.genre = "romantic";
        two.rating = 5;
        two.playit();
    }
}
