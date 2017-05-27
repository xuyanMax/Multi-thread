package suspend_resume_test;

public class MyThread extends Thread{
	
	private long i = 0;
	public long getI(){
		return i;
	}
	public void setI(long x){
		this.i= x;
	}
	@Override
	public void run(){
		
			while(true)
				i++;
	}

}
