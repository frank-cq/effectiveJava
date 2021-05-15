package sug04;

/**
 * @author qchen
 * @date 2021/5/15 18:15
 * @desc
 **/
public class UtilityClass {
    public static int xxx;
    public static void yyy(){};

    // 通过显示声明私有的构造器，避免编译器自动提供一个公有、无参的默认构造器
    // 该显示构造器声明的作用就是让构造器不被使用...囧
    private UtilityClass(){
        throw new AssertionError();
    }
}
