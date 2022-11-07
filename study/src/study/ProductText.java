package study;

/**
 *
 */

class Clerk {

    private int productCount = 0;
    //生产产品
    public synchronized void produceProduct(){

        if (productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+"开始生产第"+productCount+"个产品");
        } else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //消费产品
    public synchronized void consumeProduct() {

        if (productCount > 0){
            System.out.println(Thread.currentThread().getName()+"开始消费第"+productCount+"个产品");
            productCount--;
        }else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class Producer extends Thread{//生产者

    private final Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    public void run(){
        System.out.println(getName()+"：开始生产产品。。。。");

        //noinspection InfiniteLoopStatement
        while(true){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            clerk.produceProduct();
        }
    }
}

class Consumer extends Thread{//消费者
    private final Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    public void run(){
        System.out.println(getName()+"：开始消费产品。。。。");

        //noinspection InfiniteLoopStatement
        while(true){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            clerk.consumeProduct();
        }
    }
}

public class ProductText {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者1");

        p1.start();
        c1.start();
    }
}
