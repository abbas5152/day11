package day11;

public interface Y {
    void absY();
    default void defY(){
        System.out.println("Y of default");
    }
    public  static void staY(){
        System.out.println("Y of static");
    }
}
