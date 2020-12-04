package questao2;

public class CounterDown extends Thread{
    Counter counter;

    public CounterDown(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for (int i = 0; i < 20; i++){
            this.counter.decrement();
            int tempoSleepRandom = (int) Math.ceil(500 * Math.random());
            try{
                Thread.sleep(tempoSleepRandom);
            }
            catch (Exception e){
                System.out.println("problema no sleep");
                e.printStackTrace();
            }
        }
        System.out.println("Valor counter down:" + this.counter.getCounter());
    }
}
