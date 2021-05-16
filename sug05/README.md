### Suggestion 05：优先考虑使用依赖注入来引用资源

许多类依赖于一个或者多个底层资源，不要直接实现在类中，而通过依赖注入来引用。

Singleton、静态工具类不适合用来实现一个依赖底层资源的类，因为底层资源可能变化，这样对应的域就不能设置为 final 的。

正确的做法是当创建一个类实例时，就将依赖的资源实例传入类的构造器中。