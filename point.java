package project;

public class point {
	private int abs ; 
	private int ord ;
	char nom;
	point (int a, int b ,char c){
		abs = a;
		ord = b ;
		nom = c;
		
	}
	point(int x, char k){
		abs=x;
		ord=2*x;
		nom = k;
	}
	void transhor(int d) {
		abs+=d;
		
	}
	void transver(int c) {
		ord+=c;
	}
	void trans(int d , int c) {
		abs+=d;
		ord+=c;
	}
	void affiche() {
		System.out.println(nom+"("+abs+","+ord+")") ; 
		
	}
	
}



