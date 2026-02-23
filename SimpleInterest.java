import java.util.Scanner;
class SimpleInterest
{
    double principal;
    int rate,time;

    SimpleInterest()
    {
        double principal = 0.00;
        int rate = 0;
        int time = 0;
    }

    SimpleInterest(double cp, int cr, int ct)
    {
        principal = cp;
        rate = cr;
        time = ct;
    }

    void getData()
    {
        System.out.println("Principal = "+principal+"   Rate = "+rate+"    Time = "+time);
    }

    void simpleInterest ()
    {
        double si = ( principal * rate * time ) / 100 ;

        System.out.println("\n\nSimple interest on rs-"+principal+" at "+rate+"% rate in "+time+" years is = "+si+"\n\n");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter the amount for Principal : ");
        double p = sc.nextInt();

        System.out.print("Enter the rate (Annualy) in percentage : ");
        int r = sc.nextInt();

        System.out.print("Enter the Time Period (in years) : ");
        int t = sc.nextInt();

        SimpleInterest s1 = new SimpleInterest(p, r, t);
        
        s1.getData();
        s1.simpleInterest();

        
    }
}