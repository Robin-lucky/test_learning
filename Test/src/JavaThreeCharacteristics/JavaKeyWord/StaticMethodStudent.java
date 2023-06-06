package JavaThreeCharacteristics.JavaKeyWord;

/**
 * @author Robin
 * @date 2023/6/5
 */
/*
*静态方法属于这个类而不是这个类的对象;
* 调用静态方法的时候不需要创建这个类的对象.
* 静态方法可以访问静态变量.
* */
public class StaticMethodStudent {
    String name;
    int age;

    static String school = "厦门大学";//

    public StaticMethodStudent(String name,int age){
        this.name = name;
        this.age = age;
    }
    static void change(){
        school = "北京大学";//静态方法直接修改了静态变量的值
    }

    void out(){
        System.out.println(name+" "+age+" "+school);
    }

    public static void main(String[] args) {
        StaticMethodStudent.change();

        StaticMethodStudent s1 = new StaticMethodStudent("王二",18);
        StaticMethodStudent s2 = new StaticMethodStudent("Robin",17);

        s1.out();
        s2.out();
    }
}
