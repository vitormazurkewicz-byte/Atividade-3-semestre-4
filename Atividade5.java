import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("digite um numero:");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        sc.close();
    }
}
