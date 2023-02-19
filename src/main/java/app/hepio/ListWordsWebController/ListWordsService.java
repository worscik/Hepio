package app.hepio.ListWordsWebController;

import app.hepio.GameService.GameService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("ListWords")
public class ListWordsService implements ListWords{

    GameService gameService;

    public ListWordsService(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public Map<String, String> list() {
        return gameService.listWords();
    }

}
