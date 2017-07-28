package assignment1;

/**
 * Created by bhirudr on 7/26/2017.
 */
public class InvalidUserRatingException extends Exception {
    InvalidUserRatingException(){}
    InvalidUserRatingException(String message){
        super(message);

    }
}
