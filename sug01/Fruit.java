package sug01;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author qchen
 * @date 2021/5/15 13:01
 * @desc
 **/
public class Fruit {
    protected String color = "";
    public String getColor(){
        return this.color;
    };

    private static Fruit banana = null;
    private static Fruit organe = null;
    public synchronized static Fruit getOrange(){
        if (organe == null) {
            organe = new Orange();
        }
        return organe;
    }
    public synchronized static Fruit getBanana(){
        if (banana == null) {
            banana = new Banaba();
        }
        return banana;
    }
    public static Fruit newInstance(String fruitType){
        Fruit fruit = null;
        if ("orange".equalsIgnoreCase(fruitType)) {
            fruit = new Orange();
        } else if ("banana".equalsIgnoreCase(fruitType)){
            fruit = new Banaba();
        }
        return fruit;
    }
}

class Orange extends Fruit {
    protected String color = "orange";
}

class Banaba extends Fruit {
    protected String color = "yellow";
}