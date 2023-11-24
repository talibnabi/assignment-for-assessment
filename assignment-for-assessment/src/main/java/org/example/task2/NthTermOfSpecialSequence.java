package org.example.task2;


import java.util.HashMap;
import java.util.Map;


public class NthTermOfSpecialSequence {
    public static Map<Integer, Integer> getSpecialSequence(Integer term) {
        Map<Integer, Integer> termSequenceMap = new HashMap<>();
        for (int i = 1; i <= term; i++) {
            if (i <= 3) {
                termSequenceMap.put(i, i);
            } else if (i % 2 == 0) {
                termSequenceMap.put(i, termSequenceMap.get(i - 1) * 2);
            } else {
                termSequenceMap.put(i, termSequenceMap.get(i - 2) * 3);
            }
        }
        return termSequenceMap;
    }

    /*
    If you want to see all values,use this method
    * */
    public static void printAllValues(int n) {
        Map<Integer, Integer> resultMap = getSpecialSequence(n);
        System.out.println(resultMap);
    }


    /*
    Expected result
    * */
    public static long calculateNthTerm(int n) {
        Map<Integer, Integer> resultMap = getSpecialSequence(n);
        Integer resultWithInt = resultMap.get(n);
        long result = resultWithInt.longValue();
        return result;
    }
}
