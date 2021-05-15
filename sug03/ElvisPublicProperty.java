package sug03;

/**
 * @author qchen
 * @date 2021/5/15 16:23
 * @desc 公有静态成员
 **/
public class ElvisPublicProperty {
    // 在类加载时被初始化，因为是 final 的，初始化后不会再被赋值
    public static final ElvisPublicProperty INSTANCE = new ElvisPublicProperty();
    private ElvisPublicProperty(){}
}
