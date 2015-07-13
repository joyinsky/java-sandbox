/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author luisfernando
 */
public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle(10, 0, 1);
        Bicycle bike2 = new MountainBike(0, 10, 0, 1);
        
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printState();
        bike1.speedDown(10);
        bike1.printState();
        bike1.applyBrakes();
        bike1.printState();        
        
        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printState();
        bike2.applyBrakes();
        bike2.printState();
    }
}
