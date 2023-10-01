/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author IQBAL
 */
import java.util.Scanner;

public class DuckSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bebek  yang anda? :");
        System.out.println(" ");
        System.out.println("1. Mallard Duck");
        System.out.println("2. Rubber Duck");
        System.out.println("3. Decoy Duck");
        System.out.println("4. Model Duck");
        int pilih_bebek = scanner.nextInt();

        Duck duck = null;

        switch (pilih_bebek) {
            case 1 -> duck = new MallardDuck();
            case 2 -> duck = new RubberDuck();
            case 3 -> duck = new DecoyDuck();
            case 4 -> duck = new ModelDuck();
            default -> {
                System.out.println("Pilihan yang anda masukan tidak ada!");
                return;
            }
        }

        System.out.println("Pilihan anda : " + duck.getClass().getSimpleName());

        duck.performQuack();
        duck.performFly();
    }
}
