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
class MountainBike extends Bicycle {
    public int seatHeight;
    
    public MountainBike(int startSeatHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startSeatHeight;
    }
    
    public void setHeight(int newHeight) {
        seatHeight = newHeight;
    }
    
    @Override
    public void printState() {
        System.out.print("Mountain Bike - ");
        super.printState();
    }
}
