package com.github.git_leon.person;

/**
 * Created by leon on 8/17/17.
 */
public class PersonFactory {
    public static Person createDefaultActor() {
        String firstName = PersonDataFactory.createUniqueName();
        String lastName = PersonDataFactory.createUniqueName();
        String email = PersonDataFactory.createEmailAddress(firstName, lastName);
        String addressLine1 = PersonDataFactory.createAddressLine();
        String addressLine2 = "";
        String city = "Houston";
        String state = "Texas";
        String zipcode = "77001";
        int socialSecurityNumber = PersonDataFactory.createSocialSecurityNumber();

        return new PersonBuilder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setAddressLine1(addressLine1)
                .setAddressLine2(addressLine2)
                .setCity(city)
                .setState(state)
                .setZipcode(zipcode)
                .setSocialSecurityNumber(socialSecurityNumber)
                .build();
    }
}