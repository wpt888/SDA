package problema1;
import java.util.*;

public class main {

    public static Scanner scan = new Scanner(System.in);

    public static void main (String[]args) {

    int x,y,sum,diff,max,min,dist,prod;
    double avg;

    System.out.println("Introduceti primul numar: ");
    x = scan.nextInt();
    System.out.println("Introduceti al doilea numar: ");
    y = scan.nextInt();

    sum = x + y;
    System.out.println("Suma: " + sum);

    diff = x - y;
    System.out.println("Diferenta: " + diff);
    prod = x * y;
    System.out.println("Produs: " + prod);
    
    if (x>y) {

    dist = x - y;
    max = x;
    min = y;
    }
    else {

    dist= y - x;
    max = y;
    min = x;
    }

    System.out.println("Maximul: " + max);
    System.out.println("Distanta: " + dist);
    System.out.println("Minimul: " + min);
    System.out.println("Produs: " + prod);
    

    avg = (x + y)/2;
    System.out.println("Media: " + avg);
    }

}