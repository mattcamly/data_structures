import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReviewR {
    public static void main(String[] args) {
        Set<Student> set = new LinkedHashSet<>();
        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(3, "Mike"));
        set.add(new Student(4, "Mary"));
        System.out.println(set.add(new Student(4, "Mary")));

        System.out.println(set);
        String str = "Javva Developer";
        System.out.println(firstRepeatingChar(str));

    }

    public static Character firstRepeatingChar(String str){
        // create hash set
        Set<Character> chars = new HashSet<>();
        //iterate over the char array and add chars into hashset
        for(Character ch:str.toCharArray()){
            if(!chars.add(ch)) return ch;
        }
        //if add ops is false return the char
        return null;
    }


}
