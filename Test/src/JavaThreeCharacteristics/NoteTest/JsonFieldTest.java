package JavaThreeCharacteristics.NoteTest;

/**
 * @author Robin
 * @date 2023/6/6
 */
public class JsonFieldTest {
    public static void main(String[] args) throws IllegalAccessException{
        Writer cmower = new Writer(18,"Robin","java全栈进阶之路");
        System.out.println(JsonSerializer.serialize(cmower));
    }
}
