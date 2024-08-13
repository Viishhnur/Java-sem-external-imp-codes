public class Employee {
    public int eid;
    public String ename;
    public double esal;
    public Employee(int eid,String ename, double esal) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
    }

    public void printEmpDetails(){
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Salary: " + esal);
    }

    @Override
    public String toString() {
        return "Employee{id=" + eid + ", name='" + ename + "', salary=" + esal + "}";
    }

}
