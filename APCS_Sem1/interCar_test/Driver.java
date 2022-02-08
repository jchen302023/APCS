
public class Driver {
  public static void main(String[] args) {
    // The array of type Car (the interface)
    Car[] randomcars = new Car[3];

    for (int i = 0; i < randomcars.length; i ++) {
      if (Math.random() > 0.5) {
        randomcars[i] = new Sedan();
      }
      else {
        randomcars[i] = new Truck();
      }
    } // returns random array of Sedans and Trucks

    for (Car car : randomcars) {
               System.out.println(car.numseats() + " " + car.horsepower() + " " + car.color());
          } // print Car
    // Sedan + Trucks are under type Car, so that means methods defined in Car can be called on Sedans or Trucks without
    // having to know if it is a Truck or Sedan.

  } // main
} // end Driver
