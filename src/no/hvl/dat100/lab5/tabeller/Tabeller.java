package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i: tabell) {
			System.out.print(i+" ");
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tekst = "[";
		String k = "";
		for (int i = 0; i < tabell.length; i++) {
			tekst = tekst + k + tabell[i];
			k = ",";
		}
		return tekst + "]";
		
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
		//while-løkke
//		int i = 0;
//		while (i < tabell.length) {
//			sum += tabell[i];
//			i++;
//		}
//		return sum;
		
		//for-løkke
//		for (int i = 0; i < tabell.length; i++) {
//			sum += tabell[i];
//		}
//		return sum;
		
		//utvidet for-løkke
		for (int i: tabell) {
			sum += i;
		}
		return sum;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i: tabell) {
			if (i == tall) {
				return (true);
			}
		}
		return (false);
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int i = tabell.length-1;
		boolean test = false;
		
		while (i >= 0 && !test) {
			if (tabell[i] == tall) {
				test = true;
			} else {
				i--;
			}
		}
		return i;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] nyTabell = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = tabell[tabell.length - 1 - i];
		}
		return nyTabell;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 1; i < tabell.length ; i++) {
			if (tabell[i] < tabell[i-1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyTabell = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			nyTabell[i+tabell1.length] = tabell2[i];
		}
		return nyTabell;
	}
}
