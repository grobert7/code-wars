package org.example;

import java.util.ArrayList;
import java.util.List;

public class DeadFishParser2 {
    public static int[] parse(String data) {
        int val = 0;
        List<Integer> list = new ArrayList<>();
        for(char ch: data.toCharArray()) {
            if (ch == 'i')
                val++;
            else if (ch == 'd')
                val--;
            else if (ch == 's')
                val*=val;
            else if (ch == 'o')
                list.add(val);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}