import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    /**
     * Добавил по зарплате если имена тоже
     * совпадают
    */
    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.getSurName().compareTo(o2.getSurName());
        if (res == 0){
            int res2 = o1.getName().compareTo(o2.getName());
            if(res2 == 0) return o1.compareTo(o2);
            return o1.getName().compareTo(o2.getName());
        }
        return res;
    }
}
