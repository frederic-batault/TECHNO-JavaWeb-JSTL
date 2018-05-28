package pack;

public class Utilisateur {
private String nom;
private String prenom;
private String email;
private String login;
private String mdp;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}
public Utilisateur(String nom, String prenom, String email, String login, String mdp) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.login = login;
	this.mdp = mdp;
}
public Utilisateur() {
	super();
}


}
