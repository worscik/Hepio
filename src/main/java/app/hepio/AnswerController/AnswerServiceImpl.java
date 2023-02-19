package app.hepio.AnswerController;

import app.hepio.GameService.GameService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("AnswerService")
public class AnswerServiceImpl implements AnswerService {

    GameService gameService;
    Map<String,String> wordsSetForUser;

    public AnswerServiceImpl(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public boolean checkAnswer(AnswerDao answerDao) {
        return gameService.checkAnswer(answerDao.answerForCheck);
    }


}
