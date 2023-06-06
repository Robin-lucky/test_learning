package JavaThreeCharacteristics.JavaKeyWord;

/**
 * @author Robin
 * @date 2023/6/6
 */
public class OverloadingByParamType {
    public static void main(String[] args) {
        System.out.println(Adder2.add(1.1,1.2));
        System.out.println(Adder2.add(1,2));
    }
}

class Adder2{
    static int add(int a,int b){
        return a+b;
    }

    static double add(double a,double b){
        return a+b;
    }
}
