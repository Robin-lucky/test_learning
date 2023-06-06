package JavaThreeCharacteristics.JavaKeyWord;

/**
 * @author Robin
 * @date 2023/6/5
 */
public class ThisAsMethodResult {
    ThisAsMethodResult getThisAsMethodResult(){
        //方法
        return this;
    }
    void out(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new ThisAsMethodResult().getThisAsMethodResult().out();

        //getThisAsMethodResult()方法返回了this关键字，指向的就是new ThisAsMethodResult()这个对象
        //所以可以紧接着调用out()方法，达到链式调用的目的
    }

}
