import java.util.*;
public class Main {

	public static void main(String[] args) {
		Set<Hero> list = new HashSet<>();
		
	Hero h1=new Hero();
	h1.name="minato";
	list.add(h1);
	System.out.println("要素数"+list.size());
	h1=new Hero();
	h1.name="minato";
	list.remove(h1);
	System.out.println("要素数"+list.size());
	
	}

}
