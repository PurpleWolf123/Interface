//Creating a interface
import java.util.Scanner;
interface Vehicle{
    // all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
// we use keyword implemens to inherit a interface
class Truck implements Vehicle{
    
    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear){
          gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    //to decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
         System.out.println("speed:" + speed + "gear:" + gear);
    }
}

class Bike implements Vehicle{
     
    int speed;
    int gear;

    //to change gear
    @Override
    public void changeGear(int newGear){

        gear =newGear;
    }

    //to increase speed
    @Override
    public void speedUp(int increment){

        speed = speed + increment;
    }
    //to decrease speed
    @Override
    public void applyBrakes(int decrement){

        speed = speed - decrement;

    }

    public void printStates(){
         System.out.println("speed" + speed + "gear" + gear);
    }

}
class Main{

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String CurrentSpeed;
        String CurrentGear;
        String BrakeApplied;
    }

        // creating an instance of  the  Bicycle
        // doing some operation
        Truck truck  = new Truck();
        truck.changeGear(2);
        truck.speedUp(3);
        truck.applyBrakes(1);

        System.out.println("Bicycle present state :");
        truck.printStates();

        // creating instance of the Bike
        Bike bike  = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Please input the current speed, gear and brake variables:");
        CurrentSpeed = myObj.nextLine();
        CurrentGear = myObj.nextLine();
        BrakeApplied = myObj.nextLine();
        System.out.println("Current Speed applied:" + CurrentSpeed);
        System.out.println(" Current Gear applied:" + CurrentSpeed);
        System.out.println("Current Brake variable applied:" + CurrentSpeed);
        bike.printStates();
}
}
