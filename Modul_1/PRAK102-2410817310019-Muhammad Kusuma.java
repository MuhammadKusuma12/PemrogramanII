import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		int num = 0;
		int numberInput = input.nextInt();
		numberInput -= 1;
		int newNumber = numberInput;
		while(num < 11){
		    num +=1;
		    numberInput += 1;
		    newNumber = numberInput;
		    if (newNumber % 5 == 0) {
		        newNumber = newNumber / 5 - 1;
		    }
		    System.out.print(newNumber);
			if(num != 11){
			    System.out.print(", ");
			}
		}
	}
}


