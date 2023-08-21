import java.util.Scanner;
public class Main{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the value of n:");
        int seatnumber=sc.nextInt();
        int compartment=0;
        int totalseats= 72;
        if (seatnumber<1 || seatnumber>72)
        {
            System.out.println("you have selected the wrong output:");
        }
        else {
            compartment=(seatnumber/8);
            if (seatnumber%8!=0) compartment++;
            {
                System.out.println("compartment"+compartment);
                if (seatnumber>8)
                {
                    seatnumber=seatnumber-((compartment-1))*8;
                }
            switch (seatnumber)
            {
                case 1:
                {
                    System.out.println("your seat is :lower");
                    break;
                }
                case 2:
                {
                    System.out.println("your seat is :middle");
                    break;
                }
                case 3:
                {
                    System.out.println("your seat is :upper");
                    break;
                }
                case 4:
                {
                    System.out.println("your seat is :lower");
                    break;
                }
                case 5:
                {
                    System.out.println("your seat is :middle");
                    break;
                }
                case 6:
                {
                    System.out.println("your seat is :upper");
                    break;
                }case 7:
            {
                System.out.println("your seat is :side lower");
                break;
            }case 8:
            {
                System.out.println("your seat is :side upper");
                break;
            }


            }

            }
        }


    }
}