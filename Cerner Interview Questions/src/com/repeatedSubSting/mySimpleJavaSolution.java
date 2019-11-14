import java.util.*;
public class HelloWorld{
     public static boolean isPossible(String a){
         HashSet<Character> set = new HashSet<Character>();
         for(int i=0;i<a.length();i++){
             if(!set.contains(a.charAt(i))){
                 set.add(a.charAt(i));
             }
             else{
                 break;
             }
         }
             int n = set.size();
             if(a.length()%n==0)
                return true;
            else
                return false;
         }
        
     public static void main(String []args){
       String txt[] = {"GEEKGGEEK", "ABABAB", "ABCDABCD", "GEEKSFORGEEKS", "GEEKGEEK", "AAAACAAAAC", "ABCDABC"};
       for(int i=0;i<txt.length;i++){
           System.out.println(isPossible(txt[i]));
       }
     }
}
