package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");
		
		for(int i = 0; i<tabell.length; i++){
			System.out.print(tabell[i]+" ");
			
		}
		System.out.println("]");	
		// TODO

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String tekst="";
		tekst="[";
		for(int l=0; l<tabell.length;l++) {
			if(tabell.length-1==l) {
				tekst= tekst + tabell[l];
			}
			else {
				tekst= tekst + tabell[l]+ ",";
			}
			
		}
		tekst=tekst + "]";
		return tekst;
		
		
		
		// TODO
	}

	// c)
	public static int summer(int[] tabell) {
		int sum=0;
		int s=0;
		while(s<tabell.length) {
			sum=sum+tabell[s];
			s++;
		}
		return sum;
		// TODO
	}
	public static int summer2(int[] tabell) {
		int summen=0;
		for(int tallet:tabell) {
			summen=summen+tallet;
		}
		return summen;
	}
	public static int summer3(int[] tabell) {
		int summert=0;
		for(int l=0;l<tabell.length;l++) {
			summert+=tabell[l];
		}
		return summert;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for(int j=0;j<tabell.length;j++) {
			if(tabell[j]==tall) {
				return true;
			}
		}
		return false;

		// TODO
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for(int i=0;i<tabell.length;i++) {
			if(tabell[i]==tall) {
				return i;
			}
		}
		return -1;

		// TODO

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversert= new int[tabell.length];
		for(int c=0;c<tabell.length;c++) {
			reversert[tabell.length-c-1]=tabell[c];
		}
		return reversert;

		// TODO
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int u=0;
		boolean sorted =true;
		while(u<tabell.length-1) {
			if(tabell[u]>tabell[u+1]) {
				sorted=false;
			}
			u++;
		}
		return sorted;

		// TODO
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] fullTabell= new int [tabell1.length+tabell2.length];
		for(int o=0;o<tabell1.length;o++) {
			fullTabell[o]=tabell1[o];
		}
		for(int m=0;m<tabell2.length;m++) {
			fullTabell[m+tabell1.length]=tabell2[m];
		}
		return fullTabell;

		// TODO
	}
}
