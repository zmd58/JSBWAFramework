package com.framework.CRUD.sampleJDBC;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * Custom exception to better fit with specific error
 * including appropriate HttpStatus update
 *
 * In case of object is not found then applies the necessary logic
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class SampleObjectNotFoundException extends RuntimeException {
    public SampleObjectNotFoundException() {
        super("Object Not Found");
    }
}
