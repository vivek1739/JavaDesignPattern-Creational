
public class SingleDemo {
	
	public static void main(String[] args) {
		
		
		Runtime r=Runtime.getRuntime();
		r.gc();
		System.out.println(r);
		
		Runtime s=Runtime.getRuntime();
		s.gc();
		System.out.println(s);
		
		System.out.println(r==s);
	}

}
