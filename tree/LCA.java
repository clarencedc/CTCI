import java.util.*;

public class LCA {
    public int getLCA(int a, int b) {
        while(a>0 && b >0 && a != b){
            if(a > b)
                a = a/2;
            else 
                b = b/2;
        }
        if(a < 1 || b < 1)
            return 1;
        return a;
    }
}