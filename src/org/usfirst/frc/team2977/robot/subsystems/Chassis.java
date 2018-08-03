package org.usfirst.frc.team2977.robot.subsystems;
import org.usfirst.frc.team2977.robot.commands.Driving;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.PWMSpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;;

	

/**
 *
 */
public class Chassis extends Subsystem {

	
	PWMSpeedController frontRight = new Jaguar(1);
	PWMSpeedController frontLeft = new Jaguar(2);
	PWMSpeedController backRight = new Jaguar(3);
	PWMSpeedController backLeft= new Jaguar(4);
	
	MecanumDrive mecDrive = new MecanumDrive(frontLeft, backLeft, frontRight, backRight);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void drive(double x, double y, double z) {
		mecDrive.driveCartesian(x, y, z);
		
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new Driving());
        	
        }
    }

