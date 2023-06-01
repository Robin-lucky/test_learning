import java.util.concurrent.Callable;

/**
 * @author Robin
 * @date 2023/5/31
 */

/*
* 通过构造方法复制对象
* */
public class CopyConstructorPerson {

    private String name;//成员变量
    private int age;

    public CopyConstructorPerson(String name,int age){
        //int a=0; a是引用变量
        this.name = name;
        this.age = age;
    }

    public CopyConstructorPerson(CopyConstructorPerson person){
        this.name = person.name;
        this.age = person.age;
    }

    public void out(){
        System.out.println("姓名："+name+",年龄："+age);
    }

    public static void main(String[] args) {
        CopyConstructorPerson p1 = new CopyConstructorPerson("Robin",18);
        p1.out();

        CopyConstructorPerson p2 = new CopyConstructorPerson(p1);
        p2.out();
    }
}
