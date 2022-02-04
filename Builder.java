import java.util.*;
public class Builder {
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("");
        Scanner input = new Scanner(System.in);
      System.out.println(sb.append(input.nextLine()));
 for( int i=0; i< sb.length();i++){
      System.out.println(sb.charAt(i));
 }
  sb.setCharAt(0, 'u');
  System.out.println(sb);
  sb.insert(0, "P");
  System.out.println(sb);
   sb.delete(1, 2);
   System.out.println(sb);
   sb.append("Reddy");
   System.out.println(sb);
   System.out.println(sb.length());
    }
}
