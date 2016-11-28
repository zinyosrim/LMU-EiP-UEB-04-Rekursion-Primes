/**
 * Programm zum Finden von Primzahlen.
 * Es wird der euklidische Algorithmus 
 * zum Berechnen des ggT's benutzt.
 */
public class FindPrimes {
  
    /**
     * Implementation des euklidischen Algorithmus
     * Zwei ganze Zahlen werden als Eingabe akzeptiert
     * Die Ausgabe ist der ggT beider Eingabezahlen.
     * Der Aufruf kann innerhalb dieser Datei durch
     * ggT(Zahl1, Zahl2) erfolgen.
     */
	public static int ggT(int a, int b) {
		while(b != 0) {
			/* TODO:
			 * euklidischer Algorithmus
			 */
			if (a>b) {a=a-b;}
			else {b=b-a;}
		}
		return a;
	}
  
    /**
     * main Methode.
     * Keine Eingabe wird benötigt.
     */
	public static void main(String[] args) {
		
		// Partielle Tests für die Korrektheit des ggT
		// Hier sehen Sie auch einen Aufruf für ggT() und
		// können in an späterer Stelle auch so verwenden
		/*System.out.println(ggT(73, 21) == 1);
		System.out.println(ggT(63, 42) == 21);
		System.out.println(ggT(15, 10));*/
		
		// Dies ist der aktuelle Kandidat, der getestet wird,
		// ob er prim ist.
		int kandidat = 1;
		
		// Jeder Kandidat bis zur oberen Schranke (z.B. 100) wird 
		// getestet
		while(kandidat < 1000) {
			// erhöhe in jedem Durchgang kandidat um 1, um die
			// nächstgrößere Zahl zu erhalten.
			kandidat = kandidat + 1;
			
			// wir berechnen inkrementell das Produkt aller 
			// ggT(i,kandidat)
			int ggTProdukt = 1;
			
			
			/* TODO: 
			 * - Führen Sie eine neue Variable "int i" ein. 
			 * - Eine while-Schleife soll alle i > 1 durchlaufen,
			 *   die kleiner als der Kandidat sind */
			int i=2;
			while (i<kandidat){
			 /* - Für jedes i soll der ggT mit dem Kandidaten 
			 *   berechnet werden*/

			 /* - Dann wird dieser Wert mit dem bisherigen ggTProdukt 
			 *   multipliziert */
				ggTProdukt = ggTProdukt * ggT(i,kandidat);
			 /* - Nicht vergessen: i muss mit jedem Durchlauf erhöht werden.
			 */
				i++;
			}
			/* TODO: 
			 * Gib Zahl aus, genau dann wenn ggTProdukt == 1
			 */
			if (ggTProdukt == 1){
					System.out.println(kandidat);
			}
			
		}
	}
}