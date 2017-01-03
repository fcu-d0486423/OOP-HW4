package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		PasswordEncorder p1=new PasswordEncorder();
		int flag=0;
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			System.out.print("Please enter a password:");
			String name=keyboard.next();
			p1.encode(name);
			
			System.out.println(p1.encode(name));
			
			if(name=="exit")
				break;
		}while(flag==0);

	}

}
