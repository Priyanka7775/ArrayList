import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
    public static void main(String[] args) {
        ArrayList<Integer> integerList=new ArrayList<>();
        System.out.println(integerList.size());
        for (int i = 0; i <100 ; i++) {
            integerList.add(i);
            System.out.println("i = " +i+",  size of list="+ integerList.size());

        }
    }
}
