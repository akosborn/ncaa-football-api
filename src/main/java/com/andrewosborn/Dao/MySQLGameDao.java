package com.andrewosborn.Dao;

import com.andrewosborn.Entity.Game;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public class MySQLGameDao
{
    private JdbcTemplate jdbcTemplate;

    public static class GameRowMapper implements RowMapper<Game>
    {
        @Override
        public Game mapRow(ResultSet resultSet, int i) throws SQLException
        {
            Game game = new Game();
            game.setId(resultSet.getInt("game_id"));
            game.setQuarter(resultSet.getString("quarter"));
            game.setAwayTeam(resultSet.getString("away_team"));
            game.setAwayScore(resultSet.getInt("away_score"));
            game.setHomeTeam(resultSet.getString("home_team"));
            game.setHomeScore(resultSet.getInt("home_score"));
            game.setLocation(resultSet.getString("location"));
            game.setDate(resultSet.getDate("date"));

            return game;
        }
    }

    /** public Collection<Game> getAllGames()
    {
        final String statement = "SELECT game_id, quarter, away_team, home_team, away_score," +
                "home_score, location, date FROM schedule";
        List<Game> gameList = jdbcTemplate.query(statement, new GameRowMapper());

        return gameList;
    } */

    public Collection<Game> getGamesByDate(Date date)
    {
        final String statement = "SELECT game_id, quarter, away_team, home_team, away_score," +
                "home_score, location, date FROM schedule WHERE date = ?";
        List<Game> gameList = jdbcTemplate.query(statement, new GameRowMapper(), date);

        return gameList;
    }

    public Collection<Game> getGamesByTeamName(String teamName)
    {
        final String statement = "SELECT game_id, quarter, away_team, home_team, away_score," +
                "home_score, location, date FROM schedule WHERE home_team = ? OR away_team = ?";
        List<Game> gameList = jdbcTemplate.query(statement, new GameRowMapper(), teamName, teamName);

        return gameList;
    }

    public Game getGameById(int id)
    {
        final String statement = "SELECT game_id, quarter, away_team, home_team, away_score, " +
                "home_score, location, date FROM schedule WHERE game_id = ?";
        Game game = jdbcTemplate.queryForObject(statement, new GameRowMapper(), id);

        return game;
    }

    // public void removeGameById(int id)

    // public void updateGame(Game game)

    // public void insertGame(Game game)
}
