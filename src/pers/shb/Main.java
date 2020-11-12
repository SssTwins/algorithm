package pers.shb;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import pers.shb.algorithm.sort.*;
import pers.shb.exercise.string.DigitalToString;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author SHB
 */
public class Main {

    public static void main(String[] args) {
        TreeSet<Character> a = new TreeSet<>();
        a.add('d');
        a.add('a');
        a.add('b');
        a.add('c');
        a.forEach(System.out::println);
    }
}
