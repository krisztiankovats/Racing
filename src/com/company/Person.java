package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Person {

    String name;
    Boolean areTheySick;
    Sickness sickness;

    public Person(String name, Boolean areTheySick) {
        this.name = name;
        this.areTheySick = areTheySick;
    }

    public Person(String name, Boolean areTheySick, Sickness sickness) {
        this.name = name;
        this.areTheySick = areTheySick;
        this.sickness = sickness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sickness getSickness() {
        return sickness;
    }

    public void setSickness(Sickness sickness) {
        this.sickness = sickness;
    }

    public Boolean getTheySick() {
        return areTheySick;
    }

    public void setTheySick(Boolean theySick, Driver driver) {
        ArrayList<Sickness> sickList = new ArrayList<>();
        sickList.add(Sickness.HANDFELLOFF);
        sickList.add(Sickness.HEADACHE);
        sickList.add(Sickness.STUBBEDTOE);

        if (theySick) {
            Random random = new Random();
            int randomNumber = random.nextInt(sickList.size());
            this.areTheySick = true;
            driver.setSickness(sickList.get(randomNumber));
        } else
            driver.setSickness(Sickness.NOTSICK);
    }
}
