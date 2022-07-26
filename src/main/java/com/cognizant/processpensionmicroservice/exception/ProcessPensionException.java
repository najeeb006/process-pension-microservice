package com.cognizant.processpensionmicroservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProcessPensionException extends RuntimeException {


    private static final long serialVersionUID = 210649836231358204L;
    private String message;

}