package JavaThreeCharacteristics.JavaKeyWord;

/**
 * @author Robin
 * @date 2023/6/6
 */
public class WriterDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("二哥的进阶之路");
        book.setPrice(79);

        Writer writer = new Writer("Robin",18,book);
        System.out.println("定价："+writer.getBook());
        writer.getBook().setPrice(59);
        System.out.println("促销价："+writer.getBook());
    }
}
