/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luchadores;


import java.util.Random;
import java.util.Scanner;

public class Luchadores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Luchador_Guerrero stiven = new Luchador_Guerrero("Stiven", 1000, 170, 60);
        Luchador_Guerrero juan = new Luchador_Guerrero("Juan", 1000, 154, 80);

        while (stiven.getHP() > 0 && juan.getHP() > 0) {
            // Turno de Stiven
            System.out.println("\n--- Turno de " + stiven.getNombre() + " ---");
            System.out.println("HP: " + stiven.getHP() + " | ATK: " + stiven.getATK() + " | DEF: " + stiven.getDEF());
            System.out.println("1. Atacar | 2. Aumentar fuerza | 3. Defender escudo | 4. Ataque espada");
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    stiven.Atacar(juan);
                    break;
                case 2:
                    stiven.aumentar_Fuerza();
                    break;
                case 3:
                    stiven.defender_escudo();
                    break;
                case 4:
                    stiven.ataque_espada(juan);
                    break;
                default:
                    System.out.println("Opción no válida, pierdes turno!");
            }

            if (juan.getHP() <= 0) break;

            // Turno de Juan
            System.out.println("\n--- Turno de " + juan.getNombre() + " ---");
            System.out.println("HP: " + juan.getHP() + " | ATK: " + juan.getATK() + " | DEF: " + juan.getDEF());
            System.out.println("1. Atacar | 2. Aumentar fuerza | 3. Defender escudo | 4. Ataque espada");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    juan.Atacar(stiven);
                    break;
                case 2:
                    juan.aumentar_Fuerza();
                    break;
                case 3:
                    juan.defender_escudo();
                    break;
                case 4:
                    juan.ataque_espada(stiven);
                    break;
                default:
                    System.out.println("Opción no válida, pierdes turno!");
            }
        }

        // Mostrar ganador
        System.out.println("\n¡COMBATE TERMINADO!");
        System.out.println("El ganador es: " + (stiven.getHP() > 0 ? stiven.getNombre() : juan.getNombre()) + "!");
        scanner.close();
    }
}