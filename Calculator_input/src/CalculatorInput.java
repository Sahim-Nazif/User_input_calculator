import java.util.Scanner;
public class CalculatorInput {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	while (true) {
		System.out.println("Please select Menu option");
		System.out.println("*************************");
		System.out.println("Type add to perform addition");
		System.out.println("Type sub to perform subtraction");
		System.out.println("Type div to perform division");
		System.out.println("Type  mul to perform multipication");
		System.out.println("Typ exit to quit the application ");
				
		String choice=input.nextLine();
		if (choice.equalsIgnoreCase("add")) {
			System.out.println("Enter first number :");
			int istNum=input.nextInt(); 
			System.out.println("Enter second number:");
			int secNum=input.nextInt();
		   int add=istNum+secNum;
		   System.out.printf("The sum is %d\n",add);
		}
	}
	
	

	}

}
