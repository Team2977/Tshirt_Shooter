package org.usfirst.frc.team2977.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Relay;



/**
 *
 */
public class Compressor extends Subsystem {

	Relay comp1 = new Relay(0);
	Relay valve = new Relay(1);
	

	
	public void startCompress() {
		comp1.set(Relay.Value.kForward);
	}
	
	public void stopCompress() {
		comp1.set(Relay.Value.kOff);
	}
	
	public void startShoot() {
		valve.set(Relay.Value.kForward);
	}
	
	public void stopShoot() {
		valve.set(Relay.Value.kOff);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

