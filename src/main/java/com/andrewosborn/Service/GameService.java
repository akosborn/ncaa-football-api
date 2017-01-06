package com.andrewosborn.Service;

import com.andrewosborn.Dao.MySQLGameDao;
import com.andrewosborn.Entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Collection;

@Service
public class GameService
{
    @Autowired
    private MySQLGameDao mySQLGameDao;

    public Collection<Game> getAllGames()
    {
        return mySQLGameDao.getAllGames();
    }

    public Collection<Game> getGamesByDate(Date date)
    {
        return mySQLGameDao.getGamesByDate(date);
    }

    public Collection<Game> getGamesByTeamName(String teamName)
    {
        return mySQLGameDao.getGamesByTeamName(teamName);
    }

    public Game getGameById(int id)
    {
        return mySQLGameDao.getGameById(id);
    }

    // public void removeGameById(int id)

    // public void updateGame(Game game)

    // public void insertGame(Game game)
}
