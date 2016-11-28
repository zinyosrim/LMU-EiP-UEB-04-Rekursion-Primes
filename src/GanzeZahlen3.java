
public class GanzeZahlen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0b101; //101_2=5_10
		System.out.println(a); 
		a=a/2; //ganzzahlige Division
		System.out.println(a); 
		;;;;;;;; // leere Anweisungen -> keine Änderung
		System.out.println(a); 	
		a+=1; //identisch zu a=a+1;
		System.out.println(a);
		a=2;
		a*=a; //identisch zu a=a*a;
		System.out.println(a);		
		System.out.println(a==2);//false 4==2
		System.out.println(a=2);//a wird 2 als neuer Wert zugewiesen
		a++;
		System.out.println(a);//increment um 1
		System.out.println(5+2-2);//trivial
		System.out.println(5/2*2);//erst ganzzahlige Division, liefert 2, dann*2
		a= (int) 13.7;//typecast, alles nach dem . wird abgeschnitten
		System.out.println(a+5.3);//Int a wird zu Gleitkomma
		System.out.println(a);//wird aber nicht a neu zugewiesen
	}

}
