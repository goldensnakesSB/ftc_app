package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;


@TeleOp(name="MoveMotors")
public class BasicOpMode_MoveMotors extends OpMode
{
    private DcMotor motor1 = null;

    @Override
    public void init() {

        motor1  = hardwareMap.get(DcMotor.class, "left_drive");

        motor1.setDirection(DcMotor.Direction.FORWARD);
    }


    @Override
    public void init_loop() {
    }


    @Override
    public void start() {

    }


    @Override
    public void loop() {
        motor1.setPower(0.5);
    }


    @Override
    public void stop() {
    }

}
