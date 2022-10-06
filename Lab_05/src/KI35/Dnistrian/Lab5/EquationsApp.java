package KI35.Dnistrian.Lab5;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;
/**
 * Class <code>EquationsApp</code> Implements driver for cos(x)/sin(x) Equations class
 * @author Yaroslav Dnistrian
 * @version 1.0
 */
public class EquationsApp {
 /**
 * @param args
 */
 public static void main(String[] args)
 {
		 
	 try
	 {
		 out.print("Enter file name: ");
		 Scanner in = new Scanner(System.in);
		 String fName = in.nextLine();
		 PrintWriter fout = new PrintWriter(new File(fName));
			 try{
					 try
					 {
						 Equation eq = new Equation();
						 out.print("Enter X: ");
						 fout.print(eq.calculate(in.nextInt()));
					 }
					 finally
					 {
						 // Цей блок виконається за будь-яких обставин
						 fout.flush();
						 fout.close();
					 }
				}
			catch (ExceptionDiv0 ex)
			 	{
				// Блок перехоплює помилки обчислень виразу
				 out.print(ex.getMessage());
				 }
			}
	catch (FileNotFoundException ex)
		 {
		// Блок перехоплює помилки роботи з файлом навіть якщо вони
		// виникли у блоці finally
		out.print("Exception reason: Perhaps wrong file path");
		 }
	 }
} 