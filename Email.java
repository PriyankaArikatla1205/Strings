import java.util.*;
public class Email {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String email= input.nextLine();
        String username="";
        for(int i=0; i<email.length(); i++){
             if(email.charAt(i) == '@'){
               break;
             }
             else{
                 username +=email.charAt(i);
             }
        }
        System.out.println(username);
    }
}
