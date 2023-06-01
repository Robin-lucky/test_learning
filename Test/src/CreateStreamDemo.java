import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Robin
 * @date 2023/5/27
 */
public class CreateStreamDemo {
    public static void main(String[] args) {
        String[] arr = new String[]{"武汉加油","中国加油","世界加油","结束"};

        Stream<String> stream = Arrays.stream(arr);
        stream = Stream.of("武汉加油","中国加油","世界加油");

        List<String> list = new ArrayList<>();

        list.add("武汉加油");
        list.add("中国加油");
        list.add("世界加油");
        stream = list.stream();


        List<String> nameList = new ArrayList<>();

        nameList.add("周杰伦");
        nameList.add("陶泽");
        nameList.add("邱红娇");
        nameList.add("林俊杰");

        //element ->element.contains("邱")  筛选 邱 的字符串
        Stream<String> stream1 = nameList.stream().filter(element ->element.contains("邱"));
        //forEach 接收的是一个Consumer 类型的参数，
        //下面的语法相当于 ->
        /*
        * for(String s:strs)
        * {
        *   System.out.println(s);
        * }
        * */
        stream1.forEach(System.out::println);

        //映射
        Stream<Integer> stream2 = nameList.stream().map(String::length);
        stream2.forEach(System.out::println);

        //匹配
        boolean anyMathFlag = nameList.stream().anyMatch(element->element.contains("邱"));
        boolean allMathFlag = nameList.stream().anyMatch(element->element.length()>1);
        boolean noneMathFlag = nameList.stream().anyMatch(element->element.endsWith("丞"));

        System.out.println(anyMathFlag);
        System.out.println(allMathFlag);
        System.out.println(noneMathFlag);

    }
}
