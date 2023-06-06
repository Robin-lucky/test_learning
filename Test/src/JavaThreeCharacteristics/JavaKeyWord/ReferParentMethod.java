package JavaThreeCharacteristics.JavaKeyWord;

/**
 * @author Robin
 * @date 2023/6/5
 */
public class ReferParentMethod {
    public static void main(String[] args) {
        new Dog2().work();

        //new Dog2();
    }
}
class Animal2{
    void eat(){
        System.out.println("吃什么");
    }

    Animal2(){
        System.out.println("动物来了");
    }
}

class Dog2 extends Animal2{
    @Override
    void eat() {
        System.out.println("吃。。。");
    }

    void bark(){
        System.out.println("汪。。。");
    }

    void work(){
        super.eat();
        bark();
    }

    Dog2(){
        super();
        System.out.println("狗狗来了");
    }
}
