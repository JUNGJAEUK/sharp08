package p347;
import java.util.Scanner;
public class ans1 {

	public static void main(String[] args) {
		int x = 0, y = 0, z = 0;
		try {                     // �̰� �Ϸ�����.
			Scanner input = new Scanner(System.in);
			x = input.nextInt();
			y = input.nextInt();
		} catch (Exception e) {    // ���ܹ߻��� ��� (���ڰ��ƴ϶�ų�)
			System.out.println("���ܹ߻�: " + e);
		} finally {                // ������ �����
			System.out.println("");
			z = x * y;
			System.out.printf("%d * %d = %d %n", x,y,z);
		}	
	}
}
