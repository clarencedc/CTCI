import java.util.*;

public class Same {
    public boolean checkSam(String stringA, String stringB) {
    	char[] charA = stringA.toCharArray();
        char[] charB = stringB.toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);
        return Arrays.equals(charA, charB);
    }
}