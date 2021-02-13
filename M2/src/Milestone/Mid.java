package Milestone;

public class Mid extends Empleat{
	protected String nom;
	protected double sou;
	
	public Mid(String nom, double sou) {
		super();
		this.nom = nom;
		this.sou = sou*0.9;
		
		if (this.sou<1800) {
			this.sou=1800;
		}else if (this.sou>2500) {
			this.sou=2500;
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
