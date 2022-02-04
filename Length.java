import java.util.*;
public class Length {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        String []arr=new String[n];
        int l=0;
        for(int i=0; i<n; i++){
            arr[i]= input.next();
            l += arr[i].length();
        }
        System.out.println(l);
    }
    
}
