package Milestone;

public class Volunteer extends Empleat{
	protected String nom;
	protected double sou;
	
	public Volunteer(String nom) {
		this.nom = nom;
		this.sou=0;
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
		return "Volunteer [nom=" + nom + ", sou=" + sou + "]";
	}

}
