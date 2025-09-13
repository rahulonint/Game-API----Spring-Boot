package com.example.demo.repository;

import com.example.demo.model.GameModel;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class GameRepository {
    List<GameModel> gameList =  new ArrayList<>(Arrays.asList(
            new GameModel(1, "Valorant", "A fast-paced tactical FPS game developed by Riot Games."),
            new GameModel(2, "Minecraft", "A sandbox game where players can build, explore, and survive in blocky worlds."),
            new GameModel(3, "The Witcher 3: Wild Hunt", "An open-world RPG with rich storytelling and monster hunting."),
            new GameModel(4, "Call of Duty: Modern Warfare II", "A first-person shooter featuring intense multiplayer and campaign missions."),
            new GameModel(5, "FIFA 23", "A football simulation game offering realistic gameplay and tournaments."),
            new GameModel(6, "Among Us", "A multiplayer social deduction game about teamwork and betrayal."),
            new GameModel(7, "Grand Theft Auto V", "An open-world action-adventure game with heists, missions, and online play."),
            new GameModel(8, "Elden Ring", "A dark fantasy action RPG with vast open-world exploration and challenging bosses."),
            new GameModel(9, "PUBG: Battlegrounds", "A battle royale game where players fight to be the last one standing."),
            new GameModel(10, "League of Legends", "A multiplayer online battle arena (MOBA) game with strategic 5v5 matches.")
    ));

    public List<GameModel> getGameList() {
        return gameList;
    }

    public GameModel getGameByName(String gameName) {
        for (GameModel gameModel : gameList) {
            if (gameModel.getName().equalsIgnoreCase(gameName)) {
                System.out.println(gameModel.getId());
                return gameModel;
            }
        }
        return null;
    }

    public List<GameModel> postGame(GameModel gameModel) {
        gameList.add(gameModel);
        return getGameList();
    }

    public Map<String, String> deleteGame(String gameName) {
        boolean remove = gameList.remove(getGameByName(gameName));
        Map<String, String> map = new HashMap<>();
        if (remove) {
            map.put("status", "success");
            map.put("message", "Game has been deleted");
            return map;
        }
        map.put("message","No data found");
        return map;
    }

    public List<GameModel> updateGame(String gameName,GameModel gameModel) {
        GameModel game = getGameByName(gameName);
        if(gameModel.getId() != 0){
        game.setId(gameModel.getId());
        }
        if(gameModel.getName() != null && !gameModel.getName().isEmpty()){
            game.setName(gameModel.getName());
        }
        if(gameModel.getDescription() != null && !gameModel.getDescription().isEmpty()){
            game.setDescription(gameModel.getDescription());
        }

        return gameList;
    }

    public List<GameModel> updateGameDetails(String gameName, GameModel gameModel) {
        GameModel game = getGameByName(gameName);
        game.setId(gameModel.getId());
        game.setName(gameModel.getName().substring(0,1).toUpperCase()+gameModel.getName().substring(1).toLowerCase());
        game.setDescription(gameModel.getDescription());
        return gameList;
    }
}
