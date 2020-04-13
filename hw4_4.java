import java.util.Scanner;
//hw4_4
//�ڹ̸�
//4.10
//���� ��ü �迭

interface Shape{
	/*public abstract*/ double getArea();
}//������ ������ �����ϴ� �߻� �޼ҵ�

class Circle implements Shape{//��ü Ŭ����...
	public double getArea() {
		return 3.14*radius*radius;
	}
	private double radius;//������
//	public Circle(double radius) {
//		this.radius=radius;
//	}
	public Circle(double r) {//��ü �����ϸ鼭 ���� ����(�ʱ�ȭ). //����=�Ű�����: double r
		this.radius = r;  //�������ںκ��� ��ü �Ӽ��� �̸��� ������ ��� this
	}
	public double getRadius() {//radius�� �����ϴ� �޼ҵ�
		return radius;
	}
	public void SetRadius(double Radius) {//radius�� �����ϴ� �޼ҵ�
		this.radius=Radius;
	}
	@Override
	public String toString() {
		return "�� ������= "+radius+" ����= "+3.14*radius*radius;
	}
}



class Triangle implements Shape{
	public double getArea() {
		return (line*high)/2;
	}
	private double line;//�غ�
//	public Triangle(double line) {
//		this.line=line;
//	}
	private double high;//����
//	public Triangle(double high) {
//		this.high=high;
//	}
	public Triangle(double l, double h) {
		this.line = l;
		this.high= h;
	}
	public double getLine() {//�غ��� �����ϴ� �޼ҵ�
		return line;
	}
	public void SetLine(double Line) {//�غ��� �����ϴ� �޼ҵ�
		this.line=Line;
	}
	public double getHigh() {//���̸� �����ϴ� �޼ҵ�
		return high;
	}
	public void SetHigh(double High) {//���̸� �����ϴ� �޼ҵ�
		this.high=High;
	}
	@Override
	public String toString() {
		return "�ﰢ�� �غ�= "+line+" ����= "+high+" ����= "+(line*high)/2;
	}
}







public class hw4_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hw4_4 : �ڹ̸�");
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("�� ���� �Է�: ");
		int num1=sc.nextInt();
		System.out.print("�ﰢ�� ���� �Է�: ");
		int num2=sc.nextInt();
		
		
		int total=num1+num2;
//		Circle[] f=new Circle[total];
		Shape[] figureArray=new Shape[total]; //������ü�迭
		
		
		System.out.println(num1+"���� �� ����(������)�� �Է��ϼ���: ");
		for(int i=0; i<num1; i++ ) {
			
			double radius=sc.nextDouble();
			figureArray[i]=new Circle(radius); //radius�� figureArray[]�� �ʱ�ȭ���״�.
//			   this.Radius=0;
//			   a[i].Radius(sc.nextDouble());
			   
		}
		
		System.out.println(num2+"���� �ﰢ�� ����(�غ��� ����)�� �Է��ϼ���: ");
		for(int j=num1; j<total; j++ ) {
			
			double line=sc.nextDouble();
			double high=sc.nextDouble();
			figureArray[j]=new Triangle(line,high);
			
//			   a[j]=new Triangle();
//			   a[j].SetLine(sc.nextDouble());
//			   a[j].SetHigh(sc.nextDouble());
		}
		
		//����: �ι�°�迭(����), ��������ºκ�

		System.out.println(total+"���� ���� ������ ����= ");
		for(int k=0; k<total; k++) {
			System.out.println(figureArray[k].toString());
		}
		sc.close();
	}
}