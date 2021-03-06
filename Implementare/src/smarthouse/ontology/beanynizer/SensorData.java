/*
 * SensorData.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package smarthouse.ontology.beanynizer;



/**
 *  Java class for concept Sensor of SmartHouseOntology ontology.
 */
public abstract class SensorData	extends Device implements nuggets.INugget
{
	//-------- constants ----------

	/** Predefined value "LOW" for slot sensorValue. */
	public static String  SENSORVALUE_LOW  = "LOW";
	/** Predefined value "MEDIUM" for slot sensorValue. */
	public static String  SENSORVALUE_MEDIUM  = "MEDIUM";
	/** Predefined value "HIGH" for slot sensorValue. */
	public static String  SENSORVALUE_HIGH  = "HIGH";

	//-------- attributes ----------

	/** Attribute for slot sensorValue. */
	protected  String  sensorvalue;

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>Sensor</code>.
	 */
	public SensorData()  { //
	}

	//-------- accessor methods --------

	/**
	 *  Get the sensorValue of this Sensor.
	 * @return sensorValue
	 */
	public String  getSensorValue() {
		return this.sensorvalue;
	}

	/**
	 *  Set the sensorValue of this Sensor.
	 * @param sensorvalue the value to be set
	 */
	public void  setSensorValue(String sensorvalue) {
		this.sensorvalue = sensorvalue;
	}

	//-------- object methods --------

	/**
	 *  Get a string representation of this Sensor.
	 *  @return The string representation.
	 */
	public String toString() {
		return "Sensor("
		+ "devicestatus="+getDeviceStatus()
		+ ", haslocation="+getHasLocation()
		+ ", instancename="+getInstanceName()
		+ ", sensorvalue="+getSensorValue()
		+ ", timestamp="+getTimestamp()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this Sensor using the nuggets utility.
	 * @param c 
	 */
	public void _persist(nuggets.ICruncher c) {
		// declare references
		int idHasLocation = c.declare(haslocation);
		// persist the nugget
		c.startConcept(this);
		if (devicestatus!=null) 
			c.put("devicestatus", devicestatus);
		if (idHasLocation>0) 
			c.put("haslocation", idHasLocation);
		if (instancename!=null) 
			c.put("instancename", instancename);
		if (sensorvalue!=null) 
			c.put("sensorvalue", sensorvalue);
		if (timestamp!=null) 
			c.put("timestamp", timestamp);
	}
	
	/**
	 * Restore this Sensor 
	 * @param a the name of the attribute
	 * @param v the value of the attribute
	 */
	public void _set(String a, Object v) { //
		switch(hash(a)) {
		case 0: devicestatus =  (String)v; return;
		case 1: timestamp =  (String)v; return;
		case 2: haslocation =  (Location)v; return;
		case 3: sensorvalue =  (String)v; return;
		case 4: instancename =  (String)v; return;
		}                        
	}
	
private static final int hash(String name) {
   return ((714909982*name.charAt(0))>>>15)%5;
}

}
