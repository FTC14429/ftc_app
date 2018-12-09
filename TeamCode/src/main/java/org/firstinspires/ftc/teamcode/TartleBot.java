package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class TartleBot {

    /* Public OpMode members. */
    public DcMotor leftDrive   = null;
    public DcMotor  rightDrive  = null;
    public DcMotor  linearLatch = null;
    //public DcMotor  blockDc     = null;
    public Servo sweeper     = null;

    public static final double MID_SERVO       =  0.5 ;
    public static final double ARM_UP_POWER    =  1 ;
    public static final double ARM_DOWN_POWER  = -1 ;

    /* local OpMode members. */
    HardwareMap hwMap           =  null;
    private ElapsedTime period  = new ElapsedTime();

    //Constructor
    public TartleBot(){

    }

    public void initialize(HardwareMap ahwMap){

        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        leftDrive  = hwMap.get(DcMotor.class, "left_drive");
        rightDrive = hwMap.get(DcMotor.class, "right_drive");
        leftDrive.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        rightDrive.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors
        linearLatch  = hwMap.get(DcMotor.class, "linear_latch");

        // Set all motors to zero power
        leftDrive.setPower(0);
        rightDrive.setPower(0);
        linearLatch.setPower(0);

        //Define and Initialize Servos
        sweeper    = hwMap.get(Servo.class, "sweep_arm");

        // Define and initialize ALL installed servos.
        sweeper.setPosition(MID_SERVO);

        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        leftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        linearLatch.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

}
