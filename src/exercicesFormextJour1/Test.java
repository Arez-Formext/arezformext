/**
 * 
 */
package exercicesFormextJour1;

import java.util.Arrays;

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
	 * Affiche une chaine de carateres en parametre
	 * 
	 * @param texte
	 */
	public static void affiche(String texte) {
		System.out.println(texte);
	}

	/**
	 * Affiche les éléments d'un tableau
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
