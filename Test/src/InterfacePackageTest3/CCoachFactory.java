package InterfacePackageTest3;

/**
 * @author Robin
 * @date 2023/6/1
 */
public class CCoachFactory implements CoachFactory{
    @Override
    public Coach createCoach() {
        return new CCoach();
    }
}
