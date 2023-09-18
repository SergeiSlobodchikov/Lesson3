import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{
    private Freelancer(String surName, String name, double salary){
        super(surName, name, salary);
    }


    public static Employee getInstance(){
        return new Freelancer(
                surNames[random.nextInt(surNames.length)],
                names[random.nextInt(surNames.length)],
                20.8 * 8 * (random.nextInt(500, 1500)));
    }



    public static List<Employee> getAddEmployees( List<Employee> employees, int count){
        for (int i = 0; i < count; i++)
            employees.add(getInstance());
        return employees;
    }
    public static List<Employee> getEmployees(int count){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++)
            employees.add(getInstance());
        return employees;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата ( 20.8 * 8 * почасовая ставка): %.2f (руб.)",
                surName, name, salary);
    }

}
