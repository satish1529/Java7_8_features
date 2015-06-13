package com.satish.test.TransferQueue;

import java.util.concurrent.Callable;

public class TransferBlockingQueuePutThread implements Runnable {

	java.util.concurrent.TransferQueue<Light> bq = null;
	
	TransferBlockingQueuePutThread(java.util.concurrent.TransferQueue<Light> bq)
	{
		this.bq = bq;
	}
	
	@Override
	public void run()  {
	
		 try {
			 System.out.println("putting to queue");
			Light l = new Light(10,1);
			bq.put(l);
			System.out.println("put");
			
			l = new Light(20,2);
			bq.put(l);
			System.out.println("put");
			
			l = new Light(3,3);
			bq.transfer(l);
			System.out.println("put");
			System.out.println(bq);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
