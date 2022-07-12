package day11;

public class TajHotel implements  Hotel{
    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }

    @Override
    public void chickenBiryani() {
        System.out.println("taj chicken biryani");
    }

    @Override
    public void masalaDosa() {
        System.out.println("taj masala dosa");
    }
}
