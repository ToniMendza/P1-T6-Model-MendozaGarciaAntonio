package org.milaifontanals.clubEsportiu.model;


/**
 * @author antme
 * @version 1.0
 * @created 31-oct.-2024 19:31:26
 */
public class Categoria {

	private int id;
	private String nom;
	private int edatMax;
	private int edatMin;

	public Categoria(){

	}

    public Categoria(int id, String nom, int edatMax, int edatMin) throws ExceptionClub {
        this.id = id;
        this.nom = nom;
        this.setEdatMax(edatMax);
        this.setEdatMin(edatMin);
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

    public int getEdatMax() {
        return edatMax;
    }

    public void setEdatMax(int edatMax) throws ExceptionClub {
        if(edatMax < edatMin || edatMax>100 || edatMax < 0){
            throw new ExceptionClub("Error: L'edat màxima ha de ser entre 0 i 100 anys, i superior o igual a l'edat mínima.");
        }
            this.edatMax=edatMax;        
    }

    public int getEdatMin() {
        return edatMin;
    }

    public void setEdatMin(int edatMin) throws ExceptionClub {
                if(edatMin>100 || edatMin < 0){
            throw new ExceptionClub("Error: L'edat mínima ha de ser entre 0 i 100 anys, i inferior o igual a l'edat màxima.");
        }
            this.edatMin=edatMin;   
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return nom;
    }

    
}//end Categoria