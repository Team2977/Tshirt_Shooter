package org.usfirst.frc.team2977.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team2977.robot.Robot;

import edu.wpi.first.wpilibj.DigitalInput;
/**
 *
 */
public class Compress extends Command {

	DigitalInput pressureSwitch = new DigitalInput(0);
	boolean isSwitched;
    public Compress() {

        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	isSwitched = pressureSwitch.get();
    	
    	if(isSwitched==false) {
    		Robot.Compressor.startCompress();
    	}
    		else {
    			Robot.Compressor.stopCompress();
    		}
    }
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isSwitched;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.Compressor.stopShoot();
    }
}
