package com.suriya;

import com.FootballPlayer;
import com.League;
import com.Team;

public class Main {

    public static void main(String[] args) {
	// write your code here


        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorne = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorne);
        footballLeague.addTeam(fremantle);

        hawthorne.matchResuls(adelaideCrows, 2,4);
        hawthorne.matchResuls(fremantle, 2,2);
        fremantle.matchResuls(hawthorne, 5 , 1);
        fremantle.matchResuls(melbourne,4,4);



        footballLeague.showLeagueTable();
        

    }
}
