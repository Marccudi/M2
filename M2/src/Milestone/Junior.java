package Milestone;

public class Junior extends Empleat{
	protected String nom;
	protected double sou;
	
	public Junior(String nom, double sou) {
		super();
		this.nom = nom;
		this.sou = sou*0.85;
		
		if (this.sou<900) {
			this.sou=900;
		}else if (this.sou>1600) {
			this.sou=1600;
		}

	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSou() {
		return sou;
	}
	public void setSou(double sou) {
		this.sou = sou;
	}
	
	
	@Override
	public String toString() {
		return "Junior [nom=" + nom + ", sou=" + sou + "]";
	}

}
