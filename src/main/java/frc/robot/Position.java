package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {
      int x; 
      int y;
      

    public void driveUp() throws InterruptedException {
     y += 10;
      driveDistance(10);
    }

    public void driveDown() throws InterruptedException {
      y -= 10;
      driveDistance(-10);
    }

    public void driveRight() throws InterruptedException {
      x += 10;
     turnDegrees(90);
    driveDistance(10);
    turnDegrees(-90);
    }

    public void driveLeft() throws InterruptedException {
      x -= 10;
      turnDegrees(-90);
      driveDistance(10);
      turnDegrees(90);
      
    }

    public void returnToHome() {
      
  
    }

    public String toString() {
        return 
         System.out.println("Robot is at " + x + ", " + y);
        
      // x = 10, y = 20
        // (10, 20)
    }
}
