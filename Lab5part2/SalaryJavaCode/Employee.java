package salarydemo;

/**
 * An employee has a name and a mechanism for computing weekly pay.
 */
public class Employee {
	private String _name;

	/**
	 * Constructs an employee with an empty name.
	 */
	public Employee() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Computes the pay for one week of work.
	 * @param hoursWorked the number of hours worked in the week
	 * @return the pay for the given number of hours
	 */
	public double weeklyPay(int hoursWorked) {
		throw new UnsupportedOperationException();
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getName() {
		return this._name;
	}
}