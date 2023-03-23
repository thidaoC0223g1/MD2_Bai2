import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
int num =-1;
Scanner input = new Scanner(System.in);
     while(num!=0){
         System.out.println("Menu");
         System.out.println("1: in ra hinh chu nhat");
         System.out.println("2: in ra hinh vuong ");
         System.out.println("3: in ra hinh tam giac");
         System.out.println("nhap vao lua chon ");
          num =input.nextInt();
          switch(num){
              case 1:
                  System.out.println("* * * * * * * *");
                  System.out.println("* * * * * * * *");
                  System.out.println("* * * * * * * *");
                  System.out.println("* * * * * * * *");
                  break;
              case 2:
                  System.out.println("* * * * * * * *");
                  System.out.println("* * * * * * * *");
                  System.out.println("* * * * * * * *");
                  System.out.println("* * * * * * * *");
                  System.out.println("* * * * * * * *");
                  System.out.println("* * * * * * * *");
                  break;
              case 3:
                  System.out.println("* * * * * * ");
                  System.out.println("* * * * *  ");
                  System.out.println("* * * *  ");
                  System.out.println("* * *  ");
                  System.out.println("* *  ");
                  System.out.println("* ");
                  break;
              default:
                  System.out.println("khong co gi de hien thi");
          }
     }
    }
}