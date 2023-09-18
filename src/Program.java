import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        /**
         * Добавил рабочих 15 штук и фрилансеров объединил и сортировал
         */
        List<Employee> employees = Worker.getEmployees(15);
        List<Employee> employees2 = Freelancer.getEmployees(15);

        List<Employee>  combinate = Combinate.combinetList(employees,employees2);


        for (Employee employee: combinate) {
            System.out.println(employee);
        }

        Collections.sort(combinate, new EmployeeNameComparator());
        System.out.println();

        for (Employee employee: combinate) {
            System.out.println(employee);
        }

    }

}
