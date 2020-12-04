package questao2;

public class Counter {
    private int count = 0;

    public int getCounter(){
        return this.count;
    }

    synchronized void increment(){
        if (this.count < 3){
            this.count += 1;
            System.out.println("valor de count aumentado, novo valor: " + this.count);
        }
        else{
            System.out.println("esperando para poder aumentar...");
        }
    }

    synchronized void decrement(){
        if (this.count > 0){
            this.count -= 1;
            System.out.println("valor de count diminuido, novo valor: " + this.count);
        }
        else{
            System.out.println("esperando para poder diminuir...");
        }
    }

}
