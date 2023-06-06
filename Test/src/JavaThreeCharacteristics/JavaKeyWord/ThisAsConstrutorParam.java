package JavaThreeCharacteristics.JavaKeyWord;

import javafx.scene.chart.PieChart;

/**
 * @author Robin
 * @date 2023/6/5
 */
public class ThisAsConstrutorParam {
    int count = 10;

    ThisAsConstrutorParam(){
        //无参数构造方法
        Data data = new Data(this);
        data.out();
    }

    public static void main(String[] args) {
        new ThisAsConstrutorParam();
    }
}

class Data{
    ThisAsConstrutorParam param;
    Data(ThisAsConstrutorParam param){
        this.param = param;
    }

    void out(){
        System.out.println(param.count);
    }
}
