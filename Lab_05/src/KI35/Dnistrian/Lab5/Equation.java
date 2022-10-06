package KI35.Dnistrian.Lab5;
/**
 * Class <code>Equations</code> implements method for cos(x)/sin(x) expression calculation
 * @author EOM Stuff
 * @version 1.0
 */
class Equation
{
 /**
 * Method calculates the cos(x)/sin(x) expression
 * @param <code>x</code> Angle in degrees
 * @throws CalcException
 */
 public double calculate(int x) throws ExceptionDiv0
 {
	 double y, rad;
	 rad = x * Math.PI / 180.0;
	 try
	 {
		 y = Math.cos(rad)/Math.sin(rad);
		
		 // Якщо результат не є числом, то генеруємо виключення
		 if (y==Double.NaN || y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY || rad % Math.PI==0 )
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
 return y;
 }
} 