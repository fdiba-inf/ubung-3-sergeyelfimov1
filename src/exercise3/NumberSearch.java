package exercise3;

import java.util.Scanner;

public class NumberSearch {
<<<<<<< HEAD

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count =0;
        for(int i=100;i<=1000;i++){
            
          if(i%5==0 && i%6==0 ){
            count++;
            if(count !=10){
              System.out.print(i +" ");
            }
            else{
              System.out.println(i);
              count =0;
            }
          }  
          
        }
    }

}
=======
  public static void main(String[] args)  {
    Scanner input = new Scanner(System.in);
    int count = 0;
    for (int number = 100; int number <=1000; number++) {
      if (number % 30 == 0) {
        count++;
      }
    }


  }
}
>>>>>>> origin/master
