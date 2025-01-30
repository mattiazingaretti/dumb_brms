package org.dummy.brms.dummy_brms.exception;

public class DummyBadRequestException extends Throwable {


    public DummyBadRequestException(ErrorCode code){
    }

    public DummyBadRequestException(ErrorCode code , String message){
        super(message);
    }

}
