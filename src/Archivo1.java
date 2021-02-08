import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Archivo1 {
	public static void main(String[] args) {
		
		//Atributos:
		ArrayList<Integer> list  = new ArrayList<Integer>();
		Scanner keyboard=new Scanner (System.in);
		boolean exit=false;
		int userNum=0;
		
		while(!exit) {
			System.out.print("tell me a number to save [To exit put 0]: ");
		    userNum=keyboard.nextInt();
		    
		    if(userNum==0) exit=true;
		    else {
		    	list.add(userNum);
		    }
		}
		
		Collections.sort(list);
		
		for (Integer numero: list) {
	        System.out.println(numero);
	    } 
		
	}
}
