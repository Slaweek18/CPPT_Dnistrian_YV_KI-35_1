import java.io.*;
import java.util.*;
/**
 * Клас Lab2DnistrianKI35 реалізує виконання 14 варіанту лабораторної роботи№2
 * @author Slaweek
 * @version 1.0
 * @since version 1.0 
 */
public class Lab2DnistrianKI35
{
 /**
  * Статичний метод main є точкою входу в програму
  * @param args масив, який зберігає значення типу <b>String</b>, тобто рядки (<i>які передаються під час запуску програми з командного рядка.</i>)
  * @throws FileNotFoundException
  */
	 public static void main(String[] args) throws FileNotFoundException
	 {
		Scanner scan=new Scanner(System.in);
		File name = new File("Test.txt");
		PrintWriter fout = new PrintWriter(name);
		 int size;
		 System.out.println("Enter the size of the square matrix: ");
		 size=scan.nextInt();
		 char[][] arr=new char[size][];
		 
		for(int i=0;i<size;i++) {	
			
			if(i%2!=0) {//Перевірка по парності, непарності
				arr[i]= new char[size];
			}

		}
	 
		System.out.println("Enter a placeholder character: ");
		String ch=scan.nextLine();
		ch=scan.nextLine();
		exit:
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++)
			{
				if(ch.length()==1) {
					if(i%2!=0) {//Перевірка по парності, непарності
					  arr[i][j]=(char)ch.codePointAt(0);
					 
					  System.out.print(arr[i][j] + " ");
					  fout.print(arr[i][j] + " ");
					}
					
				}
				else if(ch.length()==0) {
					System.out.println("No character entered");
					break exit;
				}
				else {
					System.out.println("Too many character entered");
					break exit;
			}
		 }
			System.out.print("\n");
			fout.print("\n");
	}
		fout.flush();
	fout.close();
   }
}
