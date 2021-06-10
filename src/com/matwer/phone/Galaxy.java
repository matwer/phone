/**
 * 
 */
package com.matwer.phone;

/**
 * @author Matthew
 *
 */
public class Galaxy extends Phone implements Ringable {

	/**
	 * these are the member variables from Phone
	 * @param versionNumber
	 * @param batteryPercentage
	 * @param carrier
	 * @param ringTone
	 */
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// ...
		return "Galaxy " + super.getVersionNumber() + " says " + super.getRingTone();
	}

	@Override
	public String unlock() {
		// ...
		return "Unlocking via fingerprint";
	}

	@Override
	public void displayInfo() {
		// use the getters from the Phone superclass's constructor 
		System.out.println("Galaxy " + super.getVersionNumber() + " from " + super.getCarrier());
	}

}
