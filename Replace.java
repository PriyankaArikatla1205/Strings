import java.util.*;
public class Replace {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String a= input.next();
        String result="";
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='e'){
                result +='i';
            }
            else{
                result +=a.charAt(i);
            }
        }
 System.out.println(result);
    }
}
