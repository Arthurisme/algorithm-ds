package com.ccg.nthFibonacci;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Program5 {

    public static int getNthFib(int n) {
        // Write your code here.

        Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>(Map.of(1,0,2,1));

//        integerMap.put(1, 0);
//        integerMap.put(2, 1);


//        if (n == 1) {
//            return 0;
//        } else if (n == 2) {
//            return 1;
//        }


        return getNthFib(n, integerMap);

    }


    public static int getNthFib(int n, Map<Integer, Integer> integerMap) {
        // Write your code here.


        if(integerMap.containsKey(n)){
            return integerMap.get(n);
        }else {
            integerMap.put(n, getNthFib(n - 1, integerMap) + getNthFib(n - 2, integerMap));
            return integerMap.get(n);
        }


//        return getNthFib(n, integerMap);

//        return getNthFib(n - 1, integerMap) + getNthFib(n - 2, integerMap);

    }


    public static void main(String arg[]) {


        System.out.println(Program5.getNthFib(4));

    }
}
