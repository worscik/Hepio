package app.hepio.CreateGameWebController;

import app.hepio.GameService.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateGameWebController {

    GameService gameService;

    public CreateGameWebController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/createGame")
    public boolean createGame(){
        return gameService.addWords();
    }


}
