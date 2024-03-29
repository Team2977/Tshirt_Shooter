package org.usfirst.frc.team2977.robot.commands;
import org.usfirst.frc.team2977.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
/**
 *
 */
public class Driving extends Command {
    public Driving() {
    	requires(Robot.Chassis);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.Chassis.drive(-Robot.oi.joystick.getRawAxis(0), Robot.oi.joystick.getRawAxis(1), -Robot.oi.joystick.getRawAxis(4));
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
