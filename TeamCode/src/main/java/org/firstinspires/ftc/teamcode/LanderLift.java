package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="LanderLift", group="Pushbot")
public class LanderLift extends LinearOpMode {

    TartleBot robot           = new TartleBot();

    DcMotor landerDc;


    public void runLanderLift(){
        //make the linearLatch lift the robot
        robot.linearLatch.setPower(1);
        sleep(1500);
        robot.linearLatch.setPower(0);

    }

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        runLanderLift();
    }

}
