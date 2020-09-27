package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad: matrise) {
			for (int t: rad) {
				System.out.print(t + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String svar = "";
		for (int[] rad: matrise) {
			for (int t: rad) {
				svar = svar + t + " ";
			}
			svar = svar + "\n";
		}
		return svar;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int x = 0; x < matrise[rad].length; x++) {
				nyMatrise[rad][x] = matrise[rad][x] * tall;
			}
		}
		return nyMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length || a[0].length != b[0].length) {
			return false;
		}
		for (int rad = 0; rad < a.length; rad++) {
			for (int x = 0; x < a[0].length; x++) {
				if (a[rad][x]!=b[rad][x]) {
					return false;
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int len = matrise.length;
		int[][] speil = new int[len][len];
		for (int y = 0; y<len; y++) {
			for (int x = 0; x<len; x++) {
				speil[y][x] = matrise[x][y];
			}
		}
		return speil;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] nyMatrise = new int[a.length][b[0].length];
		
		for (int y = 0; y < nyMatrise.length; y++) {
			for (int x = 0; x < nyMatrise.length; x++) {
				for (int i = 0; i < b.length; i++) {
					nyMatrise[y][x] += a[y][i] * b[i][x];
				}
			}
		}
		
		return nyMatrise;
	}
}
