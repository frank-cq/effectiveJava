package sug05;

import java.util.List;

/**
 * @author qchen
 * @date 2021/5/16 17:34
 * @desc 将资源直接实现在静态工具类中
 **/
public class SpellCheckerRecommendless {
    private static final Lexicon dictionary = new Lexicon();
    // 只想做静态工具类，避免被实例化
    private SpellCheckerRecommendless(){}
    public static boolean isValid(String word){
        return false;
    }
    public static List<String> suggestions(String typo){
        return null;
    }
}

class Lexicon {
    // some defination
}
