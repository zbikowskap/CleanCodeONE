package com.sda.solid.srp.fixed;

import java.util.List;

public class SrpDemo {
    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski");
        Person person2 = new Person("Adam", "Nowak");
        Person person3 = new Person("Maria", "Guzy");
        Person person4 = new Person("Natalia", "Romaszowska");
        person1.setAge(17);
        person2.setAge(45);
        person3.setAge(22);
        person4.setAge(15);

        if(DrivingLicenseRules.canGetDrivingLicense(person1)) {
            System.out.println(person1.getSurname() + " " + person1.getName() + " can have driving license");
        } else {
            System.out.println(person1.getSurname() + " " + person1.getName() + " is to young");
        }

        List<Person> people = List.of(person1, person2, person3, person4);
        people.stream()
                .filter(DrivingLicenseRules::canGetDrivingLicense)
                .forEach(x -> System.out.println(x.getName() + " " + x.getSurname() + " can get driving license"));
    }
}
