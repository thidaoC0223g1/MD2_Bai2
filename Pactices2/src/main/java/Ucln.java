import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so thu nhat");
        double a = input.nextDouble();
        System.out.println("nhap vao so thu 2");
        double b= input.nextDouble();
        a= Math.abs(a);
        b= Math.abs(b);
        if(a==0||b==0)
            System.out.println("khong co UCLN");
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("Uoc chung lon nhat la "+ a);
    }

    }

