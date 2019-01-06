package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="LanderLift", group="Pushbot")
public class LanderLift extends LinearOpMode {

    TartleBot robot           = new TartleBot();

    DcMotor landerDc;


    public void runLanderLift(){
        landerDc = hardwareMap.dcMotor.get("linear_latch");
        landerDc.setPower(1);
        sleep(1500);
        landerDc.setPower(0);

    }

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        runLanderLift();
    }

}
