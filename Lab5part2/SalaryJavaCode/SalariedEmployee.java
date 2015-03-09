package salarydemo;

/**
 * A salaried employee is paid the same amount independent of the hours worked.
 */
public class SalariedEmployee extends Employee {
	private double _annualSalary;

	/**
	 * Constructs a salaried employee with a given name and annual salary.
	 * @param name the name of this employee
	 * @param salary the annual salary
	 */
	public SalariedEmployee(String name, double salary) {
		throw new UnsupportedOperationException();
	}

	public double weeklyPay(int hoursWorked) {
		throw new UnsupportedOperationException();
	}
}