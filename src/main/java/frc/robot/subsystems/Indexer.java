// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix6.hardware.*;
import edu.wpi.first.wpilibj.drive.*;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Indexer extends SubsystemBase {
  /** Creates a new Indexer. */

private TalonSRX Indexer = new TalonSRX(5);

  public Indexer() {

    Indexer.setInverted(false);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
}

 public Void stop() {

      Indexer.stopMotor();
    }
  }