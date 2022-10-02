package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int []tbl:matrise) {
			for(int nummer :tbl) {
				System.out.print(nummer + " ");
			}
		}
		
		// TODO
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String tekst=("");
		for(int[]indre:matrise) {
			for(int tallet:indre) {
				tekst=(tekst + tallet + " ");
			}
			tekst=(tekst+"\n");
		}
		return tekst;
		// TODO
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] fullMatrisen= new int[matrise.length][];
		for(int i=0;i<matrise.length;i++) {
			int[] fullTabell=new int[matrise[i].length];
			for(int j=0;j<fullTabell.length;j++) {
				fullTabell[j]=matrise[i][j]*tall;
			}
			fullMatrisen[i]=fullTabell;
		}
		return fullMatrisen;
		
		// TODO
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean resultat=false;
		for(int m=0;m<a.length;m++) {
			for(int g=0;g<a[m].length;g++) {
				if(a[m][g]==b[m][g]) {
					resultat=true;
				}
				else {
					resultat=false;
					return resultat;
				}
			}
		}
		return resultat;
		// TODO
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int [][] mirror= new int[matrise.length][];
		for(int p=0;p<mirror.length;p++) {
			int[] snudd= new int [matrise[p].length];
			for(int d=0;d<snudd.length;d++) {
				snudd[d]=matrise[d][p];
			}
			mirror[p]=snudd;
		}
		return mirror;

		// TODO
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
