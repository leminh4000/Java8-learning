import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainLamdaExpression1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
//        numbers.forEach((number) -> {System.out.println(number);});

        Consumer<Integer> consumer = (number) -> {System.out.println(number);};
        numbers.forEach(consumer);


    }
}
