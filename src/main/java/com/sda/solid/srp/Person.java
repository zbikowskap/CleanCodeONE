package com.sda.solid.srp;

/**
 * SRP - Single Responsibility Principle
 * czyli Zasada Pojedynczej Odpowiedzialności
 * lub Pojedynczego Powodu do Zmiany
 *
 * Chodzi o to że klasa jak przechowuje dane to już (raczej)
 * nie powinna udostępniać metod z logiką biznesową
 *
 * lub
 *
 * Klasa nie powinna przechowywać danych z różnych dziedzin (np. Osoba, Adres; z wyjądkiem klas typu DTO)
 *
 * lub
 *
 * Klasa nie powinna udostępniać logiki dla różnych dziedzin (np. Osoba, Faktura)
 */

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Metoda sprawdzająca czy osoba może mieć prawko
     * sprawdza logikę, powinna być poza klasą z danymi
     */
    public boolean canGetDrivingLicense() {
        return age >= 18;
    }

}
