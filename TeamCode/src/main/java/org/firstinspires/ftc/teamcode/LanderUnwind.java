package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous(name="LanderUnwind", group="Pushbot")
public class LanderUnwind extends LinearOpMode {

    TartleBot robot           = new TartleBot();

    DcMotor landerDc;


    public void runUnwind(){
        landerDc = hardwareMap.dcMotor.get("linear_latch");
        landerDc.setPower(-0.5);
        sleep(1000);
        landerDc.setPower(0);

    }

    @Override
    public void runOpMode(){

        runUnwind();
    }
}
