import java.util.Scanner;
//학생배열
//박미리
//4.3~
//학생정보를 비교한다.(get&set,평균,최대값)
class Student {
	
	private String name;//이름
	private int id;//학번
	private double score;//점수
	
	public Student(String n,int i , double sc) {
		this.name=n;
		this.id=i;
		this.score=sc;
	}
	
	public int getId() {//id를 리턴하는 메소드
		return id;
	}
	public String getName() {//name를 리턴하는 메소드
		return name;
	}
	public Double getScore() {//score를 리턴하는 메소드
		return score;
	}
	public int SetId() {//id를 리턴하는 메소드
		return id;
	}
	public String SetName() {//name를 리턴하는 메소드
		return name;
	}
	public Double SetScore() {//score를 리턴하는 메소드
		return score;
	}


	
	
 }




public class StudentTest {

private static Scanner scanner;

//	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("hw3_1 : 박미리");
		 

			 
		 
	scanner = new Scanner(System.in);
		 System.out.print("학생수 입력: ");
		 int n=scanner.nextInt();//학생수
		 double sum=0;//모든 학생들의 점수의 합
		 int id1=0; //최고점자의 배열 index저장
		 double highScore=0;//최고점 저장
		 
		 Student[] std=new Student[n];
		 System.out.println(n+"명의 학생 정보를 입력하세요:");
		   for(int i=0; i<n; i++ ) {
			   String name=scanner.next();
				int id=scanner.nextInt();
				double score=scanner.nextDouble();
				std[i]=new Student(name,id, score); //배열 원소 순서 맞춤.
				sum+=score;
		   }
		   System.out.println("성적 평균= "+sum/n);//average 대입.
		   
		   
		   for(int i=0; i<n; i++) {//최고점자 구하기
			   double sc=std[i].getScore();
			   if(sc>highScore) {
				   highScore=sc;
				   id1=i;
			   }
		   }
		   System.out.println("수석 학생 성명="+std[id1].getName());
		   
		   
		 
		   }}