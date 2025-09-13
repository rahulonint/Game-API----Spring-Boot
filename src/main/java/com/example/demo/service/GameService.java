package com.example.demo.service;

import com.example.demo.model.GameModel;
import com.example.demo.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameModel> getGame(){
         return gameRepository.getGameList();
    }

    public GameModel getGameByName(String gameName){
        return gameRepository.getGameByName(gameName);
    }

    public List<GameModel> postGame(GameModel gameModel) {
        return gameRepository.postGame(gameModel);
    }

    public Map<String, String> deleteGame(String gameName) {
        return gameRepository.deleteGame(gameName);
    }

    public List<GameModel> updateGame(String gameName,GameModel gameModel) {
        return gameRepository.updateGame(gameName,gameModel);
    }

    public List<GameModel> updateGameDetails(String gameName, GameModel gameModel) {
        return gameRepository.updateGameDetails(gameName,gameModel);
    }
}
