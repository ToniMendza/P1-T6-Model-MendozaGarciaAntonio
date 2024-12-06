package org.milaifontanals.clubEsportiu.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author antme
 * @version 1.0
 * @created 31-oct.-2024 19:31:26
 */
public final class Equip {

    private int id;
    private String nom;
    private char tipus;
    private int idCategoria;
    private int idAny;

    public Equip() {

    }

    public Equip(String nom, char tipus, int idCategoria, int idAny) {
        this.nom = nom;
        this.tipus = tipus;
        this.idCategoria = idCategoria;
        this.idAny = idAny;
    }
    
    public Equip(int id, String nom, char tipus, int idCategoria, int idAny) throws ExceptionClub {
        this.id = id;
        this.nom = nom;
        setTipus(tipus);
        this.idCategoria = idCategoria;
        setIdAny(idAny);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public char getTipus() {
        return tipus;
    }

    public void setTipus(char tipus) throws ExceptionClub {
        if (tipus == 'H' || tipus == 'D' || tipus == 'M') {
            this.tipus = tipus;
        } else {
            throw new ExceptionClub("Error: El tipus ha de ser 'H', 'D' o 'M'.");
        }
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdAny() {
        return idAny;
    }

    public void setIdAny(int idAny) throws ExceptionClub {
        if (idAny < 1900 || idAny > 2100) {
            throw new ExceptionClub("Error: L'any ha de ser entre 1900 i 2100.");
        }
        this.idAny = idAny;
    }

    @Override
    public String toString() {
        return "Equip{" + "id=" + id + ", nom=" + nom + ", tipus=" + tipus + ", idCategoria=" + idCategoria + ", idAny=" + idAny + '}';
    }
    
}//end Equip
