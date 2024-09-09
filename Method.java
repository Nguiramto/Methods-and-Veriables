import java.util.Scanner;
public class Method {
    public static int calfm() {
        Scanner iuea = new Scanner(System.in);

        int test1,test2,exam;

        System.out.println("Please enter test1");
        test1=iuea.nextInt();

        System.out.println("Please enter test2");
        test2=iuea.nextInt();

        System.out.println("Please enter exam-mark");
        exam=iuea.nextInt();

        int cw,fm;
        cw=(test1+test2)/2;
        fm=cw+exam;
        return fm;

    }

public static void main(String[]Args) {

    int h=calfm();
    System.out.println("The answer is" + h);
}
}
