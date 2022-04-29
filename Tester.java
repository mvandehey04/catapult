/*
* Purpose: Tester class for catapult objects, catapulting strawberries and calculating their distance.
* Author: Madeline Vande Hey
* Date: 4/12/22
*/
public class Tester {
    public static void main(String args[]){
        int [] speed = new int[7];
        int [] angle = new int[6];
        double [][] distance = new double[7][6];

        // speeds of strawberries
        speed [0] = 20;
        speed [1] = 25;
        speed [2] = 30;
        speed [3] = 35;
        speed [4] = 40;
        speed [5] = 45;
        speed [6] = 50;

        // angles of strawberries
        angle [0] = 25;
        angle [1] = 30;
        angle [2] = 35;
        angle [3] = 40;
        angle [4] = 45;
        angle [5] = 50;

        // catapult object
        Catapult catapult;

        // calculate distance of strawberries
        for(int row = 0; row < distance.length; row ++){
            for(int col = 0; col < distance[row].length; col ++){
                catapult = new Catapult(speed[row], angle[col]);
                distance [row][col] = catapult.calcDistance(catapult.getSpeed(), catapult.getAngle());
            }
        }

        // print the results of the tests
        printResults(distance, speed);

    }

    public static void printResults(double [][] distance, int [] speed){
        System.out.printf("%55s","Projectile Distance of Strawberries (ft)");
        System.out.printf("\n %s %9s %10s %10s %10s %10s %10s","MPH", "25 deg", "30 deg", "35 deg", "40 deg", "45 deg", "50 deg");
        System.out.println("\n=======================================================================");

        for(int row = 0; row < distance.length; row ++){
            System.out.printf("%3d   ", speed[row]);
            for(int col = 0; col < distance[row].length; col ++){
                System.out.printf("%7.2f    ", distance[row][col]);
            }
            System.out.println();
        }
    }
}
