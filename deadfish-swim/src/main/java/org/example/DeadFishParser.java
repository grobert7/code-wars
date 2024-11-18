package org.example;

public class DeadFishParser {

    public static int[] parse(String deadfishString) {
        int currentValue = 0;
        char[] chars;
        int index = 0;

        chars = deadfishString.toCharArray();
        int arrayLength = determineArrayLength(chars);
        int[] values = new int[arrayLength];

        for(char c : chars) {
            if(c == 'i') {
                currentValue++;
            } else if(c == 'd') {
                currentValue--;
            } else if(c == 's') {
                currentValue = currentValue*currentValue;
            } else if(c == 'o') {
                values[index] = currentValue;
                index++;
            }
        }

        return values;
    }

    private static int determineArrayLength(char[] arr) {
        int oCount = 0;
        for(char c : arr) {
            if(c == 'o') {
                oCount++;
            }
        }
        return oCount;
    }
}
