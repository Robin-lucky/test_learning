package JavaThreeCharacteristics.JavaKeyWord;

/**
 * @author Robin
 * @date 2023/6/6
 */
public class OverloadingByParamNum {
    public static void main(String[] args) {
        System.out.println(Adder.add(1,2));
        System.out.println(Adder.add(1,2,3));
    }
}

class Adder{
//    static int add(int a,int b){
//        return a+b;
//    }
//
//    static int add(int a,int b,int c){
//        return a+b+c;
//    }

    static int add(int ...args){
        int sum = 0;
        for(int a:args){
            sum += a;
        }
        return sum;
    }
}
