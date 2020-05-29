import java.util.Random;
import java.util.RandomAccess;

class Main {
  public static void main(String[] args) {
    System.out.print("1 \n");
   int[][] mas = new int [10][10];
    Random rand = new Random();
    for (int i = 0; i < mas.length; i++)
    for (int j = 0; j< mas[i].length; j++)
    mas[i][j] = rand.nextInt(100);
    
    for (int i = 0; i < mas.length; i++, System.out.println())
  {
      for (int j = 0; j < mas.length; j++){
        System.out.print(" "+ mas[i][j] + " ");
      }
   } 
System.out.print(" 2\n");

    for (int g=0; g<10; g++)
    {
       for (int i=0;i < mas.length;i++)
       {
         for (int j=0;j < mas[i].length-1;j++)
        {
          int p=0;
          if (mas[j][i]>mas[j+1][i])
         {
            p=mas[j][i];
            mas[j][i]=mas[j+1][i];
            mas[j+1][i]=p;
         }
        }
       }
      }
       for (int i=0;i < mas.length;i++,System.out.println())
     {
       for (int j=0;j < mas[i].length;j++)
     {
       System.out.print(mas[i][j]+"\t");
     }

    }

  }
  
}