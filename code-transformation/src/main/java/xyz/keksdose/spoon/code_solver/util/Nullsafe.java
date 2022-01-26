
package xyz.keksdose.spoon.code_solver.util;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class Nullsafe {

	private Nullsafe() {
	}

	/**
	 * Returns the value of the given supplier if it doesn't throw an exception, otherwise returns the default value.
	 * This method is useful for null-safe access to a value in the spoon metamodel.
	 * @param <T>  the type of the value
	 * @param supplier  the supplier
	 * @param defaultValue  the default value to return if the supplier throws an exception
	 * @return  the value of the given supplier if it doesn't throw an exception, otherwise returns the default value.
	 */
	public static <T> T get(Supplier<T> supplier, T defaultValue) {
		try {
			return supplier.get();
		}
		catch (Throwable e) {
			return defaultValue;
		}
	}

	/**
	* Returns the value of the given supplier if it doesn't throw an exception, otherwise returns the default value.
	* This method is useful for null-safe access to a value in the spoon metamodel.
	* @param <T>  the type of the value
	* @param supplier  the supplier
	* @param defaultValue  the default value to return if the supplier throws an exception
	* @return  the value of the given supplier if it doesn't throw an exception, otherwise returns the default value.
	*/
	public static boolean get(BooleanSupplier supplier, boolean defaultValue) {
		try {
			return supplier.getAsBoolean();
		}
		catch (Throwable e) {
			return defaultValue;
		}
	}
}
