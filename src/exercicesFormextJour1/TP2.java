/**
 * 
 */
package exercicesFormextJour1;

import java.util.Scanner;

/**
 * @author dev
 *
 */
public class TP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// creation d'un scanner pour recupere les entrées sous forme de string
		Scanner entreClavier = new Scanner(System.in);
		String dateBuilder[][] = {
				{ "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre",
						"novembre", "décembre" },
				{ "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" } };

		int[] bissextil = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] nonBissextil = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// choix du type d'année bisextile ou pas
		int[] typeAnnee = choisirAnnées(bissextil, nonBissextil, entreClavier);

		// choix du jour
		// String jour = prendJour(dateBuilder,entreClavier);
		// calcul du jour en fonction du numéro du jour (x/365)
		System.out.println("Veuillez entrer le numéro du jour");
		int numJour = prendNumJour(entreClavier);
		String jourMois = recupereJourMoisAvecNumJour(numJour, typeAnnee, dateBuilder);
		System.out.println(jourMois);
		entreClavier.close();

	}

	/**
	 * Cette méthode retourne le nom du jour et du mois d'après le numéro du jour
	 * passé
	 * 
	 * @param numJour
	 * @param typeAnnee
	 * @param dateBuilder
	 * @return
	 */
	private static String recupereJourMoisAvecNumJour(int numJour, int[] typeAnnee, String[][] dateBuilder) {
		String resultat = null;
		int compteurJour = 0; // compteur qui donnera l'indice dans le tableau des jours
		int compteurMois = 0; // compteur qui donnera l'indice dans le tableau des mois
		compteurJour = numJour;
		// trouver le mois du jour
		while (compteurJour > 31) {
			compteurJour -= typeAnnee[compteurMois];// soustraire les jours du mois en cours au numero du jour
			compteurMois++;// incrementation du numero du mois
		}
		
		int nomJour = (numJour - 1) % 7;// calcul de l'index pour trouver le nom du jour dans le tableau				
		resultat = "Le jour :" + numJour + " est un " + dateBuilder[1][nomJour] + " du mois de "
				+ dateBuilder[0][compteurMois];
		return resultat;

	}

	private static int prendNumJour(Scanner entreClavier) {
		int numJour;
		String jour;
		while (true) {
			jour = entreClavier.nextLine();
			try {
				numJour = Integer.parseInt(jour);
				if (numJour <= 366 && numJour > 0) {
					return numJour;
				}
				System.out.println("Veuillez entrer un nombre inférieur ou égale à 365 et supérieur à zéro, merci");
			} catch (NumberFormatException e) {
				System.out.println(" Veuillez entrer une valeur numérique");

			}

		}

	}

	private static int[] choisirAnnées(int[] bissextil, int[] nonBissextil, Scanner entreClavier) {
		int[] reponseTableau = null;
		System.out.println("Veuillez choisir le type d'année, est-ce une année bissextile ?");
		String reponse = entreClavier.nextLine();
		System.out.println("la reponse : '" + reponse + "'");
		if (reponse.equals("non") || reponse.equals("NON")) {
			reponseTableau = nonBissextil;
			System.out.println("n" + reponseTableau[1]);
		} else {
			reponseTableau = bissextil;
			System.out.println("b" + reponseTableau[1]);
		}
		return reponseTableau;
	}

	/**
	 * récupere une chaine de caractere à partir de la console
	 * 
	 * @param dateBuilder
	 * @param entreClavier2
	 * 
	 * @return
	 */
	private static String prendJour(String[][] dateBuilder, Scanner entreClavier) {
		String jour = null;
		jour = entreClavier.nextLine();
		for (String jourComp : dateBuilder[1]) {
			if (!jour.equals(jourComp)) {
				System.out.println("Ce n'est pas un jour de la semaine, \n Veuillez recommencer");
				jour = entreClavier.nextLine();
				System.out.println(jour);
			} else {
				jour = jourComp;
				break;
			}
		}
		return jour;
	}

	
	
	private void elseif() {
		
		if (true) {
			
		} else if (true){

		}
		
		
	}
}
