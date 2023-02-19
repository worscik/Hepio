package app.hepio.AnswerController;

import org.springframework.stereotype.Component;

@Component
public class AnswerDao {

    String answerForCheck;

    public String getAnswerForCheck() {
        return answerForCheck;
    }

    @Override
    public String toString() {
        return "AnswerDao{" +
                "answerForCheck='" + answerForCheck + '\'' +
                '}';
    }

}
