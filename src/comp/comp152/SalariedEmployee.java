package comp.comp152;

public class SalariedEmployee extends Emplyee{
    private double yearlySalary;

    public SalariedEmployee(double Salary){
        yearlySalary = Salary;
    }
    @Override
    public double calculateBiWeeklyPay() {
        return yearlySalary/26;
    }
}
