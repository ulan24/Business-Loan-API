package com.shinobi.code.exception;

import java.util.UUID;

public class CustomerNotFoundException extends RuntimeException{

    public CustomerNotFoundException(UUID customerId) {
        super("Customer with ID '" + customerId + "' not found.");
    }
}
