import java.util.Scanner;
//��������(��������)
//���� ���� �˰����� �����Ѵ�.
//�ڹ̸�
//4.7



class Student {
	
	private String name;//�̸�
	private int id;//�й�
	private double score;//����
	
	
	public int getId() {//id�� �����ϴ� �޼ҵ�
		return id;
	}
	public String getName() {//name�� �����ϴ� �޼ҵ�
		return name;
	}
	public Double getScore() {//score�� �����ϴ� �޼ҵ�
		return score;
	}
	public void SetId(int Id) {//id�� �����ϴ� �޼ҵ�
		this.id=Id;
	}
	public void SetName(String Name) {//name�� �����ϴ� �޼ҵ�
		this.name=Name;
	}
	public void SetScore(double Score) {//score�� �����ϴ� �޼ҵ�
		this.score= Score;
	}}



//public void selectionsort(int a[]) {








public class hw3_3{



	private static Scanner scanner;
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("hw3_3 : �ڹ̸�");
		 

		 Scanner sc=new Scanner(System.in);
		 
		 scanner = new Scanner(System.in);
		 System.out.print("�л��� �Է�: ");
		 int n=sc.nextInt();//1
		 
		 
		 
		 Student[] std=new Student[n];
		 System.out.println(n+"���� �л� ������ �Է��ϼ���:");
		   for(int i=0; i<n; i++ ) {
			   std[i]=new Student();
			   std[i].SetName(sc.next());
	            std[i].SetId(sc.nextInt());
	            std[i].SetScore(sc.nextDouble());
			//	std[i]=new Student(name,id, score);//�迭 ���� ���� ����.
				
				
				
				
		   }
		   
				
//	int Sud[]=new int[n];
				

	//			int i=0, j=0, tem=0;
//		   int indexMin=0;
		   Student temp = new Student();
				for(int i=0; i<n-1; i++) {
					for(int j=0; j<n-1-i; j++) {
						if(std[j].getScore()<std[j+1].getScore()){
			//				indexMin=j;
							
							temp=std[j];
							std[j]=std[j+1];
							std[j+1]=temp;
							
							
						}
					}
							
							
					
							
						}
				System.out.println("���� �������� ���� ���= ");
				for(int a=0; a<n; a++) {
					System.out.println(std[a].getName()+" "+std[a].getId()+" "+std[a].getScore());
				}
				sc.close();
				}}