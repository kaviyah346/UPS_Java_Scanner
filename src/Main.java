import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=s.nextLine();
        System.out.println("Name:"+name);

        System.out.println("Enter height and width to calculate area:");
        int h=s.nextInt();
        int w=s.nextInt();
        int area=h*w;
        System.out.println("The calculated area is "+area);

        System.out.println("Enter temperature in celsius:");
        int c=s.nextInt();
        int f=(9/5)*c+32;
        System.out.println("The corresponding temperature in fahrenheit is "+f);

        System.out.println("Enter the values of a and b :");
        int a=s.nextInt();
        int b=s.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping the value of a is "+a+"and b is "+b);

    }
}