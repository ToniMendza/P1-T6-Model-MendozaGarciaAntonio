package org.milaifontanals.clubEsportiu.model;


/**
 * @author antme
 * @version 1.0
 * @created 31-oct.-2024 19:31:26
 */
public class Membre {

	private String titulaConvidat;
	private int idEquip;
	private int idJugador;

	public Membre(){

	}
        
    public Membre(String titulaConvidat, int idEquip, int idJugador) throws ExceptionClub {
        this.setTitulaConvidat(titulaConvidat);
        this.idEquip = idEquip;
        this.idJugador = idJugador;
    }
        
    public String getTitulaConvidat() {
        return titulaConvidat;
    }

    public void setTitulaConvidat(String titulaConvidat) throws ExceptionClub {
        if(titulaConvidat.equalsIgnoreCase("TITULAR")||titulaConvidat.equalsIgnoreCase("CONVIDAT")){
          this.titulaConvidat = titulaConvidat;  
        }else{
             throw new ExceptionClub("Error: El títol ha de ser 'TITULAR' o 'CONVIDAT'.");
        }
        
    }
    

    public int getIdEquip() {
        return idEquip;
    }

    public void setIdEquip(int idEquip) {
        this.idEquip = idEquip;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    @Override
    public String toString() {
        return "Membre{" + "titulaConvidat=" + titulaConvidat + ", idEquip=" + idEquip + ", idJugador=" + idJugador + '}';
    }
        
    
}//end Membre