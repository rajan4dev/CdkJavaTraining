package assignment1;

/**
 * Created by bhirudr on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) throws InvalidUserRatingException {
        User rajan = new User(1, "rajan", 21, 3);
        User ishan = new User(3, "ishan", 17, 2);

        try {
            MovieService.buy(ishan, 3000.0);
        } catch (InvalidPriceException invalidPriceException) {
            System.out.println(invalidPriceException);
        }

        try {
            MovieService.watch(ishan);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        } catch (InvalidUserRatingException e) {
            System.out.println(e);
        }


    }
}
