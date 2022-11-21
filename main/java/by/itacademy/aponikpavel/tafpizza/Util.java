package by.itacademy.aponikpavel.tafpizza;

public class Util {
    public static void waiter() {

        try {
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
