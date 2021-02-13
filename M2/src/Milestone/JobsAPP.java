package Milestone;
import java.util.Scanner;

public class JobsAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		Boss a = new Boss("Jefe",8000);
		//Employee b = new Employee("Empleado");
		Manager c = new Manager("Manager", 4000);
		Volunteer d = new Volunteer("Voluntario");
		
		Senior seniors[] = new Senior[2];
		Mid mids[] = new Mid[2];
		Junior juniors[] = new Junior[2];
		
		seniors[0]= new Senior("Manolo", 3000);
		seniors[1]= new Senior("Pepe", 3000);
	
		mids[0]= new Mid("Maria", 2000);
		mids[1]= new Mid("Marta", 2000);
		
		juniors[0]= new Junior("Adan", 1000);
		juniors[1]= new Junior("Eva", 1000);
		
		
		
	}

}
