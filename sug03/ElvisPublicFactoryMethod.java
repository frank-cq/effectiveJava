package sug03;

/**
 * @author qchen
 * @date 2021/5/15 16:23
 * @desc 静态工厂方法
 **/
public class ElvisPublicFactoryMethod {
    private static final ElvisPublicFactoryMethod INSTANCE = new ElvisPublicFactoryMethod();
    private ElvisPublicFactoryMethod(){}
    public static ElvisPublicFactoryMethod getInstance(){
        return INSTANCE;
    }
}
