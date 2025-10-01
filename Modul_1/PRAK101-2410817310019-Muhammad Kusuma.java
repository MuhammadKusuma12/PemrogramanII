import java.util.Scanner;
public class Main
{
    static String moonBorn(String input){
        if (input.equals("1")){
            return "Januari";
        } else if (input.equals("2")){
            return "Februri";
        } else if (input.equals("3")){
            return "Maret";
        } else if (input.equals("4")){
            return "April";
        } else if (input.equals("5")){
            return "Mei";
        } else if (input.equals("6")){
            return "Juni";
        } else if (input.equals("7")){
            return "Juli";
        } else if (input.equals("8")){
            return "Agustus";
        } else if (input.equals("9")){
            return "September";
        } else if (input.equals("10")){
            return "Oktober";
        } else if (input.equals("11")){
            return "November";
        } else{
            return "Desember";
        }
    }
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Masukkan Nama Lengkap: ");
	    String name = input.nextLine();
	    System.out.print("Masukkan Tempat Lahir: ");
        String placeBorn = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        String dateBorn = input.nextLine();
        System.out.print("Masukkan Bulan Lahir: ");
        String moonInput = input.nextLine();
        String moon = moonBorn(moonInput);
        System.out.print("Masukkan Tahun Lahir: ");
        String yearBorn = input.nextLine();
        System.out.print("Masukkan Tinggi Badan: ");
        String heightBody = input.nextLine();
        System.out.print("Masukkan Berat Badan: ");
        String weightBody = input.nextLine();

		System.out.println("Nama Lengkap " + name + ", Lahir di " + placeBorn + " pada Tanggal " + dateBorn + " " + moon + " " + yearBorn);
		System.out.println("Tinggi Badan " + heightBody + " cm dan Berat Badan " + weightBody + " kilogram");
	}
}