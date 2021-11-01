package Gestion.Banque;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Banque extends IBanque {
    String name;
    List<Compte> ListCompte = new ArrayList<Compte>();
    List<Personne> ListClient = new ArrayList<Personne>();

    public Banque(String name) {
        this.name = name;
    }
    Compte findCompte(int compteNumber) throws Exception{
        for (Compte c : ListCompte){
            if(c.noCompte == compteNumber){
                return c;
            }
        }
        throw new Exception("Compte n'est trouvable");
    }

    @Override
    void printReleve(int compteNumber, LocalDate dd, LocalDate da) throws Exception{
        Compte c  = findCompte(compteNumber);
        c.PrintOps(dd, da);
    }

    Personne findPersone(int clientNumber) throws Exception {
        for(Personne p : ListClient){
            if(p.NoClient==clientNumber){
                return p;
            }
        }
        throw new Exception("Personne non trouve");
    }
    double getSoldeCompte(int compteNumber) throws Exception{
        Compte c  = findCompte(compteNumber);
        return c.solde;
    }

    public List<Compte> getListCompte() {
        return ListCompte;
    }

    public void setListCompte(List<Compte> listCompte) {
        this.ListCompte = listCompte;
    }

    public void setListClient(List<Personne> listClient) {
        this.ListClient = listClient;
    }

    public List<Personne> getListClient() {
        return ListClient;
    }
    public void addClient(Personne pr){
        if(!ListClient.contains(pr)){
            ListClient.add(pr);
        }
    }
    public void addCompte(Compte cp){
        if(!ListCompte.contains(cp)){
            ListCompte.add(cp);
        }
    }
}
