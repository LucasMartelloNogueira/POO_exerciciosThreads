package questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class questao1Main implements Runnable{
    static int qntDeNumsPrimos = 0;
    int inicio;
    int fim;
    ArrayList<Integer> listaNums = new ArrayList<>();

    questao1Main(int inicio, int fim){
        this.inicio = inicio;
        this.fim = fim;

        for (int i = inicio; i < fim; i++){
            this.listaNums.add(i);
        }
    }

    public static boolean numEhPrimo(int n){
        if (n <= 3){
            return n > 1;
        }
        else if (n % 2 == 0 || n % 3 == 0){
            return false;
        }
        else{
            int i = 5;
            while (Math.pow(i, 2) <= n){
                if (n % i == 0 || n % (i+2) == 0){
                    return false;
                }
                i += 6;
            }
            return true;
        }
    }

    public void obterQntNumsPrimos(){

        for (int n : this.listaNums){
            if (numEhPrimo(n) == true){
                qntDeNumsPrimos += 1;
                System.out.printf("o array de (%d a %d) achou um primo!\n", this.inicio, this.fim);
                System.out.println("a quantidade de nums primos encontrados eh: " + qntDeNumsPrimos);
            }
        }

        
    }

    public void run(){
        this.obterQntNumsPrimos();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero maior que 1: ");
        int n = scanner.nextInt();
        scanner.close();
        int metade = (int) n/2;

        questao1Main obj1 = new questao1Main(0, metade);
        Thread obj1Thread = new Thread(obj1);
        obj1Thread.start();

        questao1Main obj2 = new questao1Main(metade, n);
        Thread obj2Thread = new Thread(obj2);
        obj2Thread.start();
    }
}


