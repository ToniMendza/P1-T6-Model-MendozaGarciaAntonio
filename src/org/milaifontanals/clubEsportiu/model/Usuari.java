package org.milaifontanals.clubEsportiu.model;

/**
 * @author antme
 * @version 1.0
 * @created 31-oct.-2024 19:31:26
 */
public class Usuari {

    private String login;
    private String nom;
    private String password;

    public Usuari() {

    }

    public Usuari(String login, String nom, String password) {
        this.login = login;
        this.nom = nom;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getpassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Usuari{" + "login=" + login + ", nom=" + nom + ", password=" + password + '}';
    }
    
}//end Usuari
