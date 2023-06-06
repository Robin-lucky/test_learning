package JavaThreeCharacteristics.JavaKeyWord;

/**
 * @author Robin
 * @date 2023/6/6
 */
/*
* 不可变类：4大要求
* 1、确保类是final ，不允许被其他类继承
* 2、确保所有的成员变量字段是final的
* 3、不要提供任何setter方法
* 4、如果要修改类的状态，必须返回一个新的对象
* */
public final class Writer {
    private final String name;
    private final int age;

    private final Book book;

    public Writer(String name,int age,Book book){
        this.name = name;
        this.age = age;
        this.book = book;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public Book getBook(){

        Book clone = new Book();
        clone.setPrice(this.book.getPrice());
        clone.setName(this.book.getName());
        return clone;
    }
}
