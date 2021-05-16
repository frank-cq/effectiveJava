package sug05;

import java.util.List;
import java.util.Objects;

/**
 * @author qchen
 * @date 2021/5/16 17:26
 * @desc 底层资源通过依赖注入方式放进来
 **/
public class SpellChecker {
    private final Lexicon dictionary;
    public SpellChecker(Lexicon dictionary){
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word){
        // extra code here
        return false;
    }
    public List<String> suggestions(String typo){
        // extra code here
        return null;
    }
}

