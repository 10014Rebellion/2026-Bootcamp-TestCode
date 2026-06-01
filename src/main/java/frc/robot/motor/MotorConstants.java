package frc.robot.motor;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkFlexConfig;


public class MotorConstants {
    public static final int motorID = 60;
    public static final MotorType kMotorType = MotorType.kBrushless;
    public static final SparkFlexConfig kMotorConfig = new SparkFlexConfig();

    static {
      kMotorConfig.smartCurrentLimit(50).idleMode(IdleMode.kCoast).inverted(true);
    
    }
}
