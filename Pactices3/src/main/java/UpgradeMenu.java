import java.util.Scanner;

public class UpgradeMenu {
    public static void main(String[] args) {
        int num = -1;
        Scanner input = new Scanner(System.in);
        while(num!=0){
            System.out.println("Menu");
            System.out.println("1: rectangle");
            System.out.println("2: triangle bottom left");
            System.out.println("3: triangle top left");
            System.out.println("4: triangle isosceles ");
            System.out.println("nhap vao lua chon");
            num=input.nextInt();
            switch (num){
                case 1: for( int i=1; i<=5;i++){
                    for( int j=1;j<8;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
                case 2 : for(int i=1;i<=5;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }break;
                case 3: for( int i=5;i>=1;i-- ){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
                default:
                    System.out.println("khong co gi de hien thi");

            }
        }
    }
}
