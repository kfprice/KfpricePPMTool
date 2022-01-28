package com.kfprice.ppmtool.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ProjectNotFoundException extends RuntimeException{
    public ProjectNotFoundException(String message) {
        super(message);
    }
}
