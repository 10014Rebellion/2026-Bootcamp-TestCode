package frc.robot.motor;

import com.revrobotics.spark.SparkFlex;

import edu.wpi.first.wpilibj2.command.FunctionalCommand;

public class MotorSS {
    public SparkFlex mMotor;

    public MotorSS() {
        mMotor = new SparkFlex(MotorConstants.motorID, MotorConstants.kMotorType);
    }

    public void setVoltage(double pVolts) {
        mMotor.setVoltage(pVolts);
    }
}
