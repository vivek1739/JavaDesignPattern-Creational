package Prototype_2;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String,Item> items =new HashMap<String,Item>();
	
	public Registry()
	{
		loadItems();
	}
	
	public Item createItem(String type){
		Item item=null;
		
		try {
			item=(Item) (items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return item;
	}
	
	private void loadItems(){
		
		Movie movie=new Movie();
		movie.setTitle("Basic Movie");
		movie.setPrice(24.99);
		movie.setRuntime("2 hrs");
		items.put("Movie",movie);
		
		Book book=new Book();
		book.setNumberofPages(335);
		book.setTitle("Basic Book");
		book.setPrice(19.99);
		items.put("Book",book);
		
	}

}
