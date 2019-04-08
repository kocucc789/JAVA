
public class twoarrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Array=new int[4][4];
		
		int x=0;
		int y=0;
		int result=0;
		
		while(result<10) {
			x=(int)(Math.random()*4);
			y=(int)(Math.random()*4);
			if(Array[y][x]==0) {
				Array[y][x]=(int)(Math.random()*10+1);
				result++;
			}
			
		}
		
		for(int i=0; i<Array.length; i++){
			for(int j=0; j<Array[i].length; j++){
				System.out.print(Array[i][j]+" ");
			}
			System.out.println();
		}

	}

}
