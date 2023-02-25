/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.animales;

import java.util.Scanner;

/**
 *
 * @author userago2022
 */
public class Animales {

    /*PUBLICAR EN GITHUB
    //https://javiergarciaescobedo.es/programacion-en-java/29-trucos/354-alojar-proyecto-netbeans-en-github#:~:text=En%20el%20proyecto%20de%20NetBeans,el%20men%C3%BA%20Team%20%3E%20Git).
    //resolver prolema de acceso not autorized: https://github.com/githubschool/foundations-4-28-15/issues/11#issuecomment-915021762
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char op1;
        System.out.println("Hola. Contesta las siguientes preguntas porfavor. y[si] /n[no] ");
        do {
            System.out.println("¿Eres un animal marino?");
            op1 = Character.toLowerCase(leer.next().charAt(0));
        } while (op1 != 'n' && op1 != 'y');

        switch (op1) {
            case 'y':
                do {
                    System.out.println("¿Eres un mamífero?");
                    op1 = Character.toLowerCase(leer.next().charAt(0));
                } while (op1 != 'n' && op1 != 'y');
                switch (op1) {
                    case 'y':
                        do {
                            System.out.println("¿Tienes un espiráculo?");
                            op1 = Character.toLowerCase(leer.next().charAt(0));
                        } while (op1 != 'n' && op1 != 'y');

                        switch (op1) {
                            case 'y':
                                System.out.println("Eres un delfín");
                                break;
                            case 'n':
                                do {
                                    System.out.println("¿Eres endémica de México?");
                                    op1 = Character.toLowerCase(leer.next().charAt(0));
                                } while (op1 != 'n' && op1 != 'y');

                                switch (op1) {
                                    case 'y':
                                        System.out.println("Eres una vaquita marina");
                                        break;
                                    case 'n':
                                        System.out.println("Eres una foca");
                                        break;
                                }
                                break;
                        }
                        break;
                    //oviparos
                    case 'n':
                        do {
                            System.out.println("¿Eres un ave?");
                            op1 = Character.toLowerCase(leer.next().charAt(0));
                        } while (op1 != 'n' && op1 != 'y');

                        switch (op1) {
                            case 'y':
                                System.out.println("Eres un pinguino");
                                break;
                            case 'n':
                                do {
                                    System.out.println("¿Tienes tentáculos?");
                                    op1 = Character.toLowerCase(leer.next().charAt(0));
                                } while (op1 != 'n' && op1 != 'y');
                                switch (op1) {
                                    case 'y':
                                        System.out.println("Eres una medusa");
                                        break;
                                    case 'n':
                                        System.out.println("Eres un tiburón");
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;

            //terrestres
            case 'n':
                do {
                    System.out.println("¿Eres un mamífero?");
                    op1 = Character.toLowerCase(leer.next().charAt(0));
                } while (op1 != 'n' && op1 != 'y');

                switch (op1) {
                    case 'y':
                        do {
                            System.out.println("¿Eres un roedor?");
                            op1 = Character.toLowerCase(leer.next().charAt(0));
                        } while (op1 != 'n' && op1 != 'y');

                        switch (op1) {
                            case 'y':
                                do {
                                    System.out.println("¿Tienes una cola anillada?");
                                    op1 = Character.toLowerCase(leer.next().charAt(0));
                                } while (op1 != 'n' && op1 != 'y');

                                switch (op1) {
                                    case 'y':
                                        System.out.println("Eres un mapache.");
                                        break;
                                    case 'n':
                                        do {
                                            System.out.println("¿Tienes una cola corta?");
                                            op1 = Character.toLowerCase(leer.next().charAt(0));
                                        } while (op1 != 'n' && op1 != 'y');

                                        switch (op1) {
                                            case 'y':
                                                System.out.println("Eres un conejo");
                                                break;
                                            case 'n':
                                                System.out.println("Eres una ardilla");
                                                break;
                                        }

                                        break;
                                }
                                break;

                            //felino, insectos   y caninos
                            case 'n':
                                do {
                                    System.out.println("¿Eres un canino?");
                                    op1 = Character.toLowerCase(leer.next().charAt(0));
                                } while (op1 != 'n' && op1 != 'y');

                                switch (op1) {
                                    case 'y':
                                        System.out.println("Eres un perro");
                                        break;
                                    case 'n':
                                        do {
                                            System.out.println("¿Eres un felino?");
                                            op1 = Character.toLowerCase(leer.next().charAt(0));
                                        } while (op1 != 'n' && op1 != 'y');

                                        switch (op1) {
                                            //todos los felinos
                                            case 'y':
                                                do {
                                                    System.out.println("¿Eres un animal doméstico?");
                                                    op1 = Character.toLowerCase(leer.next().charAt(0));
                                                } while (op1 != 'n' && op1 != 'y');

                                                switch (op1) {
                                                    case 'y':
                                                        System.out.println("Eres un gato");
                                                        break;
                                                    case 'n':
                                                        do {
                                                            System.out.println("¿Tienes melena?");
                                                            op1 = Character.toLowerCase(leer.next().charAt(0));
                                                        } while (op1 != 'n' && op1 != 'y');

                                                        switch (op1) {
                                                            case 'y':
                                                                System.out.println("Eres un león");
                                                                break;
                                                            case 'n':
                                                                do {
                                                                    System.out.println("¿Tienes el pelaje negro?");
                                                                    op1 = Character.toLowerCase(leer.next().charAt(0));
                                                                } while (op1 != 'n' && op1 != 'y');

                                                                switch (op1) {
                                                                    case 'y':
                                                                        System.out.println("Eres una pantera.");
                                                                        break;
                                                                    case 'n':
                                                                        do {
                                                                            System.out.println("¿Tienes marcas de color negro?");
                                                                            op1 = Character.toLowerCase(leer.next().charAt(0));
                                                                        } while (op1 != 'n' && op1 != 'y');

                                                                        switch (op1) {
                                                                            case 'y':
                                                                                do {
                                                                                    System.out.println("¿Las marcas son rayas verticales?");
                                                                                    op1 = Character.toLowerCase(leer.next().charAt(0));
                                                                                } while (op1 != 'n' && op1 != 'y');

                                                                                switch (op1) {
                                                                                    case 'y':
                                                                                        System.out.println("Eres un tigre.");
                                                                                        break;
                                                                                    case 'n':
                                                                                        System.out.println("Eres un leopardo.");
                                                                                        break;
                                                                                }
                                                                                break;
                                                                            case 'n':
                                                                                System.out.println("Eres una puma.");
                                                                                break;
                                                                        }
                                                                        break;

                                                                }
                                                                break;
                                                        }
                                                }
                                                break;

                                            case 'n':
                                                do {
                                                    System.out.println("¿Estas extinto?");
                                                    op1 = Character.toLowerCase(leer.next().charAt(0));
                                                } while (op1 != 'n' && op1 != 'y');

                                                switch (op1) {
                                                    case 'y':
                                                        System.out.println("Eres un mamut.");
                                                        break;
                                                    case 'n':
                                                        do {
                                                            System.out.println("¿Tienes el cuello más largo del mundo?");
                                                            op1 = Character.toLowerCase(leer.next().charAt(0));
                                                        } while (op1 != 'n' && op1 != 'y');
                                                        switch (op1) {
                                                            case 'y':
                                                                System.out.println("Eres una jirafa.");
                                                                break;
                                                            case 'n':
                                                                System.out.println("Eres un oso.");
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }

                                break;
                        }
                        break;

                    //terrestres-oviparos
                    case 'n':
                        do {
                            System.out.println("¿Tienes Alas?");
                            op1 = Character.toLowerCase(leer.next().charAt(0));
                        } while (op1 != 'n' && op1 != 'y');
                        switch (op1) {
                            case 'y':
                                do {
                                    System.out.println("¿Tienes plumas?");
                                    op1 = Character.toLowerCase(leer.next().charAt(0));
                                } while (op1 != 'n' && op1 != 'y');

                                switch (op1) {
                                    case 'n':
                                        do {
                                            System.out.println("¿Muchas veces eres considerado símbolo de suciedad?");
                                            op1 = Character.toLowerCase(leer.next().charAt(0));
                                        } while (op1 != 'n' && op1 != 'y');

                                        switch (op1) {
                                            case 'y':
                                                System.out.println("Eres una mosca.");
                                                break;
                                            case 'n':
                                                System.out.println("Eres una mariposa.");
                                                break;
                                        }

                                        break;
                                    case 'y':
                                        System.out.println("Eres un gallo.");
                                        break;
                                }

                                break;
                            case 'n':
                                System.out.println("Eres una hormiga.");
                                break;
                        }

                        break;
                }
                break;
        }
    }
}
