package app.hepio.GameService;

import app.hepio.AppUtils.AppUtils;
import app.hepio.WordsAction.AddWordsService;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

@Service("MainService")
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class GameServiceImpl implements GameService{

    Map<String,String> wordsSetForGame = new HashMap<>();

    AddWordsService addWordsService;

    public GameServiceImpl(AddWordsService addWordsService) {
        this.addWordsService = addWordsService;
    }

    @Override
    public boolean addWords() {
        addWordsService.addWords(wordsSetForGame);
        return true;
    }

    @Override
    public boolean checkAnswer(String answerToCheck) {
        if(wordsSetForGame.containsKey(answerToCheck)) {
            wordsSetForGame.remove(answerToCheck);
            return true;
        }
        return false;
    }


    @Override
    public Map<String, String> listWords() {
        return wordsSetForGame;
    }

    @Override
    public String getRandomWord() {
        return null;
    }

    private int randomNumber(){
        return AppUtils.randomNumber(wordsSetForGame);
    }


}
