package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="DeployDeposit", group="Pushbot")
public class DeployDeposit extends LinearOpMode {

    TartleBot robot           = new TartleBot();



    public void runLinearDeploy(){
        //wait for 20 milliseconds before starting actions
        sleep(20);

        //make the robot deploy from the lander and tough the ground, then stop power
        robot.linearLatch.setPower(-0.5);
        sleep(4000);
        robot.linearLatch.setPower(0);

        //make the robot turn to the left to get clear from the lander
        robot.leftDrive.setPower(0);
        sleep(500);
        robot.rightDrive.setPower(0.5);
        sleep(500);

        //stop power to the 2 drives
        robot.leftDrive.setPower(0);
        sleep(10);
        robot.rightDrive.setPower(0);
        sleep(10);
    }
    public void depositMascot(){
        //make the robot turn to the left again to get in the correct deposit angle
        robot.rightDrive.setPower(0.5);
        sleep(500);
        robot.leftDrive.setPower(0);
        sleep(500);

        //keep driving straight. The robot will hit the wall, align itself, and then reach the depot. Then it will stop power.
        robot.leftDrive.setPower(0.5);
        sleep(4000);
        robot.rightDrive.setPower(0.5);
        sleep(4000);
        robot.rightDrive.setPower(0);
        robot.leftDrive.setPower(0);

        //use the mascot arm to fling the mascot into the depot
        //robot.mascotServo.setPosition(0.7);
    }

    @Override
    public void runOpMode() throws InterruptedException{
        waitForStart();
        runLinearDeploy();
        depositMascot();
    }
}
