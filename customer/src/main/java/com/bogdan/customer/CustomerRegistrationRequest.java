package com.bogdan.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
