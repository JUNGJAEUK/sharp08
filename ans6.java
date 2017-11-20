package p348;

class PrimeNumber03 implements Runnable {
	int n;
	public PrimeNumber03(int n) {  // �ִ���� ���ڷι޴� ������
		this.n = n;
	}
	public PrimeNumber03(int n,String name) {  // Thread������-�̸�����
		this.n = n;
		Thread.currentThread().setName(name);
	}	
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+":"); // �̸��������

		int a[] = new int[n];
		int cnt=1;  // cnt�� a�� ����ִ� ���� ������.
		boolean P;  // �Ҽ������ƴ��� �Ǻ�
		a[0] = 2;
		for(int i=2; i<=n; i++) {
			P = true;
			for(int j=0;j<cnt;j++) {
				if(i%a[j]==0) {
					P = false;  // �Ҽ����ƴϸ� P=false
				}
			}
			if(P == true) {  
				a[cnt]=i;
				cnt++;
			}
		}
		for(int value : a) {
			if(value != 0)
				System.out.print(value+" ");
		}
	}
}

public class ans6 {
	public static void main(String[] args) {
		new Thread(new PrimeNumber03(25), "�Ҽ� ����� ������").start();
	}
}
