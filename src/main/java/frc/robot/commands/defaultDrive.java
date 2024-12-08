// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class defaultDrive extends Command {
  /** Creates a new defaultDrive. */

  private Drive driveSubsystem;
  private XboxController xController;
  
  double drive;
  double turn;


  public defaultDrive(Drive DriveSubsystem, XboxController xController) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.driveSubsystem = driveSubsystem;
    this.xController = xController;
    addRequirements(driveSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    drive = 0;
    turn = 0;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drive = xController.getLeftY();
    turn = xController.getRightX();

    differentialDrive.set(drive, turn);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
