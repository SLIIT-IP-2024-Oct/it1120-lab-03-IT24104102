import java.util.Scanner;

public class IT24104102Lab3Q3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("what is the total amount? ");
		int amount = input.nextInt();
		
	
		int no5000 = amount / 5000;
		int remainder1 = amount - (5000 * no5000);

		
		int no1000 = remainder1 / 1000;
		int remainder2 = remainder1 - (1000 * no1000);

		
		int no500 = remainder2 / 500;
		int remainder3 = remainder2 - (500 * no500);

		
		int no200 = remainder3 / 200;
		int remainder4 = remainder3 - (200 * no200);

		
		int no100 = remainder4 / 100;
		int remainder5 = remainder4 - (100 * no100);

		
		int no50 = remainder5 / 50;
		int remainder6 = remainder5 - (50 * no50);

		
		int no20 = remainder6 / 20;
		int remainder7 = remainder6 - (20 * no20);

		
		int no10 = remainder7 / 10;
		int remainder8 = remainder7 - (10 * no10);

		
		int no5 = remainder8 / 5;
		int remainder9 = remainder8 - (5 * no5);

		
		int no2 = remainder9 / 2;
		int remainder10 = remainder9 - (2 * no2);

		
		int no1 = remainder10 / 1;
		int remainder11 = remainder10 - (1 * no1);

		System.out.println("no of 5000 notes: " + no5000);
		System.out.println("no of 1000 notes: " + no1000);
		System.out.println("no of 500 notes: " + no500);
		System.out.println("no of 200 notes: " + no200);
		System.out.println("no of 100 notes: " + no100);
		System.out.println("no of 50 notes: " + no50);
		System.out.println("no of 20 notes: " + no20);
		System.out.println("no of 10 notes: " + no10);
		System.out.println("no of 5 notes: " + no5);
		System.out.println("no of 2 notes: " + no2);
		System.out.println("no of 1 notes: " + no1);

	}
}

		