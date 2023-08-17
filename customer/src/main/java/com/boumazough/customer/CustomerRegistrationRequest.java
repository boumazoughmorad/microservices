package com.boumazough.customer;

public record CustomerRegistrationRequest (
        String firstName,
        String lastName,
        String email){

}
