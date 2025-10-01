import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

		int number1 = input.nextInt();
		int number2 = input.nextInt();
		number1 *= 2;
        int loop = 0;
        do{
            if (number2 % 2 == 1) {
                System.out.print(number2);
                if(loop <= number1 - 3){
                    System.out.print(", ");
                }
            }
            number2 += 1;
            loop += 1;
        } while(loop < number1);
	}
}
