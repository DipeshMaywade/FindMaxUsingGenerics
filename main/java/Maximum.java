import java.util.*;

public class Maximum<T>{
    private T[] inputArray;

    public Maximum(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public Maximum() {}

    public <T> T findGenericMaximum(T[] myNumber){
        List myNumberList = Arrays.asList(myNumber);
        T max = (T)Collections.max(myNumberList);
        toPrint(max);
        return max;
    }

    public <T> T findGenericMaximum1(){
        List list = Arrays.asList(inputArray);
        T max = (T)Collections.max(list);
        toPrint(max);
        return max;
    }

    private <T> void toPrint(T a) {
        System.out.println(a);
    }
}