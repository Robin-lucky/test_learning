package JavaThreeCharacteristics.JavaKeyWord;

/**
 * @author Robin
 * @date 2023/6/5
 */
public class StaticCounter {
    static int count = 0;//没有加static 输出是 1 1 1，每次都会创建一个对象，加了static则只会在同一个对象上进行加法。

    StaticCounter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticCounter c1 = new StaticCounter();
        StaticCounter c2 = new StaticCounter();
        StaticCounter c3 = new StaticCounter();
    }
}
