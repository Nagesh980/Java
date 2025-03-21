enum Movie {
    LEO,
    VIKRAM,
    JAILER,
    PS1,
    MASTER;
}

public class MovieInfo {
    public static void main(String[] args) {
        Movie selectedMovie = Movie.VIKRAM;
        
        String directorName = getDirectorByMovie(selectedMovie);
        
        System.out.println("Movie: " + selectedMovie);
        System.out.println("Director: " + directorName);
    }

    public static String getDirectorByMovie(Movie movie) {
        if (movie == Movie.LEO) {
            return "Lokesh Kanagaraj";
        } else if (movie == Movie.VIKRAM) {
            return "Lokesh Kanagaraj";
        } else if (movie == Movie.JAILER) {
            return "Nelson Dilipkumar";
        } else if (movie == Movie.PS1) {
            return "Mani Ratnam";
        } else if (movie == Movie.MASTER) {
            return "Lokesh Kanagaraj";
        } else {
            return "Unknown Director";
        }
    }
}