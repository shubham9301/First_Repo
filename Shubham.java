import java.util.Scanner;
class Shubham
{
    public static void PrimeNum(int num)
    {
        int count = 0;
        for(int i=2; i<=num/2; i++)
        {
            if(num % i ==0)
            {
                count += 1;
            }
        }
        if (count == 0)
            System.out.println(num+" is a Prime number ");
        else
            System.out.println(num+" is not a Prime number ");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        PrimeNum(num);
    }
}