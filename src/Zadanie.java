import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int kwota;
		do {
			System.out.println("Kwota pozyczki (100 - 10000)");
			kwota = in.nextInt();
		}while(kwota < 100 || kwota > 10000);
		
		int liczba;
		do {
			System.out.println("Liczba rat (6 - 48)");
			liczba = in.nextInt();
		}while(liczba < 6 || liczba > 48);

		
		Raty rata = new Raty(kwota, liczba);
		
		System.out.println(rata.obliczRaty());
	}
}
