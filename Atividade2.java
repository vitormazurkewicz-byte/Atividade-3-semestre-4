import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("digite um numero:");
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }
        System.out.println("soma: " + soma);
        sc.close();
    }
}
