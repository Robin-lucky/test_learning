import java.util.concurrent.Callable;

/**
 * @author Robin
 * @date 2023/5/31
 */
/*
* 通过对象的值复制对象
* */
public class CopyValuePerson {
    private String name;
    private  int age;

    public CopyValuePerson(String name,int age){
        this.name = name;
        this.age = age;
    }

    public CopyValuePerson(){

    }

    public void out(){
        System.out.println("姓名："+name+",年龄："+age);
    }

    public static void main(String[] args) {
        CopyValuePerson p1 = new CopyValuePerson("Robin",18);
        p1.out();

        CopyValuePerson p2 = new CopyValuePerson();
        p2.name = p1.name;
        p2.age = p1.age;

        p2.out();
    }
}
