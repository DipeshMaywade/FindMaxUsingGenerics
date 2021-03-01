import java.util.*;

public class Maximum {

    public <E> E findMax(List myList){
        E maxValue = (E) Collections.max(myList);
        return maxValue;
    }
}
