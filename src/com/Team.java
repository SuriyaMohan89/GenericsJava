package com;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played;
    int won;
    int lost;
    int tied;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() +" is already in members");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName()+" successfully added");
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }
    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

    public void matchResuls(Team opponent, int outscore, int theirscore){
        String message;
        if(outscore > theirscore){
            won++;
            message = " Victory";
        } else if (outscore == theirscore){
            tied++;
            message = " Draw match with";
        } else {
            lost ++;
            message = " lost to ";
        }
        played++;
        if(opponent != null){
            System.out.println(this.getName()+message+ opponent.getName());
        }

    }
}
