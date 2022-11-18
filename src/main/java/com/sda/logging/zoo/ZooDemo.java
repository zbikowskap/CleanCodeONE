package com.sda.logging.zoo;

import org.apache.log4j.Logger;

import java.util.List;

public class ZooDemo {
    private static final Logger LOGGER = Logger.getLogger(ZooDemo.class);

    public static void main(String[] args) {
        Animal animal1 = new Animal("Kobra królewska");
        Animal animal2 = new Animal("Lew");
        Animal animal3 = new Animal("Nosorożec czarny");
        Animal animal4 = new Animal("Lampart");
        List<Animal> initialAnimals = List.of(animal1, animal2, animal3, animal4);
        ZooService zooService = new ZooService(initialAnimals);
        ZooController zooController = new ZooController(zooService);

        LOGGER.info("===================");

        LOGGER.info(zooController.getAnimalsInfo());
    }
}
