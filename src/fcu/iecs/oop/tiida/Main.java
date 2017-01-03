package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		NissanTiida n1=new NissanTiida();
		Scanner keyboard = new Scanner(System.in);
		int i;
		
		System.out.print("Please enter a number:");
		int x=keyboard.nextInt();
		
		for(i=1;i<=x;i++)
		n1.tiida(i);

	}

}
