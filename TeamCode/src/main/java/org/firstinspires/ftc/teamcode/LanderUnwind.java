package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous(name="LanderUnwind", group="Pushbot")
public class LanderUnwind extends LinearOpMode {

    TartleBot robot           = new TartleBot();


    public void runUnwind(){
        robot.linearLatch.setPower(-0.5);
        sleep(1000);
        robot.linearLatch.setPower(0);

    }

    @Override
    public void runOpMode(){

        runUnwind();
    }
}
