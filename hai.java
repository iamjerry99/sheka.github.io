import java.util.*;
import java.io.*;
 class rectangle{
    void print(double l ,double b){
        System.out.println(l*b);
    }
    void print(int l , int b){
        System.out.println(l*b);
    }
}
class square{
    void print(double a){
        System.out.println(a*a);
    }
    void print(int a){
        System.out.println(a*a);
    }
}
public class hai{
    public static void main(String args[]){
        rectangle r = new rectangle();
        square s = new square();
        r.print(23.4,67.3);
        s.print(34.7);
    }
}