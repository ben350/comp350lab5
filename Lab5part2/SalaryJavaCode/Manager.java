package salarydemo;

/**
 * A manager is a salaried employee who also receives a bonus.
 */
public class Manager extends SalariedEmployee {
	private double _weeklyBonus;

	/**
	 * Constructs a manager with a given name, annual salary and weekly bonus.
	 * @param name the name of this employee
	 * @param salary the annual salary
	 * @param bonus the weekly bonus
	 */
	public Manager(String name, double salary, double bonus) {
		throw new UnsupportedOperationException();
	}

	public double weeklyPay(int hoursWorked) {
		throw new UnsupportedOperationException();
	}
}