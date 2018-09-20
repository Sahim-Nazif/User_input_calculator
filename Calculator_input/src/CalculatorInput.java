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
		} else if (choice.equalsIgnoreCase("sub")) {
			System.out.println("Enter first number :");
			int istNum=input.nextInt(); 
			System.out.println("Enter second number:");
			int secNum=input.nextInt();
			if (istNum<secNum) 
			   throw new IllegalArgumentException("First digit can not be less then second digit !");
		   int sub=istNum-secNum;
		   System.out.printf("The subtraction result is %d\n" ,sub);
		}
		else if (choice.equalsIgnoreCase("div")) {
			System.out.println("Enter first number :");
			int istNum=input.nextInt(); 
			System.out.println("Enter second number:");
			int secNum=input.nextInt();
			if (istNum<secNum) 
			   throw new IllegalArgumentException("First digit can not be less then second digit !");
		   int div=istNum/secNum;
		   System.out.printf("The division result is %d\n" ,div);
		}
	}
	
	

	}

}
