package Gestion.Banque;

import java.time.LocalDate;
import java.util.List;

public abstract class IBanque {
    abstract Compte findCompte(int compteNumber)throws Exception;
    abstract void printReleve(int compteNumber, LocalDate dd, LocalDate da)throws Exception;
    abstract Personne findPersone(int clientNumber) throws Exception;
    abstract double getSoldeCompte(int compteNumber) throws Exception;
    abstract List<Compte> getListCompte();
    abstract void setListCompte(List<Compte> ListCompte);
    abstract List<Personne> getListClient();
    abstract void setListClient(List<Personne> listClient);
}
