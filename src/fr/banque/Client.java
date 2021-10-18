package fr.banque;
import java.util.*;

public class Client {
    private String nom;
    private String prenom;
    private Integer age;
    private static Integer numeroClient=0;
    //private List<Compte> comptes = new ArrayList<Compte>(5);
    private Map<Integer,Compte> comptes = new Hashtable<Integer, Compte>();
    //private Compte[] comptes = new Compte[5];

    public Client() {
        this("","",18);
        numeroClient++;
    }

    public Client(String nom, String prenom, Integer age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        numeroClient++;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numeroClient +
                ", comptes=" + comptes +
                '}';
//                ", comptes=" + Arrays.toString(comptes) +
//                '}';
    }
    
    public void ajouterCompte(Compte unCompte){
        try {
            comptes.put(numeroClient,unCompte);
        } catch (BanqueException e){
            System.out.println(e);
        }
//        boolean found = false;
//        for (int i=0; i<comptes.length; i++){
//            if(this.comptes[i] == null){
//                this.comptes[i] = unCompte;
//                found = true;
//                break;
//            }
//        }
//        if (!found){
//            throw  new BanqueException("No more space !");
//        }

    }
    
    public Compte getCompte(Integer numeroCompte){
//        for (Compte compte:this.comptes) {
//            if (compte.getNumeroCompte()==numeroCompte){
//                return compte;
//            }
//        }
        return comptes.get(numeroCompte);

    }

    public Map<Integer,Compte> getComptes(){
        return this.comptes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static Integer getNumeroClient() {
        return numeroClient;
    }


}
