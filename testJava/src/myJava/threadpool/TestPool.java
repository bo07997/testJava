package myJava.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestPool {

	public static void main(String[] args) {
		ExecutorService ThreadExecutor = Executors.newCachedThreadPool();  
		  for (int i = 0; i < 100; i++) {  
		   final int index = i;  
		   ThreadExecutor.execute(new Runnable() {  
		    public void run() {  
		     try { //// 
		      while(true) {  
		       System.out.println("index:"+index);  
		       System.out.println(ThreadExecutor);  
		       Thread.sleep(15 * 1000);  
		      }  
		     } catch (InterruptedException e) {  
		      e.printStackTrace();  
		     }  
		    }  
		   });  
		   try {  
		    Thread.sleep(500);  
		   } catch (InterruptedException e) {  
		    e.printStackTrace();  
		   }  
		  }  
	}
	
	/**
	 * 
	 * @desc: 缓存线程池，如果线程池长度超过处理需要，
	 * 可灵活回收空闲线程，若无可回收，则新建线程（无限大）。
	 * @author: dianbo
	 * @date: 2017年8月29日 上午10:44:24
	 */
	public void Cached(){
		 ExecutorService cachedThreadPool = Executors.newCachedThreadPool();  
		  for (int i = 0; i < 10; i++) {  
		   final int index = i;  
		   try {  
		    Thread.sleep(index * 1000);  
		   } catch (InterruptedException e) {  
		    e.printStackTrace();  
		   }  
		   cachedThreadPool.execute(new Runnable() {  
		    public void run() {  
		     System.out.println(index);  
		    }  
		   }); } 
	}
	
	
/**
 * 定长线程池，可控制最大并发数
 */
	public void Fixed(){
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);  
		  for (int i = 0; i < 10; i++) {  
		   final int index = i;  
		   fixedThreadPool.execute(new Runnable() {  
		    public void run() {  
		     try {  
		      System.out.println(index);  
		      System.out.println(fixedThreadPool);  
		      Thread.sleep(2000);  
		     } catch (InterruptedException e) {  
		      e.printStackTrace();  
		     }  
		    }  
		   });  
		  }  
	}
	/**
	 * 
	 * @desc: 创建一个定长线程池，支持定时及周期性任务执行。
	 * @author: dianbo
	 * @date: 2017年8月29日 上午10:47:45
	 */
	public static void Scheduled1(){
	
	ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);  
	  scheduledThreadPool.schedule(new Runnable() {  
	   public void run() {  
	    System.out.println("delay 3 seconds");  
	   }  
	  }, 3, TimeUnit.SECONDS);  }
	
	public static void Scheduled2(){
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);  
		  scheduledThreadPool.scheduleAtFixedRate(new Runnable() {  
		   public void run() {  
		    System.out.println("delay 1 seconds, and excute every 3 seconds");  
		    System.out.println(scheduledThreadPool);
		   }  
		  }, 1, 3, TimeUnit.SECONDS);  //10秒后，每隔一秒执行一次
	}
	/**
	 * 
	 * @desc: 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，
	 * 保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
	 * @author: dianbo
	 * @date: 2017年8月29日 上午11:02:42
	 */
	public static void Single(){
		 ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();  
		  for (int i = 0; i < 10; i++) {  
		   final int index = i;  
		   singleThreadExecutor.execute(new Runnable() {  
		    public void run() {  
		     try {  
		      System.out.println(index);  
		      System.out.println(singleThreadExecutor);
		      Thread.sleep(2000);  
		     } catch (InterruptedException e) {  
		      e.printStackTrace();  
		     }  
		    }  
		   });  
		  }  
		
	}
	
}
