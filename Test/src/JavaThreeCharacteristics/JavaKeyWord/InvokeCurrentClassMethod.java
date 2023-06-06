package JavaThreeCharacteristics.JavaKeyWord;

/**
 * @author Robin
 * @date 2023/6/5
 */
public class InvokeCurrentClassMethod {
    void method1(){}

    void method2(){
        method1();//this.method1()
    }

    public static void main(String[] args) {
        new InvokeCurrentClassMethod().method1();
    }

}
