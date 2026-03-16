package prob2;

import java.util.*;

public class Statistics {
	/**
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		if (aList.isEmpty() || aList == null) return 0.0;

		double total = 0.0;

		for (EmployeeData e : aList) {
			if (e == null) continue;
			total += e.getSalary();
		}

		return total;
	}
}