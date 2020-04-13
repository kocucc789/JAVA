import java.util.Scanner;
//hw4_4
//박미리
//4.10
//도형 객체 배열

interface Shape{
	/*public abstract*/ double getArea();
}//도형의 면적을 리턴하는 추상 메소드

class Circle implements Shape{//객체 클래스...
	public double getArea() {
		return 3.14*radius*radius;
	}
	private double radius;//반지름
//	public Circle(double radius) {
//		this.radius=radius;
//	}
	public Circle(double r) {//객체 선언하면서 값을 낸다(초기화). //인자=매개변수: double r
		this.radius = r;  //전달인자부분이 객체 속성과 이름이 동일할 경우 this
	}
	public double getRadius() {//radius를 리턴하는 메소드
		return radius;
	}
	public void SetRadius(double Radius) {//radius를 리턴하는 메소드
		this.radius=Radius;
	}
	@Override
	public String toString() {
		return "원 반지름= "+radius+" 면적= "+3.14*radius*radius;
	}
}



class Triangle implements Shape{
	public double getArea() {
		return (line*high)/2;
	}
	private double line;//밑변
//	public Triangle(double line) {
//		this.line=line;
//	}
	private double high;//높이
//	public Triangle(double high) {
//		this.high=high;
//	}
	public Triangle(double l, double h) {
		this.line = l;
		this.high= h;
	}
	public double getLine() {//밑변을 리턴하는 메소드
		return line;
	}
	public void SetLine(double Line) {//밑변을 리턴하는 메소드
		this.line=Line;
	}
	public double getHigh() {//높이를 리턴하는 메소드
		return high;
	}
	public void SetHigh(double High) {//높이를 리턴하는 메소드
		this.high=High;
	}
	@Override
	public String toString() {
		return "삼각형 밑변= "+line+" 높이= "+high+" 면적= "+(line*high)/2;
	}
}







public class hw4_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hw4_4 : 박미리");
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("원 갯수 입력: ");
		int num1=sc.nextInt();
		System.out.print("삼각형 갯수 입력: ");
		int num2=sc.nextInt();
		
		
		int total=num1+num2;
//		Circle[] f=new Circle[total];
		Shape[] figureArray=new Shape[total]; //도형객체배열
		
		
		System.out.println(num1+"개의 원 정보(반지름)를 입력하세요: ");
		for(int i=0; i<num1; i++ ) {
			
			double radius=sc.nextDouble();
			figureArray[i]=new Circle(radius); //radius를 figureArray[]에 초기화시켰다.
//			   this.Radius=0;
//			   a[i].Radius(sc.nextDouble());
			   
		}
		
		System.out.println(num2+"개의 삼각형 정보(밑변과 높이)를 입력하세요: ");
		for(int j=num1; j<total; j++ ) {
			
			double line=sc.nextDouble();
			double high=sc.nextDouble();
			figureArray[j]=new Triangle(line,high);
			
//			   a[j]=new Triangle();
//			   a[j].SetLine(sc.nextDouble());
//			   a[j].SetHigh(sc.nextDouble());
		}
		
		//문제: 두번째배열(갯수), 마지막출력부분

		System.out.println(total+"개의 도형 정보와 면적= ");
		for(int k=0; k<total; k++) {
			System.out.println(figureArray[k].toString());
		}
		sc.close();
	}
}