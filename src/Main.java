import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

       String a = "aadrsadda";
        Map<Character,Integer> countChar=new HashMap<>();
       for (int i=0;i<a.length();i++){
          if(countChar.containsKey(a.charAt(i)){
              countChar.put(a.charAt(i),countChar.get(a.charAt(i))+1);
           } else{
              countChar.put(a.charAt(i),1);
           }
       }
    }
}