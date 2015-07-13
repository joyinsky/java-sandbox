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
public class Bicycle {
    public int cadence;
    public int speed;
    public int gear;
    
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        cadence = startCadence;
        speed = startSpeed;
        gear = startGear;
    }
    
    void changeCadence(int newCadence) {
        cadence = newCadence;
    }
    
    void changeGear(int newGear) {
        gear = newGear;
    }
    
    void speedUp(int increment) {
        speed += increment;
    }
    
    void speedDown(int decrement) {
        speed -= decrement;
    }
    
    void printState() {
        System.out.println("cadence: " + cadence + ", speed: " + speed 
                + ", gear: " + gear);
    }
    
    void applyBrakes() {
        if(isMoving()) {
            speed--;
        }
    }
    
    boolean isMoving() {
        return speed > 0;
    }
}
