import java.util.Scanner;

public class TestYura323 extends AbstractTest{
	
	private int n;
	private Scanner sc;
	
	public TestYura323() {
		super("323(3)");
		sc = new Scanner(System.in);
	}

	@Override
	public void execute() {
		System.out.println("���� ���������� ������ ����� n. �������� �� " + 
	" ��������� ����� ����� n � ������ ����� � ���.");
		
		System.out.println("������ ���������� ����� n: ");
		n = sc.nextInt();
		
		for (int i = 2; i < n; i++) {
			if(gcd(n, i) == 1)
				System.out.print(i + ", ");
		}
		
	}
	
	private int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
	
}
