package tp1;
import java.util.Scanner;
public class g1 {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Donnez une chaine");
		String ch= clavier.nextLine();
		System.out.println("Donnez a");
		int a=clavier.nextInt();
		System.out.println("Donnez b");
		int b=clavier.nextInt();
		System.out.println("Donnez c");
		int c=clavier.nextInt();
		int s=a+b+c;
		System.out.println(ch+" la somme de 3 entier est "+s);
		int x=a*b*c;
		System.out.println(ch+" le produit de 3 entier est "+x);
		int moy =s/3;
		System.out.println(ch+" le moy de 3 entier est "+moy);
		clavier.close();
	}

}
