import java.util.Scanner;

public class EssaiSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer l'extrémité 1 du segment : ");
        int extr1 = sc.nextInt();

        System.out.print("Entrer l'extrémité 2 du segment : ");
        int extr2 = sc.nextInt();

        System.out.print("Entrer la coordonnée du point : ");
        int point = sc.nextInt();

        Segment s = new Segment(extr1, extr2);

        System.out.println("Le segment est : " + s.toString());
        System.out.println("Sa longueur est : " + s.longueur());

        if (s.appartient(point))
            System.out.println("Le point " + point + " appartient au segment.");
        else
            System.out.println("Le point " + point + " n'appartient pas au segment.");
    }
}
