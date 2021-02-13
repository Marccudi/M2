package Milestone;

public class Senior extends Empleat{
	protected String nom;
	protected double sou;
	public Senior(String nom, double sou) {
		super();
		this.nom = nom;
		this.sou = sou*0.95;
		
		if (this.sou<2700) {
			this.sou=2700;
		}else if (this.sou>4000) {
			this.sou=4000;
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
