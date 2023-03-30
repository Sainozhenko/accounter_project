package consultation28_03_2023;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTasksTest {

    ListTasks m = new ListTasks();
    @Test
    public void two_simple_list(){
        List<String>list1 = new ArrayList<String>();
        List<String>list2 = new ArrayList<String>();

        list1.add("hello");
        list2.add("world");

        List <String>expected = new ArrayList<String>();
        expected.add("hello");
        expected.add("world");

        assertEquals(expected, m.strings(list1, list2));
    }
    @Test
    public void sample_simple_list(){
        assertEquals(Arrays.asList("aaa","bbb"), m.strings(Arrays.asList("aaa"), Arrays.asList("bbb")));
    }
    @Test
    public void empty_simple_list(){
        assertEquals(Arrays.asList(), m.strings(Arrays.asList(), Arrays.asList()));
    }

    @Test
    public void normal_simple_list(){
        List<String>actual1 =Arrays.asList("hello","world");
        List<String>actual2 =Arrays.asList("hello","world");
        List<String>expected =Arrays.asList("hello","world","hello","world");
        assertEquals(expected, m.strings(actual1,actual2));
    }
}