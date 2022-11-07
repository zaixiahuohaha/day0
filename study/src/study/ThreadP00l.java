package study;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * 创建线程的方式四：使用线程池
 */

class NumberThread implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            if (i%2==0)
                System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

}

class NumberThread1 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            if (i%2!=0)
                System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

}

public class ThreadP00l {
    public static void main(String[] args) {
//1提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;

        //设置线程池的属性
       // System.out.println(service.getClass());
        service1.setCorePoolSize(15);
        //service1.setKeepAliveTime();

//2：执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new NumberThread());////适合使用于Runnable
        service.execute(new NumberThread1());////适合使用于Runnable
      // service.submit(Callable callable);适合使用于Callable
//关闭连接池
        service.shutdown();
    }
}
