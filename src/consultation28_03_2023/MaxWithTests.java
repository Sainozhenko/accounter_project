package consultation28_03_2023;

public class MaxWithTests {
    public int max(int[]ints){
        if(ints.length==0) return -1;
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]>max){
                max= ints[i];
            }

        }
        return max;
    }
}
