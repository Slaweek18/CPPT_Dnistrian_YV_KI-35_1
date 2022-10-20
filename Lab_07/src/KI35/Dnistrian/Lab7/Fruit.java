package KI35.Dnistrian.Lab7;

/**
 * class Fruit implements different fruits
 * @author Slaweek
 *
 */
public class Fruit implements Product
{
	 private String name;
	 private int size;
	 private int price;
	 public Fruit(String name, int size, int price)
	 {
		 this.name = name;
	 	this.size = size;
	 	this.price=price;
	 	
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
	
	 public void setSize(int n)
	 {
		 size = n;
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
		System.out.print("Fruit: " + name + " ----- " + size + "gram" + " - " + price + "$;\n");
	 }
	}