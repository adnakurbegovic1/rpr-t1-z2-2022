import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int suma = 0;
        while(n != 0){
            suma = suma + n%10;
            n = n/10;
        }
        return suma;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int broj = in.nextInt();

        for(int i = 1; i <= broj; i++){
            if(i %sumaCifara(i) == 0){
                System.out.println(i + " ");
            }
        }

    }
}