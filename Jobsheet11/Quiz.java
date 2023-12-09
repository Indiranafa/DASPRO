package Jobsheet11;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        char menu = 'Y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();

                if (answer == number) {
                    success = true;
                    System.out.println("Selamat! Tebakan Anda benar!");
                } else if (answer < number) {
                    System.out.println("Tebakan Anda terlalu kecil. Coba lagi.");
                } else {
                    System.out.println("Tebakan Anda terlalu besar. Coba lagi.");
                }
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = sc.nextLine().charAt(0);

            if(menu != 'y' || menu == 'Y'){
                break;
            }
        }while(menu=='y'|| menu=='Y');
    }
}
