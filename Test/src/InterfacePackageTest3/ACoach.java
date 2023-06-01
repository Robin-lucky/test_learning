package InterfacePackageTest3;

/**
 * @author Robin
 * @date 2023/6/1
 */
public class ACoach implements Coach{
    @Override
    public void command() {
        System.out.println("我是A级证书教练");
    }
}
