public class TesteCompte {
    public static void main(String[] args) {
        Compte c1 = new Compte();
        Compte c2 = new Compte();
        c1.deposer(500);
        c2.deposer(1000);
        c2.retirer(10);
        c1.virerVers(75, c2);
        c1.afficher();
        c2.afficher();
        Compte[] comptes = new Compte[10];
        for (int i = 0; i < comptes.length; i++) {
            comptes[i] = new Compte();
            comptes[i].deposer(200 + 100 * i);
        }
        for (int i = 5; i < comptes.length; i++) {
            comptes[i - 5].virerVers(20, comptes[i]);
        }
        for (int i = 0; i < comptes.length; i++) {
            comptes[i].afficher();
        }
    }
}