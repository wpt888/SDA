package t2ex2;
import java.util.Scanner;

public class main {
	public static Scanner x ; 
	public static void main (String[]args) {
		x=new Scanner (System.in);
		System.out.println("Numarul pacientilor");
		
			int n = x.nextInt();
			int i;
			double []v=new double[n];
			for (i=0;i<n;i++) {
			
			System.out.println("Temperatura pacient["+i+"]");
			v[i]=x.nextDouble();
		}	
		
			System.out.print("Temperaturi mai mici de 37 de grade:");
	        for(i=0;i<n;i++)
        	
        {
            if(v[i]>=20 && v[i]<37)
            System.out.print( "("+v[i] +"," +i + ")" + " , ");
        }
        
	        System.out.println();
	        System.out.print("Temperaturi mai mari de 37 de grade: ");

        for( i=0;i<n;i++)
       
        {
            if(v[i]>=37 && v[i]<=46)
            System.out.print( "("+v[i] +"," +i + ")" + " , ");
	    }  
		   
}
}
