package com.company;

public class Car {

    String carName;
    Boolean isItDamaged;

    public Car(String carName, Boolean isItDamaged) {
        this.carName = carName;
        this.isItDamaged = isItDamaged;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Boolean getDamaged() {
        return isItDamaged;
    }

    public void setDamaged(Boolean damaged) {
        isItDamaged = damaged;
    }
}
