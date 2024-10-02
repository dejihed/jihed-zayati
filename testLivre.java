package tp_1;

/*public class testLivre {
    public static void main(String[] args) {
        Livre tab[]=new Livre[3];
        tab[0] = new Livre(225,"Coelho", "L'alchimiste");  
        tab[1] = new Livre(508, "La Tunisie");              
        tab[2] = new Livre("JK Rowling", "Harry Potter");  

        for (int i=0;i<3;i++) {
            System.out.println(tab[i].toString());
        }

        tab[1].setAuteur("Paulo Coelho");

        tab[2].setNbPages(461);

        System.out.println("\naprès modifications :");
        for (int i=0;i<3;i++) {
            tab[i].decrire();

        }
    }
}
*/
public class testLivre {
    public static void main(String[] args) {
        livre4 tab[] = new livre4[3];
        tab[0] = new livre4("Paulo Coelho", "L'alchimiste" ,15.99,225);
        tab[1] = new livre4( 508,"La Tunisie");
        tab[2] = new livre4("JK Rowling", "Harry Potter");
        for (int i = 0; i < 3; i++) {
            System.out.println(tab[i].toString());
        }
        tab[1].setAuteur("Paulo Coelho");
        tab[2].setNbPages(461);
        tab[1].setPrix(20.0);
        System.out.println("Prix fixé pour le livre 1 : " + tab[1].testPrix());
        tab[1].setPrix(25.0);
        for (int i = 0; i < 3; i++) {
            tab[i].decrire();
            System.out.println("l'auteur :"+tab[i].getAuteur());
        }
    }
}
