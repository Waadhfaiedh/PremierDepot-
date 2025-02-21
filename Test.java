package Calcule;

import java.util.Scanner;

public class Test {
	public static void main(String [] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner a");
		double a=sc.nextDouble();
		
		System.out.println("donner b");
		double b=sc.nextDouble();
		
		System.out.println("donner l'op");
		String op=sc.nextLine();
		
		double res=0; 
			switch(op) {
				case "+" : res=Calculatrice.add(a,b);
				System.out.println("res : "+res);
					break;
				case "-" : res=Calculatrice.sub(a,b);
				System.out.println("res : "+res);
					break;
				case "*" : res=Calculatrice.mul(a,b);
				System.out.println("res : "+res);
					break;
				case "/" : res=Calculatrice.div(a,b);
				System.out.println("res : "+res);
					break;
				default:
					System.out.println("non valide");
					return;
			}
	}
}
