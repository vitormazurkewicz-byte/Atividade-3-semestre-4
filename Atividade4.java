import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[2][3];
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("digite um numero:");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] % 2 == 0) {
                    contador++;
                }
            }
        }
        System.out.println("quantidade de pares: " + contador);
        sc.close();
    }
}
