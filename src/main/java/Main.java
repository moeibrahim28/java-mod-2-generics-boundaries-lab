import java.util.ArrayList;
import java.util.List;

public class Main {
    // implement the public averageList method here

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println(averageList(intList)); // 3.0

        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(averageList(doubleList)); // 3.0
    }

    public static double averageList(List<? extends Number> list){
        double sum=0.0;
        double counter=0.0;
        for (Number number : list) {
            sum+=number.doubleValue();
            counter++;
        }
        return sum/counter;

    }

    
}
