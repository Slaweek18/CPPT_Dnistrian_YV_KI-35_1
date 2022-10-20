package KI35.Dnistrian.Lab7;

/**
 * class Baking implements various pastries
 * @author Slaweek
 *
 */
public class Baking implements Product
{
	 private String name;
	 private int price;
	 private int size;
	 public Baking(String name, int size, int price)
	 {
	 this.name = name;
	 this.price = price;
	 this.size = size;
	 }
	
	public String getName()
	 {
	 return name;
	 }
	
	
	 public void setName(String name)
	 {
		 this.name = name;
	 }
	
	 public int getPrice()
	 {
		 return price;
	 }
	
	 public void setPrice(int price)
	 {
		 this.price = price;
	 }
	
	 public int getSize()
	 {
		 return size;
	 }
	
	 public int compareTo(Product p)
	 {
		 Integer s = size;
		 return s.compareTo(p.getSize());
	 }
	
	 public void print()
	 {
		 System.out.print("Baking: " + name + " ----- " + size +
				 "gram "  + " - " + price + "$;\n");
	 }
	}