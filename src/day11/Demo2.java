package day11;

import java.util.Scanner;

public class Demo2 {
    public Hotel provideFood(int amount){
        if(amount>1000){
            Hotel h1=new TajHotel();
            return h1;
        }
        else if(amount>200 && amount<1000){
            Hotel h1=new RoadSideHotel();
            return h1;
        }
        else{
            Hotel h1=null;
            return h1;
        }
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the bill amount");
        int n=s1.nextInt();
        Demo2 d1=new Demo2();
        if(d1.provideFood(n) instanceof TajHotel){
            Hotel h1=new TajHotel();
            h1.chickenBiryani();
            h1.masalaDosa();
            TajHotel d = (TajHotel) h1;
            d.welcomeDrink();


        } else if (d1.provideFood(n) instanceof RoadSideHotel) {
            Hotel h1=new RoadSideHotel();
            h1.masalaDosa();
            h1.chickenBiryani();
            RoadSideHotel d=(RoadSideHotel) h1;


        }
        else{
            System.out.println("Enter valid amount");
        }
    }
}
