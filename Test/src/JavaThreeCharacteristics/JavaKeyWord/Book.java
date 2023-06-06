package JavaThreeCharacteristics.JavaKeyWord;

/**
 * @author Robin
 * @date 2023/6/6
 */
public class Book {
    private String name;
    private int price;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}