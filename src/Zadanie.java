import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Kwota pozyczki");
		int kwota = in.nextInt();
		
		System.out.println("Liczba rat");
		int liczba = in.nextInt();
		
		Raty rata = new Raty(kwota, liczba);
	}
}
