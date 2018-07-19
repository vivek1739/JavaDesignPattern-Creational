package Prototype_1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo{
	
	public static void main(String[] args) {
		
		
		
		String sql="select * from movies where title= ?";
		List<String> parameters=new ArrayList<String>();
		parameters.add("Star wars");
		
		Record record=new Record();
		
		Statemnet first=new Statemnet(sql, parameters, record);
		
		System.out.println(first.getSql());
		System.out.println(first.getParameters());
		System.out.println(first.getRecord());
		
		Statemnet second=first.deepclone();
		

		System.out.println(second.getSql());
		System.out.println(second.getParameters());
		System.out.println(second.getRecord());
	}
	
	

}
