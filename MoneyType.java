import java.util.Scanner;

public class MoneyType {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] won = new int[9];
		int[] unit= {50000,10000,1000,500,100,50,10,1};
		System.out.print("�ݾ��� �Է��Ͽ���>>");
		int money = scanner.nextInt();
		

		for(int i=0; i<9; i++)
		{
			won[i] = money/unit[i];
			money= money%unit[i];
			
			if(money==0) {
				System.out.println(unit[i]+"�� ¥�� : "+won[i]+"��");
				break;
			} else if (won[i] !=0) {
				System.out.println(unit[i]+"�� ¥�� : "+won[i]+"��");
			}
				
			}
		scanner.close();
		}
			
	}

