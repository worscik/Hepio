package app.hepio.ListWordsWebController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ListWordsWebController {

    ListWords listWords;

    public ListWordsWebController(ListWords listWords) {
        this.listWords = listWords;
    }

    @GetMapping("/listWords")
    public Map<String,String> listWords(){
        return listWords.list();
    }

}
