package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcontroller.external.samples.HardwarePushbot;

@Autonomous(name="LanderDeploy", group="Pushbot")
public class LanderDeploy extends LinearOpMode {

    TartleBot robot           = new TartleBot();

    DcMotor landerDc;
    //DcMotor blockDc;


    public void linearDeploy(){
    }

    public void runLinearDeploy(){
        landerDc = hardwareMap.dcMotor.get("linear_latch");
        //blockDc = hardwareMap.dcMotor.get ("block_latch");
        //blockDc.setPower(-1);
        sleep(20);
        //blockDc.setPower(0);
        sleep(1000);
        landerDc.setPower(-0.5);
        sleep(4000);
        landerDc.setPower(0);
        robot.leftDrive.setPower(0);
        sleep(500);
        robot.rightDrive.setPower(0.5);
        sleep(500);

    }

    @Override
    public void runOpMode() throws InterruptedException{
        waitForStart();
        runLinearDeploy();
    }
}
