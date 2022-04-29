/*
* Purpose: Catapult object storing angle and speed to be used by a tester class to calculate distance.
* Author: Madeline Vande Hey
* Date: 4/12/22
*/
import java.lang.Math;

public class Catapult{
    private int speed;
    private int angle;

    public Catapult(int speed, int angle){
        this.speed = speed;
        this.angle = angle;
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int s){
        speed = s;
    }

    public int getAngle(){
        return angle;
    }
    public void setAngle(int a){
        angle = a;
    }

    public double calcDistance(int speed, int angle){
        return ((speed * speed) * (Math.sin(2 * Math.toRadians((double)angle))) / 14.946691706);
    }
}