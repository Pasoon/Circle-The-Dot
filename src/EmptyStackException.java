/**
 * Created by Zarif on 2016-03-26.
 */
public class EmptyStackException extends RuntimeException {

    public EmptyStackException(){
        super();
    }

    public EmptyStackException(String message){
        super(message);
    }

    public EmptyStackException(String message, Throwable cause ){
        super(message, cause);
    }

}
