import java.util.*;

public class Zipper {
    public String zipString(String iniString) {
        StringBuffer buffer = new StringBuffer();
        
        for(int i = 0; i < iniString.length(); i++){
            char ch = iniString.charAt(i);
            int count = 1;
            while(i < iniString.length() - 1 && iniString.charAt(i+1) == iniString.charAt(i)){
                count++;
                i++;
            }
            buffer.append(ch).append(count);
        }
        return iniString.length() > buffer.length()? buffer.toString() : iniString;
    }
}