package project;

public class test {
	public static void main(String[] args) {
		point p=new point(3,2,'p');	
		point p1=new point(1,1,'x');
		point p2=new point(4,'y');
		p.affiche();
		p1.affiche();
		p2.affiche();
		System.out.println("Aprés translation : ") ; 
		p.transhor(4);
		p1.trans(2,3);
		p2.transver(3);
		p.affiche();
		p1.affiche();
		p2.affiche();
	}
	
	
	

}
