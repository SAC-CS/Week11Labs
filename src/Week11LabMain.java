import java.util.Scanner;

public class Week11LabMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int roll;
		int Roll2;
		int bounces;
		

		
		
		System.out.println("How many bounces would you like?");
		bounces = input.nextInt();
		
		Dice Rolling = new Dice(bounces);
		
		Rolling.Throw();

		
		roll = Rolling.Value();
		Roll2 = Rolling.getAverage();
		
		System.out.println(roll);
		System.out.println(Roll2);
		
		
	}
}
