package CHALLENGE;

import java.util.Random;

public class StarWars {
    public static void main(String[] args){
        char[][] SW = new char[10][10];
        int filas, columnas;
        for (filas=0; filas<10; filas++){
            for (columnas=0; columnas<10; columnas++){
                SW[filas][columnas]='.';
            }
        }

        Random random = new Random();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);

        SW[num1][num2] = 'V';

        do{
            num1 = random.nextInt(10);
            num2 = random.nextInt(10);
        } while (SW[num1][num2]!='.');

        SW[num1][num2] = 'Y';

        for (int i=0; i<5; i++){
            do{
                num1 = random.nextInt(10);
                num2 = random.nextInt(10);
            } while (SW[num1][num2]!='.');

            SW[num1][num2] = '#';
        }

        int Vader, Yoda, Muros, Puntos, Dimension, Total;
        Vader=0;
        Yoda=0;
        Muros=0;
        Puntos=0;
        Total=0;

        for (filas=0; filas<10; filas++){
            for (columnas=0; columnas<10; columnas++) {
                if (SW[filas][columnas] == 'V') {
                    Vader = Vader + 1;
                } else if (SW[filas][columnas] == 'Y') {
                    Yoda = Yoda + 1;
                } else if (SW[filas][columnas] == '#') {
                    Muros = Muros + 1;
                } else if (SW[filas][columnas] == '.') {
                    Puntos = Puntos + 1;
                }
                Total = Total + 1;
            }
        }

        System.out.println("PRIMER ANALISIS DE TABLERO");
        System.out.println("Vader encontrados: " + Vader);
        System.out.println("Yoda encontrados: " + Yoda);
        System.out.println("Muros encontrados: " + Muros);
        System.out.println("Posiciones Libres: " + Puntos);
        System.out.println("Total de posiciones: " + Total);

        for (filas=0; filas<10; filas++){
            for (columnas=0; columnas<10; columnas++){
                System.out.print(SW[filas][columnas]);
                System.out.print(' ');
            }
            System.out.println(' ');
        }

        System.out.println(' ');


        for (int i=0; i<5; i++){
            do{
                num1 = random.nextInt(10);
                num2 = random.nextInt(10);
            } while (SW[num1][num2]!='.');

            SW[num1][num2] = '#';
        }

        Vader=0;
        Yoda=0;
        Muros=0;
        Puntos=0;
        Total=0;

        for (filas=0; filas<10; filas++){
            for (columnas=0; columnas<10; columnas++) {
                if (SW[filas][columnas] == 'V') {
                    Vader = Vader + 1;
                } else if (SW[filas][columnas] == 'Y') {
                    Yoda = Yoda + 1;
                } else if (SW[filas][columnas] == '#') {
                    Muros = Muros + 1;
                } else if (SW[filas][columnas] == '.') {
                    Puntos = Puntos + 1;
                }
                Total = Total + 1;
            }
        }

        System.out.println("SEGUNDO ANALISIS DE TABLERO");
        System.out.println("Vader encontrados: " + Vader);
        System.out.println("Yoda encontrados: " + Yoda);
        System.out.println("Muros encontrados: " + Muros);
        System.out.println("Posiciones Libres: " + Puntos);
        System.out.println("Total de posiciones: " + Total);

        for (filas=0; filas<10; filas++){
            for (columnas=0; columnas<10; columnas++){
                System.out.print(SW[filas][columnas]);
                System.out.print(' ');
            }
            System.out.println(' ');
        }

    }
}