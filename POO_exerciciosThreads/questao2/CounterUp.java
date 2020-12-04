package questao2;

public class CounterUp extends Thread{
    Counter counter;

    public CounterUp(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for (int i = 0; i < 20; i++){
            this.counter.increment();
            int tempoSleepRandom = (int) Math.ceil(500 * Math.random());
            try{
                Thread.sleep(tempoSleepRandom);
            }
            catch (Exception e){
                System.out.println("problema no sleep");
                e.printStackTrace();
            }
        }
    }

}
