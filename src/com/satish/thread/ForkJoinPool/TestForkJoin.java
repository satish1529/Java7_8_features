package com.satish.thread.ForkJoinPool;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

public class TestForkJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	
	private static void test()
	{
		ForkJoinPool es = new ForkJoinPool(10);
		ForkJoinTask<List<String>> fjt = new RecusiveTaskImpl("D://personal//");
		//es.execute(fjt);
		//es.invoke(fjt);
		es.submit(fjt);
		System.out.println("running");
		do
	      {
	         System.out.printf("******************************************\n");
	         System.out.printf("Main: Parallelism: %d\n", es.getParallelism());
	         System.out.printf("Main: Active Threads: %d\n", es.getActiveThreadCount());
	         System.out.printf("Main: Task Count: %d\n", es.getQueuedTaskCount());
	         System.out.printf("Main: Steal Count: %d\n", es.getStealCount());
	         System.out.printf("******************************************\n");
	         try
	         {
	            TimeUnit.SECONDS.sleep(1);
	         } catch (InterruptedException e)
	         {
	            e.printStackTrace();
	         }
	      } while ((!fjt.isDone()));
	    		  
		List<String> finalResult = fjt.join();
		//System.out.println("finalResult: "+finalResult);
	}
}
