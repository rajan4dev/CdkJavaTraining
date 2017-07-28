package assignment1;

/**
 * Created by bhirudr on 7/26/2017.
 */
public class MovieService {
    static void buy(User user, double price) throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException("Invalid Price");
        } else if (price < 2000.00) {
            throw new InvalidPriceException("Price should be above 2000Rs");
        } else {
            System.out.println("Enjoy the movie...");
        }

    }

    static void watch(User user) throws InvalidAgeException, InvalidUserRatingException {
        if (user.age < 0) {
            throw new InvalidAgeException("Invalid Age");
        } else if (user.age < 10) {
            throw new InvalidAgeException("Age must be greater than 10 to watch this movie");
        } else if (user.age < 20) {
            throw new InvalidAgeException("Age must be greater than 20 to watch this movie");
        }

        if (user.rating < 3) {
            throw new InvalidUserRatingException("Rating too low");
        } else
            System.out.println("user " + user + " can enjoy movie with popcorn");
    }

}
