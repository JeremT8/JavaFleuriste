package fr.formation.entity;

import javax.persistence.*;

@Entity
public class Bouteille {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    private Boolean petillant;

    private String millesime;

    private int quantite;

    @ManyToOne
    private Couleur couleur;

    @ManyToOne
    private Region region;


    public Bouteille() {
    }

    public Bouteille(String nom, Boolean petillant, String millesime, int quantite, Couleur couleur, Region region) {
        this.nom = nom;
        this.petillant = petillant;
        this.millesime = millesime;
        this.quantite = quantite;
        this.couleur = couleur;
        this.region = region;
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

    public Boolean getPetillant() {
        return petillant;
    }

    public void setPetillant(Boolean petillant) {
        this.petillant = petillant;
    }

    public String getMillesime() {
        return millesime;
    }

    public void setMillesime(String millesime) {
        this.millesime = millesime;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bouteille{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", petillant=").append(petillant);
        sb.append(", millesime='").append(millesime).append('\'');
        sb.append(", quantite=").append(quantite);
        sb.append(", couleur=").append(couleur);
        sb.append(", region=").append(region);
        sb.append('}');
        return sb.toString();
    }
}
