import java.util.Scanner;
//�л��迭
//�ڹ̸�
//4.3~
//�л������� ���Ѵ�.(get&set,���,�ִ밪)
class Student {
	
	private String name;//�̸�
	private int id;//�й�
	private double score;//����
	
	public Student(String n,int i , double sc) {
		this.name=n;
		this.id=i;
		this.score=sc;
	}
	
	public int getId() {//id�� �����ϴ� �޼ҵ�
		return id;
	}
	public String getName() {//name�� �����ϴ� �޼ҵ�
		return name;
	}
	public Double getScore() {//score�� �����ϴ� �޼ҵ�
		return score;
	}
	public int SetId() {//id�� �����ϴ� �޼ҵ�
		return id;
	}
	public String SetName() {//name�� �����ϴ� �޼ҵ�
		return name;
	}
	public Double SetScore() {//score�� �����ϴ� �޼ҵ�
		return score;
	}


	
	
 }




public class StudentTest {

private static Scanner scanner;

//	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("hw3_1 : �ڹ̸�");
		 

			 
		 
	scanner = new Scanner(System.in);
		 System.out.print("�л��� �Է�: ");
		 int n=scanner.nextInt();//�л���
		 double sum=0;//��� �л����� ������ ��
		 int id1=0; //�ְ������� �迭 index����
		 double highScore=0;//�ְ��� ����
		 
		 Student[] std=new Student[n];
		 System.out.println(n+"���� �л� ������ �Է��ϼ���:");
		   for(int i=0; i<n; i++ ) {
			   String name=scanner.next();
				int id=scanner.nextInt();
				double score=scanner.nextDouble();
				std[i]=new Student(name,id, score); //�迭 ���� ���� ����.
				sum+=score;
		   }
		   System.out.println("���� ���= "+sum/n);//average ����.
		   
		   
		   for(int i=0; i<n; i++) {//�ְ����� ���ϱ�
			   double sc=std[i].getScore();
			   if(sc>highScore) {
				   highScore=sc;
				   id1=i;
			   }
		   }
		   System.out.println("���� �л� ����="+std[id1].getName());
		   
		   
		 
		   }}