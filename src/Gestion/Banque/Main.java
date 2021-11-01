package Gestion.Banque;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Personne Oussama = new Personne(1, 690087896, "Bouzekraoui", "Oussama");
        Compte CpOuss = new CompteCheque(1, LocalDate.now(), 25000.33, Oussama, 1000);
        Personne Khalil = new Personne(2, 690087896, "Jemghili", "Khalil");
        Compte CompteKhalil = new CompteCheque(2, LocalDate.now(), 25000.30, Khalil, 1000);
        Oussama.ajouterCompte(CpOuss);
        Khalil.ajouterCompte(CompteKhalil);
        Operation op1 = new OpRetrait(1, LocalDate.now(), CpOuss, 2000);
        Operation op2 = new OpRetrait(2, LocalDate.now(), CompteKhalil, 3000);
        Operation op3 = new OpRetrait(3, LocalDate.now(), CpOuss, 4000);
        CpOuss.addOps(op1);
        CompteKhalil.addOps(op2);
        CpOuss.addOps(op3);
        Banque CIH = new Banque("CIH");
        CIH.setListCompte(new ArrayList<Compte>());
        CIH.setListClient(new ArrayList<Personne>());
        CIH.addCompte(CpOuss);
        CIH.addCompte(CompteKhalil);
        CIH.addClient(Oussama);
        CIH.addClient(Khalil);
        CIH.printReleve(1, LocalDate.now(), LocalDate.now());


    }
}
