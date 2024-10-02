/*
* File: Romb.java
* Author: Ritzl Bence
* Copyright: 2024, Ritzl Bence
* Group: Szoft II/1/N
* Date: 2024-10-02
* Github: https://github.com/BenceRitzl99/
* Licenc: GNU GPL
*/


// Ez a program egy rombusz területét számítja ki az e és f átlók segítségével.



import java.util.Scanner;

public class Romb {
    public static Scanner sc = new Scanner(System.in);
    public static void solution() {
        System.out.print("e átló (méter): ");
        String eString = sc.nextLine();
        double e = Double.parseDouble(eString);

        System.out.print("f átló (méter): ");
        String fString = sc.nextLine();
        double f = Double.parseDouble(fString);

        double area = 0.5 * e * f;

        System.out.printf("terület: %.2f", + area);

        
    }
}
