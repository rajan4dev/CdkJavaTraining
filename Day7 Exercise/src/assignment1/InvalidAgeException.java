package assignment1;

/**
 * Created by bhirudr on 7/26/2017.
 */
public class InvalidAgeException extends Exception{
    InvalidAgeException(){

    }
    InvalidAgeException(String message){
        super(message);
    }
}
