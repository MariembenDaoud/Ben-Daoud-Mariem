class point {
	private int abs;
	private int ord ;
	private String nom;
	
	point (String c,int x , int y){
		abs=x;
		ord=y;
		nom=c;
	}
	point (String c){
		nom=c;
	}
	point (int x , int y ){
		abs=x;
		ord=y;
		
	}
	point(String ch){
		nom=ch;
		ord=0;
		abs=0;
	}
	point (int x , char c){
		abs=x;
		ord=2*x;
		nom=c;
	}
	void TranslHoriz(int d) {
		abs+=d;
	}
	void TranslVert(int d) {
		ord+=d;
	}
	void Translation(int d , int d1) {
		abs+=d;
		ord+=d1;
	}
	void Affiche() {
		System.out.println(nom+"(" + abs + ", " + ord + ")");
	}
	public boolean Coincide(point p) {
		return(abs==p.abs && ord==p.ord);
	}
	public String getNom() {
		return nom ;
	}
	public int getAbscisse() {
		return abs;
	}
	
	public int getOrdonnée() {
		return ord ;
	}
	public void setNom(String ch) {
		nom=ch;
	}
	public void setAbscisse(int a) {
		abs=a;
		
	}
	public void setOrdonnée(int a) {
		ord=a;
		
	}
}
