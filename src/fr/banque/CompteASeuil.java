package fr.banque;

public interface CompteASeuil {
    public void retirer(Double uneValeur);
    public Double getSeuil();
    public void setSeuil(Double unSeuil);
}
