import java.util.Random;
import java.util.Scanner;
public class David_repeticio2_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        String jugadorposletra = "";
        int contador = 0, jugadorpos = -2,jugadornum = -1, posicio,numero;
        
        posicio = rand.nextInt(4 - 1 + 1) +1;
        numero = rand.nextInt(4 - 1 +1)+1;
        for (int i=0; i <5;i++){
            //IMPRIME LA FILA 0
            if (i == 0) {
                System.out.print("  A B C D");
            }
            //IMPRIME LAS COLUMNAS *
            for (int j = 0;j<4;j++) {
                if (i !=0){
                    System.out.print("* ");
                }
            }
            System.out.println("");
            if (i <=3) {
                System.out.print(i +1 +" ");
            }
        }
        System.out.println(posicio);
        System.out.println(numero);
        //MIENTRAS SEA DIFERENTE POSICION I EL NUMEOR ENTRA
        while (jugadorpos != posicio || jugadornum != numero){
            System.out.println("Entra la lletra");
            if (entrada.hasNextLine()) {
                jugadorposletra = entrada.next();
            }
            System.out.println("Entra el numero");
            if (entrada.hasNextInt()){
                jugadornum = entrada.nextInt();
            }
            //PASAR LETRA A NUMERO
            switch (jugadorposletra){
                case "A": 
                    jugadorpos = 1;
                break;
                case "B":
                    jugadorpos = 2;
                break;
                case "C":
                    jugadorpos = 3;
                break;
                case "D":
                    jugadorpos = 4;
                break;
                default:
                    System.out.println("Error");
            }
            //SI SON IGUALES ENTRA
            if (jugadorpos == posicio && jugadornum == numero) {
                System.out.println("GUANYA: TOCAT I ENFONSAT");
                System.out.println("INTENTS: " + contador);
                //IMPRIME FILAS
                for (int i=0; i <5;i++){
                    if (i == 0) {
                        System.out.print("  A B C D");
                    }
                    //IMPRIME COLUMNAS
                    for (int j = 0;j<4;j++) {
                        if (i !=0){
                            if (j == posicio-1 && i == numero){
                                System.out.print("V ");
                            }else{
                                System.out.print("* ");
                            }
                        }
                    }
                    System.out.println("");
                    if (i <=3) {
                        System.out.print(i +1 +" ");
                    }
                }
            }else{
                System.out.println("Casi, torna a intentar-ho");
                contador ++;
            }
        }
    }
}
