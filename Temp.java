import java.util.Scanner;

class Temp{
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.print ("Enter temperaturs in Fahrenheit : ");
	double fahren = scanner.nextDouble();
	double celci =  ((5.0/9.0) * (fahren - 32));
	System.out.print ("The temperature in Celcius is "+celci);
	System.out.print("\nYash Yadav 24csu241");
	}
}