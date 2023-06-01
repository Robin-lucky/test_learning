package InterfacePackageTest2;

/**
 * @author Robin
 * @date 2023/6/1
 */
//适配器模式，用抽象类作为中间件
abstract class AdapterCoach implements Coach{
    public void defend(){};
    public void attack(){};
}
