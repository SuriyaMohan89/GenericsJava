package com;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if (league.contains(team)){
            System.out.println("Already exists");
            return false;
        } else {
            league.add(team);
            System.out.println("Successfully added");
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T team : league){
            System.out.println(team.getName() + ":" + team.ranking());

        }
    }
}
