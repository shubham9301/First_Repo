import java.util.Scanner;
class Overriding
{
    int a;
    int b;
    int m1,m2;

    void getData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter the first number : "); 
        a = sc.nextInt();
        System.out.print("\nEnter the second number : ");
        b = sc.nextInt();
        m1 = a;
        m2 = b;
    }
    int display()
    {
        System.out.println("\n\ndisplay method called !!!\n\n");

        int c = a+b;
        int mult = m1*m2;

        System.out.println ("sum of a("+a+")  and  b("+b+") is : "+c);
        System.out.println ("Product of m1("+m1+")  and  m2("+m2+") is : "+mult);
        return 0;
    }

    public static void main(String[] args)
    {
        Overriding o1 = new Overriding();
        o1.getData();
        o1.display();
    }
}