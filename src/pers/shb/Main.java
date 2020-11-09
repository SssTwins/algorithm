package pers.shb;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import pers.shb.algorithm.sort.*;

import java.util.Arrays;

/**
 * @author SHB
 */
public class Main {

    public static void main(String[] args) {
        int[] test = new int[]{98,89,79,59,39,24,87,1,8,7,3,45,32,75,24,9,2432,34,566,12,9887,324,235,45,56,232,5235};
        HeapSort.heapSortImpl(test);
        System.err.println(Arrays.toString(test));
    }
}
