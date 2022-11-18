package com.sda.logging.zoo;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

class ZooService {

    private static final Logger LOGGER = Logger.getLogger(ZooService.class);

    private List<Animal> zooAnimals;

    ZooService(List<Animal> zooAnimals) {
        LOGGER.info("Initialization of ZooService class");
        this.zooAnimals = zooAnimals;
    }

    List<Animal> getAllAnimals() {
        LOGGER.info("Request to retrieve all animals");
        return zooAnimals;
    }

    List<String> getAllAnimalsInfo() {
        LOGGER.info("Request to retrieve all animals info");
        return zooAnimals.stream()
                .map(Animal::getAnimalInfo)
                .collect(Collectors.toList());
    }
}
