package org.dummy.brms.dummy_brms.exception;

import javax.management.RuntimeErrorException;

public class DummyGenericException extends Exception{


    public DummyGenericException(ErrorCode code){
        super();
    }

    public DummyGenericException(ErrorCode code , String message){
        super(message);
    }


}
