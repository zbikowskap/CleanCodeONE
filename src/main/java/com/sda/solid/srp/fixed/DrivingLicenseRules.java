package com.sda.solid.srp.fixed;

public class DrivingLicenseRules {
    /**
     * Zamiast Magic Number wprowadzamy stałe opisujące swoją nazwą co one oznaczają
     */
    private static final int DRIVING_LICENSE_REQUIRED_AGE = 18;

    public static boolean canGetDrivingLicense(Person person) {
        //return person.getAge() >= 18; // MAGIC NUMBER
        return person.getAge() >= DRIVING_LICENSE_REQUIRED_AGE;
    }
}
