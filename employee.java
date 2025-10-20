package exercice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class employee {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        List<Double> salaires = new ArrayList<>();
        String nom, prenom, ch;
        int age;
        double salaire;

        do {
            System.out.println("Donnez nom:");
            nom = clavier.nextLine();

            System.out.println("Donnez prenom:");
            prenom = clavier.nextLine();

            System.out.println("Donnez l'age:");
            age = clavier.nextInt();

            System.out.println("Donnez le salaire:");
            salaire = clavier.nextDouble();
            salaires.add(salaire);
            clavier.nextLine();

            System.out.println("Voulez-vous ajouter un autre employé ? (oui/non)");
            ch = clavier.nextLine().trim().toLowerCase();

        } while (ch.equals("oui"));

        if (!salaires.isEmpty()) {
            double maxSalaire = salaires.get(0);
            for (double s : salaires) {
                if (s > maxSalaire) {
                    maxSalaire = s;
                }
            }
            System.out.println("Le salaire le plus grand est : " + maxSalaire);
        } else {
            System.out.println("Aucun salaire saisi.");
        }

        clavier.close();
    }
}
