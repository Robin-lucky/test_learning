/**
 * @author Robin
 * @date 2023/5/27
 */
public class HashCodeExample {
    public static void main(String[] args) {
        String test = "沉默王二";
        int hashCode = computeHashCode(test);

        System.out.println("字符串\""+test+"\"的哈希码是："+hashCode);

        System.out.println("String 的 hashCode "+test.hashCode());
    }

    public static int computeHashCode(String text){
        int h = 0;
        for(int i = 0;i<text.length();i++)
        {
            h = 31*h + text.charAt(i);
        }

        return h;
    }
}
