package com.simoxcoder.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}