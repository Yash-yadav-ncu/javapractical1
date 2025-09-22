import java.util.Scanner;

class reverse{
	public static void main (String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number to reverse : ");
	int num = scanner.nextInt();
	int reversed = 0;
	int sum = 0;
	while (num!=0){
	int temp = (num%10);
	sum = sum + temp;
	reversed = reversed*10 + temp;
	num = num/10;
	}
	
	
	System.out.print(" The reversed number is "+reversed+ " and the sum is "+sum);
	System.out.print("Yash Yadav 24csu241");	
}
}