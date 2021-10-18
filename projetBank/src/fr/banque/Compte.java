package fr.banque;

import java.util.Objects;

public class Compte {
    private Double solde;
    private  Integer numeroCompte;

    public Compte() {
        this(0.0,0);
    }

    public Compte(Double solde, Integer numeroCompte) {
        this.solde = solde;
        this.numeroCompte = numeroCompte;
    }

    public Double getSolde() {
        return solde;
    }

    protected void setSolde(Double solde) {
        this.solde = solde;
    }

    public Integer getNumeroCompte() {
        return numeroCompte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Compte)) return false;
        Compte compte = (Compte) o;
        return getSolde().equals(compte.getSolde()) && getNumeroCompte().equals(compte.getNumeroCompte());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSolde(), getNumeroCompte());
    }

    @Override
    public String toString() {
        return "Compte{" +
                "solde=" + solde +
                ", numero=" + numeroCompte +
                '}';
    }

    public void ajouter(Double montant){
        this.solde+=montant;
    }

    public void retirer(Double montant){
        this.solde-=montant;
    }
}
