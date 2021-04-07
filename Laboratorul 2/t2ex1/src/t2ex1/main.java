package t2ex1;
import java.util.*;
import java.io.*;

public class main {
	
	public static void main (String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Type:oras/zona_rezidentiala/drum_expres/autostrada");
		String a = x.next();
		System.out.println("Pentru metoda 1 viteza maxima admisa este:" +metoda1(a));
		System.out.println("Pentru metoda 2 viteza maxima admisa este:" +metoda2(a));
		System.out.println("Penrtu metoda 3 viteza maxima admisa este:" +metoda3(a));
	}

	public static int metoda1(String name) {
		
		if (name.equals("oras"))
			return 50;
		
				else if (name.equals("zona_rezidentiala"))
					return 30;
		
						else if (name.equals("drum_expres"))
							return 100;
		
								else if (name.equals("autostrada"))
									return 130;
		
										else return 0;
	} 

	public static int metoda2(String name) {
		switch(name) {
			case "oras":
				return 50;
				
					case "zona_rezidentiala":
						return 30;
						
							case "drum_expres":
								return 100;
								
									case "autostrada":
										return 130 ;
		}
		return 0;
	}
	public static int metoda3(String name) {
		if(name.equals("oras"))
			return 50 ;
				if(name.equals("zona_rezidentiala"))
					return 30 ;
						if(name.equals("drum_expres"))
							return 100 ;
								if(name.equals("autostrada"))
									return 130 ;
		
		
		return 0;
	}

}
