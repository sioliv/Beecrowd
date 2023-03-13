package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class PrincipalArrayOrdemReversa {

    public static void main(String[] args) {
        Integer[] notas = {8, 5, 4, 10, 9};

        Arrays.sort(notas, Comparator.reverseOrder());

        System.out.println(Arrays.toString(notas));
    }
}
