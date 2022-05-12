package eitas;
import java.util.Scanner;;
public class array3 {
static Scanner in = new Scanner(System.in);

public static void main (String[] args){

int [] n = {1,2,3};

int [] p = {4,5};

System.out.println(n.length);
System.out.println(p.length);

p = n;
System.out.println(p.length);
    }
}
