package fr.banque;

public class CompteASeuilRemunere extends BasicCompteASeuil implements CompteRemunere {
    private Double taux;
    private Double solde;
    private Integer numeroCompte;

    public CompteASeuilRemunere(Integer numeroCompte, Double solde, Double seuil, Double taux) {
        super(numeroCompte, seuil,solde);
        this.taux = taux;
        this.solde = solde;
        this.numeroCompte = numeroCompte;
    }

    @Override
    public String toString() {
        return "CompteASeuilRemunere{" +
                "numeroCompte=" + numeroCompte +
                ", taux=" + taux +
                ", solde=" + solde +
                ", seuil=" + super.getSeuil() +
                "} " ;
    }

    @Override
    public Double calculerInterets() {
        return this.getSolde()*this.getTaux();
    }

    @Override
    public void verserInterets() {

        this.setSolde(this.getSolde()+this.getTaux()*this.getSolde());
    }

    @Override
    public Double getTaux() {
        return this.taux;
    }

    @Override
    public void setTaux(Double unTaux) {
        this.taux = unTaux;
    }
}
