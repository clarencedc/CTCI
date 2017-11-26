import java.util.*;

public class Reverse {
    public String reverseString(String iniString) {
        int length = iniString.length();
        int mid = iniString.length()/2;
        char[] chars = iniString.toCharArray();
        for(int i = 0; i < mid; i++){
            int ch = chars[i];
            chars[i] = chars[length-1-i];
            chars[length-1-i] = (char)ch;
        }
        return new String(chars);
    }
}