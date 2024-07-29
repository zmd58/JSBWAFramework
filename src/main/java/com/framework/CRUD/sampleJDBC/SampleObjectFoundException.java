package com.framework.CRUD.sampleJDBC;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * Custom exception to better fit with specific error
 * including appropriate HttpStatus update
 *
 * In case of object is found then applies the necessary logic
 *
 */
@ResponseStatus(HttpStatus.FOUND)
public class SampleObjectFoundException extends RuntimeException {
    public SampleObjectFoundException() {
        super("Object already existed");
    }
}
