import java.util.Scanner;

public class Set {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      System.out.println("hw0_2 : 박미리");
      System.out.println("양의 정수 집합을 비교하는 프로그램입니다.");

      int intArray[] = new int[100]; //배열크기 지정.
      int intArray2[] = new int[100];
      int size1 = 0; //입력받는 배열을 저장해 둘 크기.
      int size2 = 0;
      boolean result = true; 
      Scanner scanner = new Scanner(System.in);

      System.out.print("첫번째 집합을 입력하세요. 집합 입력을 마치려면 양이 아닌 정수를 입력하세요: ");
      for (int i = 0; i < intArray.length; i++) {
         intArray[i] = scanner.nextInt();
         if (intArray[i] < 0) {
            break;
         }
         size1++;
      }

      System.out.print("두번째 집합을 입력하세요. 집합 입력을 마치려면 양이 아닌 정수를 입력하세요: ");
      for (int i = 0; i < intArray2.length; i++) {
         intArray2[i] = scanner.nextInt();
         if (intArray2[i] < 0) {
            break;
         }
         size2++;
      }
      
      if(size1==size2) {
         for(int i =0;i<size1;i++) {
            for (int j=0;j<size2;j++) {
               if(intArray[i]==intArray2[j]){
                  result=true;
                  break;
               }
               result=false;
            }   
         }
      }else
         result=false;      

      if (result) {                //boolean으로 받은걸 문자열로 나오게 한다.
         System.out.print("두 집합은 같습니다.");
      } else {
         System.out.print("두 집합은 서로다릅니다.");
      }

      scanner.close();

   }
}