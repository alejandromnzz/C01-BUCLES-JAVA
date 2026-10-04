
import java.util.Random;

public class StarWars {
    public static void main(String[] args){
        char[][] SW = new char[10][10];
        for (int filas=0; filas<10; filas++){
            for (int columnas=0; columnas<10; columnas++){
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

        for (int filas=0; filas<10; filas++){
            for (int columnas=0; columnas<10; columnas++){
                System.out.print(SW[filas][columnas]);
                System.out.print(' ');
            }
            System.out.println(' ');
        }
    }
}
