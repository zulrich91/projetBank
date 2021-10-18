package fr.banque;

public class BasicCompteASeuil extends Compte implements CompteASeuil {
    private Double seuil;
    private Integer numeroCompte;
    private Double solde;


    public BasicCompteASeuil(Integer numeroCompte, Double seuil, Double solde) {
        this.seuil = seuil;
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public Double getSeuil() {
        return seuil;
    }

    public void setSeuil(Double seuil) {
        this.seuil = seuil;
    }

    @Override
    public String toString() {
        return "CompteASeuil{" +
                "seuil=" + seuil +
                ", solde=" + solde +
                ", numeroCompte=" + numeroCompte +
                "} ";
    }

    @Override
    public void retirer(Double uneValeur) throws BanqueException {
        if (this.getSolde()-uneValeur > this.seuil){
            super.retirer(uneValeur);
        } else{
            throw new BanqueException("Vous etes pauvre !");
        }

    }

}
