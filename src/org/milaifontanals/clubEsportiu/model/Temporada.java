package org.milaifontanals.clubEsportiu.model;

/**
 * @author antme
 * @version 1.0
 * @created 31-oct.-2024 19:31:26
 */
public class Temporada {

    private int any_temp;

    public Temporada() {

    }

    public Temporada(int any_temp) {
        this.any_temp = any_temp;
    }

    public int getAny_temp() {
        return any_temp;
    }

    public void setAny_temp(int any_temp) throws ExceptionClub {
        if (any_temp < 1900 || any_temp > 2100) {
            throw new ExceptionClub("Error: L'any ha de ser entre 1900 i 2100.");
        }
        this.any_temp = any_temp;
    }

    @Override
    public String toString() {
        return "Temporada{" + "any_temp=" + any_temp + '}';
    }
    
}//end Temporada
