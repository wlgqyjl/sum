package sum;

public class sum implements Runnable {
private static Thread [] task=new Thread[4];
private int threadID;
public sum(int ID){
	threadID=ID;
}
int sum;
public static int a=1,b=25;
	public void run() {
		// TODO Auto-generated method stub
		try{
			sum=0;
			for(int i=a;i<=b;i++){
				
				sum=sum+i;
				
			}
			
			Thread.sleep(2000);
			}catch(InterruptedException ie){ie.printStackTrace();}
	
	System.out.println(a+"~"+b+"µÄºÍÎª"+sum);
	a=b+1;
	b=b+25;
	}
	public static void main(String [] args){
		try{
			for(int i=0;i<task.length;i++){
				task[i]=new Thread(new sum(i));
				task[i].start();
				task[i].join();
			}
		}catch(InterruptedException e){System.out.println(e);}
	}
	
}
