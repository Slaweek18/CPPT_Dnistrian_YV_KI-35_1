package KI35.Dnistrian.Lab7;

import java.util.*;
import java.io.*;

public class ConveyorApp {
	
 public static void main(String[] args)
	{
		 Conveyor<Product> conveyor = new Conveyor<Product>();
		 conveyor.AddProduct(new Baking("Cake", 1200, 25));
		 conveyor.AddProduct(new Fruit("Bananas",500, 400));
		 conveyor.AddProduct(new Fruit("Apples",200, 45 ));
		 conveyor.AddProduct(new Baking("Apple pie" , 10000,100));
		 Product res = conveyor.findMin();
		 System.out.print("\nThe lightest product on the conveyor is:\n");
		 res.print();
	}
}