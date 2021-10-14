package comp.comp152;

import java.util.ArrayList;
import java.util.Random;

public class Main{

    public static void main(String[] args){
        var allEmployees = new ArrayList<Employee>();
        Employee newEmployee = new CommissionEmployee();
        allEmployees.add(newEmployee);
        newEmployee = new SalariedEmployee(55000);
        allEmployees.add(newEmployee);
        WeekDay deliveryDay = WeekDay.Friday;
        var Picker = new Random();
        var Choice = Picker.nextInt(WeekDay.values().length);
        deliveryDay = WeekDay.values()[Choice];
        System.out.println("Your delivery will happen on " + deliveryDay.toString());
    }
}
