 import java.util.*;
 public class Stack1 {
   private static boolean stackjava(String str) {
       Stack<Character> s = new Stack<Character>();
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
               s.push(str.charAt(i));
           }
           if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
               if (s.empty()) {
                   return false;
               }
            if (str.charAt(i) == ')') {
               if (s.peek() == '(') {
                   s.pop();
               } else {
                   return false;
               }
           }
           if (str.charAt(i) == ']') {
               if (s.peek() == '[') {
                   s.pop();
               } else {
                   return false;
               }
           }
           if (str.charAt(i) == '}') {
               if (s.peek() == '{') {
                   s.pop();
               } else {
                   return false;
               }
           }
           }
       }

       return s.empty();
   }

   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         String input=sc.next();
            System.out.println(Stack1.stackjava(input));
      }

   }
}

