// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix6.hardware.*;
import edu.wpi.first.wpilibj.drive.*;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */

  private TalonSRX shooter1 = new TalonSRX(6);
  private TalonSRX shooter2 = new TalonSRX(7);

  public Shooter() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void stop(){
    shooter1.stopMotor();
    shooter2.stopMotor();
  }
}
