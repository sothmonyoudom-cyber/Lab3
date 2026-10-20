package Test;
import java.util.Scanner;
class Car{
	String model;
	int year;
}
	Car(String model, int year){
		this.name = name;
		this.year = year;
	}
	Car(){
		this.name = "Toyota";
		this.year = 2025;
	}
	public void print() {
		System.out.printf("%d %s \\n\", model, year");
	}
public class testoutside {

	public static void main(String[] args) {
		Car car1 = new Car("Tesla", 2025);
		Car car2 = new Car();
		car1.print();
		car2.print();
	}

}
