import java.util.Scanner;
public class Main
{
    static int poinAbu = 0;
    static int poinBagas = 0;
    
    static void poin(Character abu, Character bagas){
        if(abu == 'G' && bagas == 'K'){
            poinAbu += 1;
        } else if (abu == 'B' && bagas == 'G'){
            poinAbu += 1;
        } else if (abu == 'K' && bagas == 'B'){
            poinAbu += 1;
        }
        
        if(bagas == 'G' && abu == 'K'){
            poinBagas += 1;
        } else if (bagas == 'B' && abu == 'G'){
            poinBagas += 1;
        } else if (bagas == 'K' && abu == 'B'){
            poinBagas += 1;
        }
    }
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Tangan Abu: ");
		char AbuChoose1 = input.next().charAt(0);
		char AbuChoose2 = input.next().charAt(0);
		char AbuChoose3 = input.next().charAt(0);
		
		System.out.print("Tangan Bagas: ");
		char BagasChoose1 = input.next().charAt(0);
		char BagasChoose2 = input.next().charAt(0);
		char BagasChoose3 = input.next().charAt(0);
		
	    poin(AbuChoose3, BagasChoose3);
	    poin(AbuChoose2, BagasChoose2);
	    poin(AbuChoose1, BagasChoose1);
	    
	    if(poinAbu > poinBagas){
	        System.out.println("Abu");
	    } else if(poinBagas > poinAbu){
	        System.out.println("Bagas");
	    } else{
	        System.out.println("Seri");
	    }
	}
}