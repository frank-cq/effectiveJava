package sug03;

/**
 * @author qchen
 * @date 2021/5/15 16:39
 * @desc enum 总是继承自 Enum 类，且无法被继承。编译后和普通的 Class 一样，只是每个枚举值都是枚举类的一个 static final 实例
 **/
public enum Elvis {
    INSTANCE;
    public void hello(){
        System.out.println("hello");
    }
}
