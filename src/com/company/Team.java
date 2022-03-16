package com.company;

public class Team {

    Driver driver;
    Engineer engineer;
    Mechanic mechanic;
    Coordinator coordinator;
    Car car;
    Integer score;

    public Team(Driver driver, Engineer engineer, Mechanic mechanic, Coordinator coordinator, Car car, Integer score) {
        this.driver = driver;
        this.engineer = engineer;
        this.mechanic = mechanic;
        this.coordinator = coordinator;
        this.car = car;
        this.score = score;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engineer getEngineer() {
        return engineer;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public Coordinator getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
