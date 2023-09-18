import java.util.ArrayList;
import java.util.List;

public class Combinate extends Employee {

    protected Combinate(String surName, String name, double salary) {
        super(surName, name, salary);
    }

    /**
     * Складываем два листа
     * @param employees например фрилансеров
     * @param employees2 например рабочих
     * @return
     */

    public static List<Employee> combinetList(List<Employee> employees, List<Employee> employees2){
        List<Employee> combinedList = new ArrayList<>(employees);
        combinedList.addAll(employees2);
        return combinedList;
    }
    @Override
    public double calculateSalary() {
        return salary;
    }
}
