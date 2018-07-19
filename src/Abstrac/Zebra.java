package Abstrac;

import java.util.Calendar;

public class Zebra extends Animals{

	@Override
	public void eat() {
		System.out.println("Zebra is eating");
		
	}
	
	public static void main(String[] args) {
		
		
		Animals s=new Zebra();
		s.getTeeth();
		
		Calendar cal=Calendar.getInstance();
		Calendar cal1=Calendar.getInstance(zone);
		Calendar cal2=Calendar.getInstance(zone, aLocale)
		
		
	}
	
	

}
