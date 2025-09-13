package com.example.demo.controller;

import com.example.demo.model.GameModel;
import com.example.demo.repository.GameRepository;
import com.example.demo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping("gamelist")
    public List<GameModel> getGameList() {
        return gameService.getGame();
    }

    @GetMapping("game/{gameName}")
    public GameModel getGameById(@PathVariable String gameName) {
        return gameService.getGameByName(gameName);
    }

    @PostMapping("/game")
    public List<GameModel> addGame(@RequestBody GameModel gameModel) {
        return gameService.postGame(gameModel);
    }

    @DeleteMapping("game/{gameName}")
    public Map<String, String> deleteGameByName(@PathVariable String gameName) {
        return gameService.deleteGame(gameName);
    }

    @PatchMapping("game/{gameName}")
    public List<GameModel> updateGame(@PathVariable String gameName, @RequestBody GameModel gameModel) {
//        System.out.println(gameModel);
        return gameService.updateGame(gameName,gameModel);
    }

    @PutMapping("game/{gameName}")
    public List<GameModel> updateGameDetails(@PathVariable String gameName,@RequestBody GameModel gameModel) {
        return gameService.updateGameDetails(gameName,gameModel);
    }
}
