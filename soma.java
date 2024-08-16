package some;
import java.util.*;
public class soma {
	
	public static Scanner sc= new Scanner(System.in);
	public static void main (String args[]){
	
		int a, b, res;
		
		System.out.println("Digite um número");
		a = sc.nextInt();
		System.out.println("Digite outro número");
		b = sc.nextInt();
		
		res = a + b;
		
		System.out.println("A soma dos dois números é:" + res);
		}
		
	}

