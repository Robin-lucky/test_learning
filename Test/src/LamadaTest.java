/**
 * @author Robin
 * @date 2023/5/27
 */
public class LamadaTest {
    public static void main(String[] args) {

        new LamadaTest().work();

    }

    public void work()
    {
        System.out.println();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("this = %s%n");
            }
        };

        new Thread(r).start();
        new Thread(()-> System.out.println(" ")).start();
    }
}
