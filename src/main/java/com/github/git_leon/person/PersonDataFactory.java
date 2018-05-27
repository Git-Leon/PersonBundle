package com.github.git_leon.person;

import com.github.git_leon.RandomUtils;
import com.github.git_leon.StringUtils;

/**
 * Created by leon on 8/17/17.
 */
public class PersonDataFactory {
    public static Integer createSocialSecurityNumber() {
        return RandomUtils.createInteger(10000000, 999999999);
    }

    public static String createUniqueName() {
        String name = StringUtils.getAlphaValue(System.nanoTime());
        return StringUtils.capitalizeFirstChar(name);
    }

    public static String createAddressLine() {
        return String.format("%s %s Rd", createUniqueName(), createUniqueName());
    }

    public static String createEmailAddress(String firstName, String lastName) {
        String milliseed = Long.toString(System.currentTimeMillis());
        return String.format("%s.%s_%s@pobox.com", firstName, lastName, milliseed);
    }
}
