### Suggestion 01：用静态工厂方法替代构造器

优点
1. 有名称，可以表示返回的对象类型
2. 不必每次都创建新对象，保障实例受控
3. 可以返回原返回类型的任何子类型对象，隐藏了实现类
4. 返回对象的类可以根据参数变化
5. <返回对象所属的类>在编写静态工厂方法的类时可以不存在
    + 服务提供者框架，多个服务提供者实现一个服务，系统为服务提供者的客户端提供多个实现
        - 服务接口（Service Interface），服务提供者实现
        - 提供者注册API（Provider Registration API），服务提供者用来注册实现
        - 服务访问API（Service Access API），客户端获取服务实例
        - 服务提供者接口（Service Provider Interface），产生服务接口实例的工厂
        - 例：服务提供者对 si 进行实现，并通过 prAPI 注册到框架中，saAPI 为一个静态工厂，客户端访问 saAPI 时即从工厂中返回对应的服务实例

缺点
1. 类如果不含有 public、protected 的构造器，则不能被子类化
2. 码农很难发现，不像构造器那么明显
    + 规范化命名
        - from(para)，类型转换方法，返回该类型的一个实例
        - of(...)，聚合方法，返回该类型的一个实例
        - valueOf(para)，指定值
        - instance(...)/getInstance(...)，返回实例用参数来描述
        - create(...)/newInstance(...)，保证每次都返回一个新实例
        - get<Type>(...)，类似 getInstance，Type 表示工厂方法返回的对象类型
        - new<Type>(...)，类似 newInstance，Type 表示工厂方法返回的对象类型
        - <Type>(...)，get<Type>/new<Type> 的精简版