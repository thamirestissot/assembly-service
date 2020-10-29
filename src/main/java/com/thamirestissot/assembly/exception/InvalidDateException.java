package com.thamirestissot.assembly.exception;

public class InvalidDateException extends RuntimeException {
    public InvalidDateException() {
        super("A data fornecida não é válida.");
    }
}
