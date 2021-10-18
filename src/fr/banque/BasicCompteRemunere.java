package fr.banque;

public class BasicCompteRemunere extends Compte implements CompteRemunere {
    private Double taux=0.5;
    private Integer numeroCompte;
    private Double solde;

    public BasicCompteRemunere(Integer numeroCompte, Double taux, Double solde) {
        this.setTaux(taux);
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }


    public BasicCompteRemunere(Double solde, Integer numeroCompte, Double taux) {
        super(solde, numeroCompte);
        this.setTaux(taux);
        this.numeroCompte = numeroCompte;
    }

    @Override
    public String toString() {
        return "CompteRemunere{" +
                "taux=" + taux +
                " , solde=" + super.getSolde() +
                " , numeroCompte=" + numeroCompte +"}";
    }

    public Double calculerInterets(){

        return  this.getSolde()*this.getTaux();
    }

    public void verserInterets(){
        this.setSolde(this.getSolde() + this.calculerInterets());
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        if(taux >0.0 && taux<=1){
            this.taux = taux;
        }

    }
}
