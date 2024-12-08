// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.*;
import com.ctre.phoenix6.hardware.*;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Drive extends SubsystemBase {
  /** Creates a new Drive. */

//left
private TalonSRX Left1 = new TalonSRX(0);
private TalonSRX Left2 = new TalonSRX(1);
//right
private TalonSRX Right1 = new TalonSRX(2);
private TalonSRX Right2 = new TalonSRX(3);

//motor groups
private MotorControllerGroup motorL = new MotorControllerGroup(Left1, Left2);
private MotorControllerGroup motorR = new MotorControllerGroup(Right1, Right2);

//Diff Drive
DifferentialDrive differentialDrive = new DifferentialDrive(motorL, motorR);

  public Drive() {

  Left1.setInverted(false);
  Left2.setInverted(false);
  Right1.setInverted(false);
  Right2.setInverted(false);

  motorL.setInverted(false);
  motorR.setInverted(false);

  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void set(double drive, double turn){
    DifferentialDrive.arcadeDriveIK(drive, turn, true);
  }
  public void stop(){
    differentialDrive.stopMotor();
  }
}
