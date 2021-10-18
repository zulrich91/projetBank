package fr.banque;

public interface CompteRemunere {

    public  Double calculerInterets();
    public void verserInterets();
    public Double getTaux();
    public void setTaux(Double unTaux);
}
