package consultation28_03_2023;

import java.util.ArrayList;
import java.util.List;

public class ListTasks {
    // Есть два листа стрингов . Написать метод обьединяющий их в один.
    public List<String> strings(List<String>list1,List<String>list2) {
        List<String>strings = new ArrayList<String>();
        strings.addAll(list1);
        strings.addAll(list2);
        return strings;
    }
    public List<String>joinTwoLists(List<String>list1, List<String>list2){
        List<String>joined = new ArrayList<String>(list1.size()+list2.size());
        joined.addAll(list1);
        joined.addAll(list1);
        return joined;
    }
}
