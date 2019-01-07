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


        robot.leftDrive = hardwareMap.dcMotor.get("left_drive");
        robot.rightDrive = hardwareMap.dcMotor.get("right_drive");
        landerDc = hardwareMap.dcMotor.get("linear_latch");

        sleep(20);
        landerDc.setPower(-0.5);
        sleep(5000);
        landerDc.setPower(0);

        robot.leftDrive.setPower(0.5);
        robot.rightDrive.setPower(0.5);
        sleep(150);
        robot.leftDrive.setPower(0);
        robot.rightDrive.setPower(0);

        sleep(1000);

        robot.leftDrive.setPower(-0.5);
        robot.rightDrive.setPower(0.5);
        sleep(50);

        robot.leftDrive.setPower(-0.4);
        robot.rightDrive.setPower(0.2);
        sleep(1000);

        robot.leftDrive.setPower(-0.2);
        robot.rightDrive.setPower(1);
        sleep(1000);

        robot.leftDrive.setPower(-0.5);
        robot.rightDrive.setPower(0.5);
        sleep(1000);
        robot.rightDrive.setPower(0);
        robot.leftDrive.setPower(0);
    }

    @Override
    public void runOpMode() throws InterruptedException{
        waitForStart();
        runLinearDeploy();
    }
}
