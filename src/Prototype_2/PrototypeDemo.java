package Prototype_2;

public class PrototypeDemo {
	public static void main(String[] args) {
		Registry registry=new Registry();
		Movie movie=new Movie();
		movie.setTitle("Creational Patterns in Java");
		
		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		Movie anotherMovie=(Movie)registry.createItem("Movie");
		anotherMovie.setTitle("gangs of four");
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());
	}

}
