package comp.comp152;

import java.util.Random;

public class Main{

    public static void main(String[] args){
    WeekDay deliveryDay = WeekDay.Friday;
    var Picker = new Random();
    var Choice = Picker.nextInt(WeekDay.values().length);
    deliveryDay = WeekDay.values()[Choice];
    System.out.println("Your delivery will happen on " + deliveryDay.toString());
    }
}
