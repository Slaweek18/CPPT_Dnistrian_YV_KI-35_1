package KI35.Dnistrian.Lab7;
import java.util.ArrayList;

/**
 * class Conveyor implements conveyor in a supermarket
 * @author Slaweek
 *
 */
public class Conveyor <T extends Product>
{
	 private ArrayList<T> arr;
	 
	 public Conveyor()
	 {
		 arr = new ArrayList<T>(); 
	 }
	
	 /**
	  * The method finds the lightest item among those added
	  * @return min or null
	  */
	 public T findMin()
	 {
		 if (!arr.isEmpty())
		 {
			T min = arr.get(0);
			
		     for (int i=1; i< arr.size(); i++){
		    	 if (arr.get(i).compareTo(min) < 0 )
		    		 min = arr.get(i);
		    }
		     return min;
		 }
		 return null;
	 }
	/**
	 *The method adds new products
	 * @param product
	 */
	 public void AddProduct(T product)
	 {
		 arr.add(product);
		 System.out.print("Product added: ");
	 	 product.print();
	 }
	 /**
	  * The method removes some product
	  * @param i number of our element
	  */
	 public void DeleteProduct(int i)
	 {
		 arr.remove(i);
	 }
	 
}

