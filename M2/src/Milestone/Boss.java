package Milestone;

public class Boss extends Empleat{
	protected String nom;
	protected double sou;
	
	public Boss(String nom, double sou) {
		this.nom = nom;
		this.sou = sou*1.5;
		
		if (this.sou<8000) {
			this.sou=8000;
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
		return "Boss [nom=" + nom + ", sou=" + sou + "]";
	}

	
	
}
