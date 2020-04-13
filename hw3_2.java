import java.util.Scanner;
//선택정렬(오름차순)
//선택 정렬 알고리즘을 이해한다.
//박미리
//4.7



class Student {
	
	private String name;//이름
	private int id;//학번
	private double score;//점수
	
	
	public int getId() {//id를 리턴하는 메소드
		return id;
	}
	public String getName() {//name를 리턴하는 메소드
		return name;
	}
	public Double getScore() {//score를 리턴하는 메소드
		return score;
	}
	public void SetId(int Id) {//id를 리턴하는 메소드
		this.id=Id;
	}
	public void SetName(String Name) {//name를 리턴하는 메소드
		this.name=Name;
	}
	public void SetScore(double Score) {//score를 리턴하는 메소드
		this.score= Score;
	}}





public class hw3_2{



	private static Scanner scanner;
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("hw3_2 : 박미리");
		 

		 Scanner sc = new Scanner(System.in);
		 
//		 scanner = new Scanner(System.in);
		 System.out.print("학생수 입력: ");
		 int n=sc.nextInt();//1
		 
		 
		 
		 Student[] std=new Student[n];//학생배열생성
		 System.out.println(n+"명의 학생 정보를 입력하세요:");
		   for(int i=0; i<n; i++ ) {
			   std[i]=new Student();
			   std[i].SetName(sc.next());
	            std[i].SetId(sc.nextInt());
	            std[i].SetScore(sc.nextDouble());
			
				
				
				
				
		   }

	//			int i=0, j=0, tem=0;
		   int indexMin=0;
		   Student temp = new Student();
				for(int i=0; i<n-1; i++) {
					for(int j=i+1; j<n;j++) {
						if(std[j].getName().compareTo(std[indexMin].getName())<=0){
							indexMin=j;
							
						}
					}
							
							temp=std[indexMin];//값을 안전하게 다른 데로 옮겨놓고
							std[indexMin]=std[i];//바꿉니다
							std[i]=temp;//옮긴 값을 가져옵니다
					
							
						}
				System.out.println("성명 오름차순 정렬 결과= ");
				for(int a=0; a<n; a++) {
					System.out.println(std[a].getName()+" "+std[a].getId()+" "+std[a].getScore());
				}
				sc.close();
				}}