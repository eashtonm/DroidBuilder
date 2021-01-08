public class Droid {
  /*
  This program allows the user to create droids. Droids
  are named, they can perform tasks, and their battery
  life can be effected.
  This program was created by Elizabeth Mitchell on
  January 7th, 2021.
  */
  String name;
  int batteryLevel;
  
  // Output will intoduce droid by name
  public String toString() {
    return "Hello, I am " + name + ". Beep boop.";
  }
  
  // Constructor method for the Droid class
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  // Method for Droid object to perform a task
  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  // Method to aquire the Droid object's battery level
  public void energyReport() {
    System.out.println(name + " has " + batteryLevel + "% battery life remaining."); 
  }

  // Method to transfer energy from one Droid to another
  public void energyTransfer(Droid droid1, Droid droid2, int amount) {
    droid1.batteryLevel -= amount;
    droid2.batteryLevel += amount;
    System.out.println(droid1.name + " has transferred battery life to " + droid2.name + ". New battery level for " + droid1.name + " is " + droid1.batteryLevel + "%. New battery level for " + droid2.name + " is " + droid2.batteryLevel + "%.");
  }

  // Main method
  public static void main(String[] args) {
    // New instance of a Droid object
    Droid codey = new Droid("Codey");
    Droid roomba = new Droid("Roomba");
    
    System.out.println(codey);
    System.out.println(roomba);
    
    codey.performTask("vacuuming");
    codey.performTask("dancing");
    codey.performTask("beeping");

    codey.energyReport();

    roomba.energyTransfer(roomba, codey, 30);

    roomba.performTask("spinning");
    roomba.performTask("booping");

    roomba.energyReport();

    codey.energyReport();

  }
}