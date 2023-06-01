/**
 * @author Robin
 * @date 2023/5/31
 */
/*
* 通过Object类的clone()方法
*
**/
public class ClonePerson implements Cloneable{
    private String name;
    private int age;

    public ClonePerson(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void out(){
        System.out.println("姓名："+name+",年龄："+age);
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        ClonePerson p1 = new ClonePerson("Robin",18);
        p1.out();

        ClonePerson p2 = (ClonePerson) p1.clone();
        p2.out();
    }
}
