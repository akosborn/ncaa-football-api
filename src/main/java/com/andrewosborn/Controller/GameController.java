package com.andrewosborn.Controller;

import com.andrewosborn.Entity.Game;
import com.andrewosborn.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Collection;

// Handles HTTP methods
@RestController
@RequestMapping("/games")
public class GameController
{
    @Autowired
    private GameService gameService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Game> getAllGames()
    {
        return gameService.getAllGames();
    }

    @RequestMapping(value ="/date/{date}", method = RequestMethod.GET)
    public Collection<Game> getGamesByDate(@PathVariable("date") Date date)
    {
        return gameService.getGamesByDate(date);
    }

    @RequestMapping(value = "/teams/{team}", method = RequestMethod.GET)
    public Collection<Game> getGamesByTeamName(@PathVariable("team") String teamName)
    {
        // Parse underscores
        if (teamName.contains("_"))
            teamName = teamName.replaceAll("_", " ");
        return gameService.getGamesByTeamName(teamName);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Game getGameById(@PathVariable("id") int id)
    {
        return gameService.getGameById(id);
    }

    // public void removeGameById(int id)

    // public void updateGame(Game game)

    // public void insertGame(Game game)
}
