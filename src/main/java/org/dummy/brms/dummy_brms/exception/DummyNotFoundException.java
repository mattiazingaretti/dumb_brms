package org.dummy.brms.dummy_brms.exception;

public class DummyNotFoundException extends Exception{


    public DummyNotFoundException(ErrorCode code){
        super();
    }

    public DummyNotFoundException(ErrorCode code , String message){
        super(message);
    }


}