package fr;

import fr.banque.*;

import java.util.List;
import java.util.Map;

public class Run {
    public static void main(String[] args) {

        // Create accounts for a client
//        Compte compte1 = new Compte(1200.0,1);
//        Compte compte2 = new Compte(1600.0,2);
//        Compte compte3 = new Compte(1800.0,3);
//        Compte compte4 = new Compte(2000.0,4);
//        Compte compte5 = new Compte(2200.0,5);
//
//        // Create a client
        Client client1 = new Client("tchuenkam","ulrich",21);

       // Add the created accounts to client 1
//        client1.ajouterCompte(compte1);
//        client1.ajouterCompte(compte2);
//        client1.ajouterCompte(compte3);
//        client1.ajouterCompte(compte4);
//        client1.ajouterCompte(compte5);
//
//        //
//        System.out.println(client1.toString());
//        compte3.ajouter(500000.0);
//        System.out.println("The account number 3 is: "+client1.getCompte(7));

        BasicCompteRemunere remunere1 = new BasicCompteRemunere(2000.0,1,0.5);

//        System.out.println(remunere1.getSolde());
//        System.out.println(remunere1.getTaux());
//        remunere1.setTaux(0.7);
//        System.out.println(remunere1.getTaux());
//        System.out.println(remunere1.calculerInterets());
//        remunere1.verserInterets();
//        System.out.println(remunere1.getSolde());

        client1.ajouterCompte(remunere1);
//        System.out.println(client1.toString());

        BasicCompteASeuil compteSeuil = new BasicCompteASeuil(1, 1000.0, 2000.0);
        client1.ajouterCompte(compteSeuil);
//        System.out.println(client1.toString());

        Map<Integer,Compte> listeComptes = client1.getComptes();
        for (Compte compte:listeComptes.values()){
            if(compte instanceof BasicCompteRemunere){
                ((BasicCompteRemunere) compte).verserInterets();
            }
        }
        System.out.println(client1.toString());

        CompteRemunere compteASeuilRemunere = new CompteASeuilRemunere(1,1000.0,500.0,0.5);
        compteASeuilRemunere.verserInterets();
        if(compteASeuilRemunere instanceof CompteASeuilRemunere){
            CompteASeuilRemunere compte = (CompteASeuilRemunere) compteASeuilRemunere;
            client1.ajouterCompte(compte);
        }
        System.out.println(client1.toString());


        System.out.println(client1.getCompte(1));
    }
}
