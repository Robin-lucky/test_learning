package JavaThreeCharacteristics.JavaKeyWord;

/**
 * @author Robin
 * @date 2023/6/5
 */
public class InvokeConstrutor {
    InvokeConstrutor(){
        System.out.println("Hello");
    }

    InvokeConstrutor(int count){
        //this 必须放在构造方法的第一行，否则会报错.
        this();
        System.out.println(count);
    }

    public static void main(String[] args) {
        InvokeConstrutor invokeConstrutor = new InvokeConstrutor(10);
    }
}
