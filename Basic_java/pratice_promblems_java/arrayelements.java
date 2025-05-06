package Basic_java.pratice_promblems_java;

import java.util.Arrays;

public class arrayelements {
    public static void main(String[] args) {
        int [] src = {12,11,10,14,13};
        int [] dest = Arrays.copyOf(src,4);
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));
    }
}


