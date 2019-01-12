package emsi.com.appemploidutremps.models;

import java.util.Calendar;
import java.util.Date;

public class Seance {

    private String matiere;
    private String description;
    private SeanceDate jour;
    private SeanceTime dateDebut;
    private SeanceTime dateFin;
    private Type type;
    private String note;
    private String classeId;
    private Professeur professeur;
    private int groupe;


    public Seance() {
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SeanceDate getJour() {
        return jour;
    }

    public void setJour(SeanceDate jour) {
        this.jour = jour;
    }

    public SeanceTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(SeanceTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public SeanceTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(SeanceTime dateFin) {
        this.dateFin = dateFin;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getClasseId() {
        return classeId;
    }

    public void setClasseId(String classeId) {
        this.classeId = classeId;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public int getGroupe() {
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "matiere='" + matiere + '\'' +
                ", description='" + description + '\'' +
                ", jour=" + jour +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", type=" + type +
                ", note='" + note + '\'' +
                ", classeId='" + classeId + '\'' +
                ", professeur=" + professeur +
                ", groupe=" + groupe +
                '}';
    }
}
