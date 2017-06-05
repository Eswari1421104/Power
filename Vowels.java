package vowels;
import java.io.*;
import java.util.*;
public class Vowels {

  public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char n ;
               n=s.next().charAt(0);
        if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
        {
            System.out.println("the given letter is vowel");
        }
        else
            System.out.println("the given number is consonant");
    }
    
}
