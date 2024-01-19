import java.util.List;
import java.util.ArrayList;

class Movie {
    private String title;
    private String genre;
    private int price;
    private boolean available;

    public Movie(String title, String genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean available) {
        this.available = available;
    }
}

class User {
    private String username;
    private boolean isSubscriber;
    private int credits;

    public User(String username) {
        this.username = username;
        this.isSubscriber = false;
        this.credits = 0;
    }

    public void rentMovie(Movie movie) {
        if (isSubscriber && movie.isAvailable()) {
            // Kredi kontrolü ve film kiralama işlemleri
            System.out.println(username + " rented the movie: " + movie.getTitle());
            movie.setAvailability(false);
        } else {
            System.out.println("Movie not available or user is not a subscriber.");
        }
    }

    public void buyMovie(Movie movie) {
        // Film satın alma işlemleri
        System.out.println(username + " bought the movie: " + movie.getTitle());
    }

    public void requestMovie(String title) {
        // Film talep etme işlemleri
        System.out.println(username + " requested the movie: " + title);
    }

    public void subscribe(int credits) {
        // Abonelik işlemleri
        this.isSubscriber = true;
        this.credits += credits;
        System.out.println(username + " subscribed with " + credits + " credits.");
    }
}

class MovieApp {
    private List<Movie> movies;
    private List<User> users;

    public MovieApp() {
        this.movies = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public List<Movie> searchMovies(String keyword) {
        // Film arama işlemleri
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }

    public void rentMovie(User user, Movie movie) {
        user.rentMovie(movie);
    }

    public void buyMovie(User user, Movie movie) {
        user.buyMovie(movie);
    }

    public void requestMovie(User user, String title) {
        user.requestMovie(title);
    }

    public void subscribe(User user, int credits) {
        user.subscribe(credits);
    }
}

public class Main {
    public static void main(String[] args) {
        MovieApp movieApp = new MovieApp();

        Movie movie1 = new Movie("Inception", "Sci-Fi", 10);
        Movie movie2 = new Movie("The Shawshank Redemption", "Drama", 8);
        Movie movie3 = new Movie("The Dark Knight", "Action", 12);

        movieApp.searchMovies("Inception");

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        movieApp.subscribe(user1, 20);

        movieApp.rentMovie(user1, movie1);
        movieApp.rentMovie(user2, movie2);

        movieApp.buyMovie(user1, movie3);

        movieApp.requestMovie(user2, "Interstellar");
    }
}
