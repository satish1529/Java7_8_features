package com.mportal.test.TransferQueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Light implements Delayed {

	int data ;
	
	long delay;
	
	Light(int s,int delay)
	{
		this.data = s;
		this.delay = delay+System.currentTimeMillis();
	}
	
	@Override
	public int compareTo(Delayed o) {
	
		System.out.println("in compareto");
		 if(this.data > ((Light)o).data)
		 {
			 return 1;
		 }
		 else if(this.data < ((Light)o).data)
		 {
			 return -1;
		 }
		 return 0;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		//System.out.println("in getDelay");
		long delay = this.delay - System.currentTimeMillis();
		return delay;
	}

	public String toString()
	{
		return ""+this.data;
	}
	
	 @Override
	  public int hashCode() {
	         final int prime = 31;
	         int result = 1;
	         result = prime * result + this.data;
	         return result;
	 	     }
	 
	  
	 
	     @Override
	 
	     public boolean equals( Object obj ) {
	    	 
	    	 if( this == obj ) {
	    		 return true;
	    	      }
	    	 if( obj == null ) {
	    	      return false;
	    	    }
	    	 if(this.data==((Light)obj).data)
	    		 return true;
	    	 return false;
	     }
}