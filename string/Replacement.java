import java.util.*;

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        char[] chars = iniString.toCharArray();
        
        int countofspace = 0;
        for (char ch : chars){
            if (ch == ' '){
                countofspace += 1;
            }
        }
        
        char[] newChar = new char[length+countofspace];
        int j = 0;
        for (int i = 0; i < length; i++){
            if(chars[i] != ' '){
                newChar[j++] = chars[i];
            }else{
                newChar[j++] = '%';
                newChar[j++] = '2';
                newChar[j++] = '0';
            }
        }
        return new String(newChar);
    }
    public String replaceSpace2(String iniString, int length) {
        return iniString.replaceAll(" ", "%20");
    }
}