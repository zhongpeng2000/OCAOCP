package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product implements Comparable<Product> {

	int id;
	String name;
	
	
	
	
	/**
	 * @param id
	 * @param name
	 */
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public boolean equals (Object obj) {
		if(! (obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		return this.id == other.id;
	}
	@Override
	public int compareTo(Product obj) {
		return this.name.compareTo(obj.name);
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}



	static Comparator<Product> byId = (p1,p2)-> p1.id-p2.id;
	
	public static void main(String[] args) {
		Product p1 = new Product(20, "c");
		Product p2 = new Product(10, "java");
		List<Product> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		
		Collections.sort(list);
		list.forEach(l -> System.out.println(l));
		
		Collections.sort(list, byId);
		list.forEach(l -> System.out.println(l));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

	

}
