import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReviewR {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");
        String str ="JJavvaDeveloper";
        System.out.println(findFirstNonRepeating(str));

    }

    public static Character findFirstNonRepeating(String str) {
        // create a map : this will cost space complexity
          Map<Character, Integer> map =new TreeMap<>();
        // count the frequency of chars
        for(Character ch:str.toCharArray()){
            int count;
            if(map.containsKey(ch)){
                count= map.get(ch);
                map.put(ch,count+1);
            }else{
                map.put(ch,1);
            }
        }
        // start from the beginning and check if there is a char with frequency 1
        for(Character ch:str.toCharArray()){
            if(map.get(ch)==1) return ch;
        }

        return null;
    }


}
