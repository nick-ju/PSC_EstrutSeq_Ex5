//Faça um Programa que converta metros para centímetros.//

package ex_5;

import java.util.Scanner;

public class ex_5 {

    public static void main(String[] args) {
        int metros = 0;
        int centimetros = 0;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Insira a medida em metros: ");
        metros = sc1.nextInt();
        centimetros = metros*100;
        System.out.println(centimetros + " cm");
    }
}
