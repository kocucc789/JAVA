import java.util.Scanner;

public class Set {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      System.out.println("hw0_2 : �ڹ̸�");
      System.out.println("���� ���� ������ ���ϴ� ���α׷��Դϴ�.");

      int intArray[] = new int[100]; //�迭ũ�� ����.
      int intArray2[] = new int[100];
      int size1 = 0; //�Է¹޴� �迭�� ������ �� ũ��.
      int size2 = 0;
      boolean result = true; 
      Scanner scanner = new Scanner(System.in);

      System.out.print("ù��° ������ �Է��ϼ���. ���� �Է��� ��ġ���� ���� �ƴ� ������ �Է��ϼ���: ");
      for (int i = 0; i < intArray.length; i++) {
         intArray[i] = scanner.nextInt();
         if (intArray[i] < 0) {
            break;
         }
         size1++;
      }

      System.out.print("�ι�° ������ �Է��ϼ���. ���� �Է��� ��ġ���� ���� �ƴ� ������ �Է��ϼ���: ");
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

      if (result) {                //boolean���� ������ ���ڿ��� ������ �Ѵ�.
         System.out.print("�� ������ �����ϴ�.");
      } else {
         System.out.print("�� ������ ���δٸ��ϴ�.");
      }

      scanner.close();

   }
}