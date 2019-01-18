package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="MascotFling", group="Pushbot")
public class MascotFling extends LinearOpMode {

    TartleBot robot           = new TartleBot();



    public void flingMascot(){

        //make the robot turn to the left again to get in the correct deposit angle
        //robot.rightDrive.setPower(0.5);
        //sleep(500);
        /*robot.leftDrive.setPower(0);
        sleep(500);

        //keep driving straight. The robot will hit the wall, align itself, and then reach the depot. Then it will stop power.
        robot.leftDrive.setPower(0.5);
        sleep(4000);
        robot.rightDrive.setPower(0.5);
        sleep(4000);
        robot.rightDrive.setPower(0);
        robot.leftDrive.setPower(0);
        */


        //use the mascot arm to fling the mascot into the depot
        robot.mascotFling.setPower(-0.6);
        sleep(100);
        robot.mascotFling.setPower(0);

    }

    @Override
    public void runOpMode() throws InterruptedException{

        robot.initialize(hardwareMap);
        sleep(200);

        waitForStart();
        flingMascot();
    }
}
