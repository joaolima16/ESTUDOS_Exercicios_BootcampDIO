package StreamApi.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> lsNumbers = Arrays.asList(1,2,3,4,5);
        lsNumbers.forEach(num ->{
            if(num%2 == 0){
                System.out.println(num);
            }
        });
    }
}
