package p348;
import java.util.Calendar;

class PrimeTime implements Runnable {
	int n;
	
	public PrimeTime(int n) {       // Ƚ���� ���ڷ� �޴� ������
		this.n = n;
	}
	public PrimeTime(int n,String s) {  // Thread ������
		this.n = n;
		Thread.currentThread().setName(s); // �̸��ް�
	}	
	public void run() {  
		Calendar now = Calendar.getInstance();  // ��¥�ް�
		for(int i=0;i<n;i++) {
			System.out.println("����: "+Thread.currentThread().getPriority() +" "+now.getTime()+" "+Thread.currentThread().getName());
		}
	}
}

public class ans7 {
	public static void main(String[] args) {
		PrimeTime p1 = new PrimeTime(3);  // Ƚ��3��
		Thread th1 = new Thread(p1, "�ȳ��ϼ���!"); // �̸��� �ȳ��ϼ���!
		th1.setPriority(Thread.MAX_PRIORITY-1);  
		th1.start();
		
		PrimeTime p2 = new PrimeTime(6);  // Ƚ�� 6��
		Thread th2 = new Thread(p2, "�ݰ����ϴ�!"); // �̸��� �ݰ����ϴ�!
		th2.setPriority(Thread.NORM_PRIORITY-1); 
		th2.start();
	}
}
