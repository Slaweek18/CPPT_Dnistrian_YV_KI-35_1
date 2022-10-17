package KI35.Dnistrian.Lab6;
import static java.lang.System.out;
import java.io.*;
import java.util.*;
public class FioApp {
	/**
	 * @param args
	 */
		 public static void main(String[] args) throws FileNotFoundException, IOException
		 		{
		 // TODO Auto-generated method stub
				 CalcWFio obj = new CalcWFio();
				 boolean yes =true;
				 Scanner s = new Scanner(System.in);
				 System.out.print("Enter data: ");
				 double data = s.nextDouble();
				 try {
					obj.calculate(data);
				 }
				 catch(ExceptionDiv0 ex){
					 yes=false;
					 out.print(ex.getMessage());
				 }
				 if(yes) {
				 System.out.println("\nResult is: " + obj.getResult());
				 obj.writeResTxt("textRes.txt");
				 obj.writeResBin("BinRes.bin");
				
				 obj.readResBin("BinRes.bin");
				 System.out.println("Result is: " + obj.getResult());
				 obj.readResTxt("textRes.txt");
				 System.out.println("Result is: " + obj.getResult());
				 }
		 		}
		}
	/**
	 * class CalcWfio implements writing and reading data
	 * @author Slaweek
	 *
	 */
		class CalcWFio
		{
		 public void writeResTxt(String fName) throws FileNotFoundException
		 {
		 PrintWriter f = new PrintWriter(fName);
		 f.printf("%f ",result);
		 f.close();
		 }
		
		 public void readResTxt(String fName)
		 {
		    try
		    {
				 File f = new File (fName);
				if (f.exists())
		        {
				Scanner s = new Scanner(f);
		 		result = s.nextDouble();
		 		s.close(); 
		 		}
				else throw new FileNotFoundException("File " + fName + "not found");
		    }
		    catch (FileNotFoundException ex)
		    {
			 	System.out.print(ex.getMessage());
		    }
		 }
		
		 public void writeResBin(String fName) throws FileNotFoundException, IOException
		 {
				 DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
				 f.writeDouble(result);
				 f.close();
		 }
		
		 public void readResBin(String fName) throws FileNotFoundException, IOException
		 {
				 DataInputStream f = new DataInputStream(new FileInputStream(fName));
				 result = f.readDouble();
				 f.close();
		 }
		 /**
		  * Method calculate the cos(x)/sin(x) expression
		  * @param <code>x</code> Angle in degrees
		  * @throws CalcException
		  */
		 public void calculate(double x) throws ExceptionDiv0
		 {
			 double y, rad;
			 rad = x * Math.PI / 180.0;
			 try
			 {
				 y = Math.cos(rad)/Math.sin(rad);
				
				 // Якщо результат не є числом, то генеруємо виключення
				 if (y==Double.NaN || y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY || rad % Math.PI==0)
					 throw new ArithmeticException();
			 }
			 catch (ArithmeticException ex)
			 {
			// створимо виключення вищого рівня з поясненням причини
			// виникнення помилки
				 if (rad % Math.PI==0)
				 throw new ExceptionDiv0("Exception reason: cos(x) / 0");
				 else
				 throw new ExceptionDiv0("Unknown reason of the exception during exception calculation");
			 }
		 result=y;
		 }
		/**
		 * method returns result
		 * @return result
		 */
		 public double getResult()
		 {
		 return result;
		 }
		 private double result;
	}

