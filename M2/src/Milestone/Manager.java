package Milestone;

public class Manager extends Empleat{
	protected String nom;
	protected double sou;

	public Manager(String nom, double sou) {
		this.nom=nom;
		this.sou = sou*1.1;
		
		if (this.sou<3000) {
			this.sou=3000;
		}else if (this.sou>5000) {
			this.sou=5000;
		}
		
	}

	public double getSou() {
		return sou;
	}

	public void setSou(double sou) {
		this.sou = sou;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Manager [nom=" + nom + ", sou=" + sou + "]";
	}


	
	
}
