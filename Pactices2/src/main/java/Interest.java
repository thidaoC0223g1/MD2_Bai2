import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("nhap vao so tien gui");
        double tiengui= input.nextDouble();
        System.out.println("nhap vao lai suat");
        double laisuat= input.nextDouble();
        System.out.println("nhap vao so thang gui");
        double thang= input.nextDouble();

        double tienlai= tiengui*(laisuat/12)*thang;

        System.out.println("so tien lai phai tra = "+ tienlai);

    }
}
