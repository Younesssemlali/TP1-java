package net.mips.compiler;

public class Symboles {
	 Tokens token;
	 String nom;
   private Symboles (Tokens token,String nom) {
	   this.token=token;
	   this.nom=nom;}
public Tokens getToken() {
	return token;
}
public void setToken(Tokens token) {
	this.token = token;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
   


}
