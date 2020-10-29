package com.thamirestissot.assembly.exception;

public class UserAlreadyVotedException extends RuntimeException {
    public UserAlreadyVotedException() {
        super("This user has already voted.");
    }
}
