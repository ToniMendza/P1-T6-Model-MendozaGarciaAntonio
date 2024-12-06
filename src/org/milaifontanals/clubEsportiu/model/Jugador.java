package org.milaifontanals.clubEsportiu.model;

import java.time.LocalDate;

/**
 * @author antme
 * @version 1.0
 * @created 31-oct.-2024 19:31:26
 */
public class Jugador {

    private int id;
    private String nom;
    private String cognoms;
    private char sexe;
    private LocalDate dataNaixement;
    private String idLegal;
    private String IBAN;
    private int anyFiRevisio;
    private String adreca;
    private String foto;
    private String NomCategoria;





    public Jugador() {

    }

    public Jugador(String nom, String cognoms, char sexe, LocalDate dataNaixement, String idLegal, String IBAN, int anyFiRevisio, String adreca, String foto) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.sexe = sexe;
        this.dataNaixement = dataNaixement;
        this.idLegal = idLegal;
        this.IBAN = IBAN;
        this.anyFiRevisio = anyFiRevisio;
        this.adreca = adreca;
        this.foto = foto;
    }

    public Jugador(int id, String nom, String cognoms, char sexe, LocalDate dataNaixement, String idLegal, String IBAN, int anyFiRevisio, String adreca, String foto) throws ExceptionClub {
        this.id = id;
        this.nom = nom;
        this.cognoms = cognoms;
        this.setSexe(sexe);
        this.setDataNaixement(dataNaixement);
        this.setIdLegal(idLegal);
        this.setIBAN(IBAN);
        this.setAnyFiRevisio(anyFiRevisio);
        this.adreca = adreca;
        this.foto = foto;
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

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) throws ExceptionClub {
        if (sexe == 'H' || sexe == 'D') {
            this.sexe = sexe;
        } else {
            throw new ExceptionClub("Error: El sexe ha de ser 'H' o 'D'.");
        }
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(LocalDate dataNaixement) throws ExceptionClub {
        if (dataNaixement.isAfter(LocalDate.now())) {
            throw new ExceptionClub("Error: La data de naixement no pot ser en el futur.");
        }
        this.dataNaixement = dataNaixement;
    }

    public String getIdLegal() {
        return idLegal;
    }

    public void setIdLegal(String idLegal) throws ExceptionClub {
        if (idLegal == null || !idLegal.matches("^\\d{8}[A-Za-z]$")) {
            throw new ExceptionClub("Error: L'identificador legal ha de ser un DNI vàlid.");
        }
        this.idLegal = idLegal;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String iban) throws ExceptionClub {
        // Validación del IBAN
        if (iban == null || !iban.matches("^[A-Z]{2}\\d{2}[A-Z0-9]+$")) {
            throw new ExceptionClub("Error: L'IBAN ha de ser vàlid (2 lletres, 2 dígits i la resta alfanumèrica).");
        }
        this.IBAN = iban;
    }

    public int getAnyFiRevisio() {
        return anyFiRevisio;
    }

    public void setAnyFiRevisio(int anyFiRevisio) throws ExceptionClub {
        int anyActual = LocalDate.now().getYear() + 10;

        // Validació de l'any de finalització
        if (anyFiRevisio < 1900 || anyFiRevisio > anyActual) {
            throw new ExceptionClub("Error: L'any de finalització de la revisió ha de ser entre 1900 i l'any actual (" + anyActual + ").");
        }
        this.anyFiRevisio = anyFiRevisio;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
        public String getNomCategoria() {
        return NomCategoria;
    }

    public void setNomCategoria(String NomCategoria) {
        this.NomCategoria = NomCategoria;
    }
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nom=" + nom + ", cognoms=" + cognoms + ", sexe=" + sexe + ", dataNaixement=" + dataNaixement + ", idLegal=" + idLegal + ", IBAN=" + IBAN + ", anyFiRevisio=" + anyFiRevisio + ", adreca=" + adreca + ", foto=" + foto + '}';
    }

}//end Jugador
