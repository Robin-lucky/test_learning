package JavaThreeCharacteristics.JavaKeyWord;

/**
 * @author Robin
 * @date 2023/6/5
 */
public class WithThisStudent {
    String name;
    int age;
    WithThisStudent(String name,int age){
        //this 指向当前对象
        this.name = name;
        this.age = age;//如果参数名和实例变量名不同，不需要用this,不同则必须要用this
    }

    void out(){
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        WithThisStudent s1 = new WithThisStudent("Robin",18);

        s1.out();
    }
}
