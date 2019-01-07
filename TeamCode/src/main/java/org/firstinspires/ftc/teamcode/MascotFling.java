package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="MascotFling", group="Pushbot")
public class MascotFling extends LinearOpMode {

    TartleBot robot           = new TartleBot();



    public void flingMascot(){
        //use the mascot arm to fling the mascot into the depot
        //robot.mascotServo.setPosition(0.6);
        if (robot.mascotServo == null){
            System.out.println("mascotServo is null");
        }
        else if (robot.mascotOne == null){
            System.out.println("mascotOne is null");
        }
        else if (robot.mascotTwo == null){
            System.out.println("mascotTwo is null");
        }
        else {
            System.out.println("none of the servos are null");
        }
        robot.mascotServo.setPosition(0.7);
        robot.mascotOne.setPosition(0.7);
        robot.mascotTwo.setPosition(0.7);
    }

    @Override
    public void runOpMode() throws InterruptedException{
        waitForStart();
        flingMascot();
    }
}
