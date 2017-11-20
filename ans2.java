package p347;

class InvalidWithdraw extends Exception {  // InvalidWithdraw ���� ����.
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}

class BankAccount {
	public int minMoney;         // �����ܱ�
	public int money;            
	public int myMoney = 0;
	
	public BankAccount(int minMoney) {  // �����ܱ� ���� ������
		this.minMoney = minMoney;
	}
	public int deposit(int money) {    // �Ա� �޼ҵ�
		myMoney += money;
		System.out.println("�Ա� �ݾ� :"+money+" >> �ܰ�: "+ myMoney);
		return myMoney;
	}
	public int withdraw(int money) throws InvalidWithdraw{	//��ݸ޼ҵ�.
		myMoney -= money;
		if(money < 0) {     // �����û�ݾ��� �����ϰ�� ���� �߻�.
			throw new InvalidWithdraw("�����û�ݾ��� �������Դϴ�.");	
		}
		else if(myMoney < minMoney) {   // �����ܱ� ���Ϸ� �����û�� �����߻�.
			throw new InvalidWithdraw("������ �����ܱ� ���Ϸ� �����û�ϼ̽��ϴ�.");	
		}
		else {
			System.out.println("������ �����ܱ� : "+minMoney+"\n��ݾ� : "+ money+ "\n�ܰ� : "+ myMoney);
		}
		return myMoney;
	}
}

public class ans2 {
	public static void main(String[] args) throws InvalidWithdraw {
		BankAccount ba = new BankAccount(-100000);
		ba.withdraw(50000);
	}
}
