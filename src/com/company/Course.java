package com.company;

import java.util.*;

public class Course {

    final Team teamMario = new Team(
            new Driver("Mario", false, Sickness.NOTSICK),
            new Engineer("Eng1", false),
            new Mechanic("Mech1", false),
            new Coordinator("Coor1", false),
            new Car("Mushroom Drive", false),
            0);

    final Team teamLuigi = new Team(
            new Driver("Luigi", false, Sickness.NOTSICK),
            new Engineer("Eng2", false),
            new Mechanic("Mech2", false),
            new Coordinator("Coor2", false),
            new Car("Luigi's Mansion", false),
            0);

    final Team teamPeach = new Team(
            new Driver("Peach", false, Sickness.NOTSICK),
            new Engineer("Eng3", false),
            new Mechanic("Mech3", false),
            new Coordinator("Coor3", false),
            new Car("The Princess", false),
            0);

    final Team teamDaisy = new Team(
            new Driver("Daisy", false, Sickness.NOTSICK),
            new Engineer("Eng4", false),
            new Mechanic("Mech4", false),
            new Coordinator("Coor4", false),
            new Car("Flower Power", false),
            0);

    final List<Team> racers = new ArrayList<>();


    public List<Team> getRacers() {
        racers.add(0, teamMario);
        racers.add(1, teamLuigi);
        racers.add(2, teamPeach);
        racers.add(3, teamDaisy);

        return racers;
    }

    public void curse() {
        Random random = new Random();
        int randomRacer = random.nextInt(racers.size());

        carOrDriverWrong(racers.get(randomRacer));
        deleteAPlayer(racers);
    }

    public void carOrDriverWrong(Team team) {

        Random random = new Random();
        int randomNumer = random.nextInt(2);

        if (randomNumer == 0) {
            team.car.setDamaged(true);
        }
        if (randomNumer == 1) {
            team.driver.setTheySick(true, team.getDriver());
        }
    }


    public void Racing(List<Team> racers) {

        curse();

        for (int i = 0; i < 8; i++) {
            oneRound(racers);
        }

        maxSearch(racers);

        for (int i = 0; i < racers.size(); i++) {
            if (racers.get(i).getScore() == maxSearch(racers)) {
                System.out.println(racers.get(i).getDriver().name + " WON!");
                System.out.println("SCORE: " + racers.get(i).getScore());
            }
        }
    }

    private void oneRound(List<Team> racers) {

        Random random = new Random();
        int randomNumer = random.nextInt(racers.size());

        if (randomNumer == 0) {
            racers.get(0).score++;
        }
        if (randomNumer == 1) {
            racers.get(1).score++;
        }
        if (randomNumer == 2) {
            racers.get(2).score++;
        }
        if (randomNumer == 3) {
            racers.get(3).score++;
        }

    }

    private int maxSearch(List<Team> racers) {

        int max = Integer.MIN_VALUE;

        for (Team racer : racers) {
            if (racer.getScore() > max) {
                max = racer.getScore();
            }
        }
        return max;

    }

    private void deleteAPlayer(List<Team> racers) {
        for (int i = 0; i < racers.size(); i++) {
            if (racers.get(i).getDriver().getTheySick() || racers.get(i).getCar().getDamaged()) {
                racers.remove(racers.get(i));
            }
        }
    }
}
