import java.util.HashSet;
import java.util.Set;

public class Test {
    String input_string;
    Test(String input_string){
        this.input_string=input_string;
    }
    boolean findVowelShortcut(){
        return input_string.toLowerCase().matches(".*[aeiou].*");
    }
    // Above method is the shortcut and the implementation is mentioned below
    boolean findVowel(){
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        String input_string_lowerCase=input_string.toLowerCase();
        for(int i=0;i<input_string_lowerCase.length();i++){
            if(set.contains(input_string_lowerCase.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
