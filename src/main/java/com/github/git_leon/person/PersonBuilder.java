package com.github.git_leon.person;

/**
 * Created by leon on 8/17/17.
 */
public class PersonBuilder {
    private String firstName;
    private String lastName;
    private String email;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;
    private int socialSecurityNumber;

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public PersonBuilder setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public PersonBuilder setZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public PersonBuilder setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        return this;
    }

    public Person build() {
        return new Person(firstName, lastName, email, addressLine1, addressLine2, city, state, zipcode, socialSecurityNumber);
    }
}
