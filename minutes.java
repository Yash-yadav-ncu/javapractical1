import java.util.Scanner;

class minutes {
	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter time in minutes:  ");
	float min = scanner.nextFloat();

	float days = (min/1440);
	float months = (min/43200);
	float years = (min/518400);

	System.out.print("The entered minutes are equivalent to "+days+" days OR "+months+" months OR "+years+" Years"); 
	System.out.print("\nYash Yadav 24csu241");
	}
}	