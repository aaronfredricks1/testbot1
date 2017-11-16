package org.usfirst.frc.team2509.robot.subsystems;

import org.usfirst.frc.team2509.robot.OI;
import org.usfirst.frc.team2509.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class drivetrain extends Subsystem {
	private static Talon left = RobotMap.driveleft;
	private static Talon right = RobotMap.driveright;
	private static RobotDrive drive = RobotMap.drive;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void driving() {
    	drive.tankDrive(OI.leftstick.getY(),OI.rightstick.getY());
    }
}

