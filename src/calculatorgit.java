import java.util.Scanner;
//JoelRomeroSAC
public class calculatorgit {
	
	public static void main(String[] args) {
				
Scanner input = new Scanner(System.in);
Scanner op =  new Scanner(System.in);
					
float num1;
						
System.out.print( "Enter your first Number : ");
num1 = input.nextInt();
									
float num2;
					
System.out.print( "Enter your second Number : ");
num2 = input.nextInt();
					
System.out.println(" Enter \n1 for addition\n2 for Subtraction\n3 for Multiplication\n4 for Division");
int choose = input.nextInt();
					
float danswer = num1 / num2;
if (choose == 1)
{ System.out.println("Your answer is: " + (num1 + num2)); }
else if (choose == 2)
{ System.out.println("Your answer is: " + (num1 - num2)); }
else if (choose == 3)
{ System.out.println("Your answer is: " + (num1 * num2)); }
else if (choose == 4)
{ System.out.println("Your answer is: " + danswer); }
									
						
	}
}


// Good job.  Please try +, -, *, / instead of 1,2,3,4
