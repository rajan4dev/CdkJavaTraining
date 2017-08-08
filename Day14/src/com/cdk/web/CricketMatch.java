package com.cdk.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

public class CricketMatch {
    String country1;
    String country2;
    String Location;
    MatchStatus status;
    String winner;

    @Override
    public String toString() {
        return "CricketMatch{" +
                "country1='" + country1 + '\'' +
                ", country2='" + country2 + '\'' +
                ", Location='" + Location + '\'' +
                ", status=" + status +
                ", winner='" + winner + '\'' +
                '}';
    }

    public CricketMatch(String country1, String country2, String location, MatchStatus status, String winner) {
        this.country1 = country1;
        this.country2 = country2;
        Location = location;
        this.status = status;
        this.winner = winner;
    }

}

enum MatchStatus {
    YET_TO_START, ONGOING, FINISHED
}

enum MatchResult {
    WON, LOST, DRAW
}

enum MatchType {
    ONE_DAY, TEST, T20
}