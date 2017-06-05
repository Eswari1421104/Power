package power;
import java.io.*;
import java.util.*;
public class Power {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
                int Base=s.nextInt();
                int Power=s.nextInt();
                int result=1;
                while(Power!=0)
                {
                    result=result*Base;
                    Power--;
                }
        System.out.println(result);
    }
    
}
