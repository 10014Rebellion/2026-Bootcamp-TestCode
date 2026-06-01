package frc.robot.motor;

import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkFlex;

import edu.wpi.first.wpilibj2.command.FunctionalCommand;

public class MotorSS {
    public SparkFlex mMotor;

    public MotorSS() {
        mMotor = new SparkFlex(MotorConstants.motorID, MotorConstants.kMotorType);
        mMotor.configure(MotorConstants.kMotorConfig, ResetMode.kNoResetSafeParameters, PersistMode.kPersistParameters);
    }

    public void setVoltage(double pVolts) {
        mMotor.setVoltage(pVolts);
    }
}
