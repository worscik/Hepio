package app.hepio.GameService;

import java.util.Map;

public interface GameService {

    boolean addWords();

    boolean checkAnswer(String answer);

    Map<String,String> listWords();

    String getRandomWord();

}
