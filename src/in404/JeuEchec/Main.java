package in404.JeuEchec;
import java.util.Scanner;
/**
 * Représente l'application.
 *
 * @version  alpha 0.0
 * @author   Me
 *
 */
enum Main {
    ENVIRONNEMENT;

    private Scanner sc;

	/*
     * Méthode principale du programme.
     * @param args void
     */
    public void run(String[] args) {

        //Initialisation du plateau

        Plateau p1 = new Plateau();

        p1.InitPlateau(p1);

        p1.Afficher();

        sc = new Scanner(System.in);
        int x;
        int y;
        int xTarget;
        int yTarget;
       
        //Lecture du clavier
        while (true) {
            do {
                    System.out.println("Veuillez saisir les coordonnées position:");
                    String str = sc.nextLine();
                    x = str.charAt(0);
                    y = str.charAt(1);
                    System.out.println(p1.getPiece(x - 'a', y - '1'));
                } while (p1.getPiece(x - 'a', y - '1') == null);
            do {
                System.out.println("Veuillez saisir les coordonnées cible:");
                String str = sc.nextLine();
                xTarget = str.charAt(0);
                yTarget = str.charAt(1);
            }while (!(p1.movePiece(new Point(x-'a',y-'1'),new Point(xTarget - 'a', yTarget - '1'))));
            p1.Afficher();
        }
        
    }

    /*
     * Point d'entrée du programme.
     * @param args void
     */
    public static void main(String[] args) {
        ENVIRONNEMENT.run(args);
    }
}