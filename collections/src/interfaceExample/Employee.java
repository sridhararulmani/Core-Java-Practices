package interfaceExample;
@FunctionalInterface
public interface Employee {
	void work();
}
/**
 * Types  of Interfaces:
 * ------------------------
 * 1.Marker Interface:
 *  -An Empty Interface without any abstract method is Functional Interface.
 *  -Example:Serializable.
 *  
 * 2.Functional Interface:
 * 	-An interface with only one abstract method is called as Functional Interface.
 *  -While Declaring functional interface we can optionally make use of @FunctionalInterface.
 *  -Example:Comparable. 
 */