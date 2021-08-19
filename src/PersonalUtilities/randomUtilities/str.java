package PersonalUtilities.randomUtilities;

import java.awt.*;
import java.util.Arrays;

public class str {

public str(){

}

    public static void stringToMacro(String str) throws AWTException {
        char[] ch =  str.toUpperCase().toCharArray();
        Robot r = new Robot();
        for(char i : ch){
          r.keyPress(i);
        }

    }


    public static int[] toIntArray(int amount){

       int[] a =
                new int[amount];
                Arrays.fill(a, 1);
                return a;
    }

    public static boolean startsWithIgnoreCase(String anotherString, String startsWith) {
        String[] str = anotherString.split("");
        boolean sst = startsWith.startsWith(str[0].replace(str[0], str[0].toUpperCase()));
        boolean st = startsWith.startsWith(str[0].replace(str[0], str[0].toLowerCase()));
        return st | sst;

    }
}
