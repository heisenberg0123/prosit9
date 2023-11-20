import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList<T extends employés> implements IGestion<T> {
    private ArrayList<T> listeEmployes;

    public SocieteArrayList() {
        listeEmployes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(T t) {
        listeEmployes.add(t);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (T employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(T t) {
        return listeEmployes.contains(t);
    }

    @Override
    public void supprimerEmploye(T t) {
        listeEmployes.remove(t);
    }

    @Override
    public void displayEmploye() {
        for (T employe : listeEmployes) {
            System.out.println(employe.toString());
        }
    }



    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, Comparator.comparing(employés::getNomDepartement)
                .thenComparing(employés::getGrade));
    }
}

