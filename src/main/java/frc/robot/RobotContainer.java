// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.motor.MotorSS;

public class RobotContainer {
  private MotorSS mMotorSS;
   private final CommandXboxController mDriverController = new CommandXboxController(0);

  public RobotContainer() {
    mMotorSS = new MotorSS();
    configureBindings();
  }

  private void configureBindings() {
    mDriverController.a()
      .whileTrue(new InstantCommand(() -> mMotorSS.setVoltage(3)))
      .whileFalse(new InstantCommand(() -> mMotorSS.setVoltage(0)));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
