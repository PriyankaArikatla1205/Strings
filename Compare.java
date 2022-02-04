import java.util.*;
public class Compare {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String a=input.next();
        String b= input.next();
       

        if(a.equals(b)){
            System.out.println("Both strings are same");
        }
        else{
            System.out.println("Both are different");
        }
    }
}
