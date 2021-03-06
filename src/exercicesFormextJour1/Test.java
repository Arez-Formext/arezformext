/**
 * 
 */
package exercicesFormextJour1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dev
 *
 */
public class Test {

	/**
	 * methode main, c'est celle qui se lance pour la totalité du projet, c'est le
	 * point d'entrée
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// try to be clear and simple
		// System.out.println("Hello world");
		// System.err.println("coucou l'erreur");
		affiche("Bonjour");
		affiche("à tous");
		/*
		 * exercice 1 crée un tableau de string, puis afficher la concatenation du
		 * contenu du tableau
		 */

		// creation du tableau
		String[] maListe = { "Bonjour", "à tous" };
		// afficahge de la concatenation
		System.out.println(maListe[0] + " " + maListe[1]);

		// passant par une methode
		affiche((maListe[0] + maListe[1]));

		// affiche la concatenation dus contenu du tableau
		String[] tableau = new String[2];
		tableau[0] = "coucou";
		tableau[1] = "les amis";
		affiche(tableau);

		// affiche les élément du tableau ou autrement dit sa structure
		String structureTableau = Arrays.toString(tableau);
		affiche(structureTableau);

		// affiche les élément d'un tableau par une boucle while
		afficheParBoucleWhile(tableau);
		// affiche les élément d'un tableau par une boucle while
		afficheParBoucleDo(tableau);
		// affiche les élément d'un tableau par une boucle while
		afficheParBoucleForeach(tableau);

		// deux chaine de caractere dans un tableau "tu as" et "ans"
		// une valeur int de l'age dans une variable
		String[] morceauPhrase = { "Tu as", "ans" };
		int age = 18;
		afficheAge(morceauPhrase, age);

		// faire la même chose que précédement mais avec une boucle for et un if
		afficheAgeBoucle(morceauPhrase, age);
		System.out.println(" ");
		// faire la même chose que précédement maisavec modulo
		afficheAgeModulo(morceauPhrase, age);

		// faire la même chose que précédement maisavec if ternaire
		afficheAgeTernaire(morceauPhrase, age);

		// Exemple de if ternaire exemple inbriqué, deux
		// conditions, trois résultats possibles
		afficheCategoriePersonne(age);

		// Exemple de Scanner
		String clavier = recupereEntréeClavier();
		System.out.println("l\'entée clavier est : " + clavier);

	}

	private static String recupereEntréeClavier() {
		String test = null;
		Scanner entreeClavierConsole = new Scanner(System.in);
		test = entreeClavierConsole.nextLine();
		
		return test;
	}

	private static void afficheAgeTernaire(String[] morceauPhrase, int age) {
		for (int i = 0; i < morceauPhrase.length; i++) {
			String resultat = i < 1 ? morceauPhrase[i] + " " + age + " " : morceauPhrase[i];
		}

	}

	private static void afficheCategoriePersonne(int age) {
		String cat = age < 18 ? age > 3 ? "pas enfant" : "enfant" : "adulte";
		System.out.println("\nLa personne est classée dans la catégorie : " + cat);

	}

	/**
	 * 
	 * @param morceauPhrase
	 * @param age
	 */
	private static void afficheAgeModulo(String[] morceauPhrase, int age) {
		System.out.println("Methode modulo");
		for (int i = 0; i < morceauPhrase.length; i++) {
			if (i % 2 == 1) {
				System.out.print(" " + age + " ");
			}
			System.out.print(morceauPhrase[i]);
		}
	}

	private static void afficheAgeBoucle(String[] morceauPhrase, int age) {
		for (String morceau : morceauPhrase) {
			System.out.print(morceau);
			// if(morceau==morceauPhrase[morceauPhrase.length-2]) { correction ligne
			// suivante
			if (!morceau.equals(morceauPhrase[morceauPhrase.length - 1])) {
				System.out.print(" " + age + " ");
			}
		}

	}

	private static void afficheAge(String[] morceauPhrase, int age) {
		System.out.println(morceauPhrase[0] + " " + age + " " + morceauPhrase[1]);

	}

	/**
	 * affichage par boucle foreach des élément d'un tableau
	 * 
	 * @param tableau
	 */
	private static void afficheParBoucleForeach(String[] tableau) {
		for (String element : tableau) {
			System.out.print(element);
			if (!element.equals(tableau[tableau.length - 1])) {
				System.out.print(" ");
			} else {
				System.out.println("");
			}
		}

	}

	/**
	 * affichage par boucle do des élements d'un tableau
	 * 
	 * @param tableau
	 */
	private static void afficheParBoucleDo(String[] tableau) {
		int index = 0;
		do {
			System.out.print(tableau[index]);
			index++;
			if (index < tableau.length) {
				System.out.print(" ");
			}
		} while (index == (tableau.length) - 1);
		System.out.println();
	}

	/**
	 * boucle while daffichage des élements d'un tableau
	 * 
	 * @param tableau
	 */
	private static void afficheParBoucleWhile(String[] tableau) {
		int index = 0;
		while (index < tableau.length) {
			System.out.print(tableau[index]);
			index++;
			if (index < tableau.length) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	/**
	 * Affiche une chaine de carateres passée en parametre
	 * 
	 * @param texte
	 */
	public static void affiche(String texte) {
		System.out.println(texte);
	}

	/**
	 * Affiche les éléments d'un tableau de deux éléments séparés par un espace
	 * 
	 * @param tab
	 */
	public static void affiche(String[] tab) {
		System.out.println(tab[0] + " " + tab[1]);
	}

	/**
	 * affiche le nombre d'élements contenu d'un tableau selon un nombre voulu avec
	 * un controle de dépassement
	 * 
	 * @param tab
	 * @param lengthTab
	 */
	public static void affiche(String[] tab, int lengthTab) {
		if (lengthTab < tab.length) {

		}
	}

}
