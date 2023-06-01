package InterfacePackageTest;

/**
 * @author Robin
 * @date 2023/6/1
 */
public class Demo {
    //Demo.defend() 方法可以接受不同风格的Coach，并根据所传递的参数对象的不同而产生不同的行为，这种称为“策略模式”
    public static void defend(Coach coach){
        coach.defend();
    }

    public static void main(String[] args) {
        defend(new Hesai());
        defend(new Guatu());
    }
}
