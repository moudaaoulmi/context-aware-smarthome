/*
 * HumiditySensorData.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package smarthouse.ontology.beanynizer;



/**
 *  Java class for concept HumiditySensor of SmartHouseOntology ontology.
 */
public abstract class HumiditySensorData	extends Sensor implements nuggets.INugget
{
	//-------- constants ----------

	//-------- attributes ----------

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>HumiditySensor</code>.
	 */
	public HumiditySensorData()  { //
	}

	//-------- accessor methods --------

	//-------- object methods --------

	/**
	 *  Get a string representation of this HumiditySensor.
	 *  @return The string representation.
	 */
	public String toString() {
		return "HumiditySensor("
		+ "devicestatus="+getDeviceStatus()
		+ ", haslocation="+getHasLocation()
		+ ", instancename="+getInstanceName()
		+ ", sensorvalue="+getSensorValue()
		+ ", timestamp="+getTimestamp()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this HumiditySensor using the nuggets utility.
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
	 * Restore this HumiditySensor 
	 * @param a the name of the attribute
	 * @param v the value of the attribute
	 */
	public void _set(String a, Object v) { //
		switch(hash(a)) {
		case 0: devicestatus =  (String)v; return;
		case 1: sensorvalue =  (String)v; return;
		case 2: haslocation =  (Location)v; return;
		case 3: instancename =  (String)v; return;
		case 4: timestamp =  (String)v; return;
		}                        
	}
	
private static final int hash(String name) {
   return ((2064133728*name.charAt(0))>>>15)%5;
}

}
