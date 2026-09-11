package Exercice03;

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.0, 5.0);
        System.out.println("Aire : " + r1.aire() + ", périmètre : " + r1.perimetre());

        Rectangle r2 = new Rectangle(3.0);
        System.out.println("Aire : " + r2.aire() + ", périmètre : " + r2.perimetre());

        Rectangle r3 = new Rectangle();
        System.out.println("Aire : " + r3.aire() + ", périmètre : " + r3.perimetre());
    }
}