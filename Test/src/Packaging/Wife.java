package Packaging;

/**
 * @author Robin
 * @date 2023/6/1
 */
public class Wife {
    private String name;
    private String sex;
    private int age;

    private Husband husband;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setHusband(Husband husband){
        this.husband = husband;
    }

    public Husband getHusband(){
        return husband;
    }

}
