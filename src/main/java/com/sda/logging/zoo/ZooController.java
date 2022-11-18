package com.sda.logging.zoo;

import org.apache.log4j.Logger;

import java.util.List;

public class ZooController {
    private static final Logger LOGGER = Logger.getLogger(ZooController.class);

    private ZooService zooService;

    public ZooController(ZooService zooService) {
        LOGGER.info("Initializing ZooController");
        this.zooService = zooService;
    }

    public List<Animal> getAnimals() {
        LOGGER.info("Trying to get list of animals");
        return zooService.getAllAnimals();
    }

    public List<String> getAnimalsInfo() {
        LOGGER.info("Retrieving info for all animals");
        return zooService.getAllAnimalsInfo();
    }
}
