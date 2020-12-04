package questao2;

public class CounterUser {
    public static void main(String[] args) {
        Counter counter = new Counter();
        
        CounterUp counterUpThread = new CounterUp(counter);
        counterUpThread.start();

        CounterDown counterDownThread = new CounterDown(counter);
        counterDownThread.start();

        // testando para ve se estou lidando com o mesmo contador em ambas as threads
        // para testar isso, comente as linhas 8 e 11, e descomente a linha 15
        // System.out.println("eh o mesmo contador: " + counterUpThread.counter.equals(counterDownThread.counter));
    }
}
