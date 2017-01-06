package com.andrewosborn.Entity;

import java.sql.Date;

public class Game
{
    private int id;
    private String quarter;
    private String awayTeam;
    private String homeTeam;
    private int awayScore;
    private int homeScore;
    private String location;
    private Date date;

    public Game(int id, String quarter, String awayTeam, String homeTeam,
                int awayScore, int homeScore, String location, Date date)
    {
        this.id = id;
        this.quarter = quarter;
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.awayScore = awayScore;
        this.homeScore = homeScore;
        this.location = location;
        this.date = date;
    }

    public Game() {}

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getQuarter()
    {
        return quarter;
    }

    public void setQuarter(String quarter)
    {
        this.quarter = quarter;
    }

    public String getAwayTeam()
    {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam)
    {
        this.awayTeam = awayTeam;
    }

    public String getHomeTeam()
    {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam)
    {
        this.homeTeam = homeTeam;
    }

    public int getAwayScore()
    {
        return awayScore;
    }

    public void setAwayScore(int awayScore)
    {
        this.awayScore = awayScore;
    }

    public int getHomeScore()
    {
        return homeScore;
    }

    public void setHomeScore(int homeScore)
    {
        this.homeScore = homeScore;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
}
