### Suggestion 04：通过私有构造器强化不可实例化的能力

有一些类只包含静态方法、静态属性，比如工具类，比如归纳收集一些静态方法。这种类不想被实例化，也不想被继承，为了避免编译器生成默认的构造器，需要显式声明私有的构造器。

