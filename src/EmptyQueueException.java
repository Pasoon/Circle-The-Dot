/**
 * Created by Zarif on 2016-03-26.
 */
public class EmptyQueueException extends RuntimeException {

    public EmptyQueueException(){
        super();
    }

    public EmptyQueueException(String message){
        super(message);
    }

    public EmptyQueueException(String message, Throwable cause ){
        super(message, cause);
    }


}