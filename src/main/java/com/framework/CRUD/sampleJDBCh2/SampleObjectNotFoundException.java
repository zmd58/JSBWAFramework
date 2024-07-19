package com.framework.CRUD.sampleJDBCh2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SampleObjectNotFoundException extends RuntimeException {
    public SampleObjectNotFoundException() {
        super("Object Not Found");
    }
}
