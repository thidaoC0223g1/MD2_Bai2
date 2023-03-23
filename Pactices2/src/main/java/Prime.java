import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("nhap vao so muon kiem tra n = ");
        int n= input.nextInt();
       if (n<2){
           System.out.println(n + " khong phai la so nguyen to");
       }else{
           boolean check = true;
           for(int i=2;i*i<=n;i++){
               if(n%i==0){
                   check = false;
                   break;
               }
           }if(check)
               System.out.println(n+" la so nguyen to");
           else System.out.println(n+" khong phai so nguyen to");
       }

    }
}
