/* Vypise rozklad na prvocinitele. */
public class Prvocinitele {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		while (scanner.hasNextDouble()) {
			double cislo = scanner.nextDouble();
			
			if (cislo <= 1) {
				System.out.printf("%.2f neresim.\n", cislo);
				continue;
			}
			
			System.out.printf("%.2f =", cislo);
			int delitel = 2;
			while (delitel <= cislo) {
				while ((cislo % delitel) == 0) {
					System.out.printf(" %d", delitel);
					cislo /= delitel;
				}
				delitel++;
			}
			System.out.println();
		}
	}
}
