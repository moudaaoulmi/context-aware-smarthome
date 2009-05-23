/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of Sensor.
 * Feel free to change.
 *
 */
package ontology.lowerOntology;


/**
 *  Editable Java class for concept <code>Sensor</code> of SmartHouseOntology ontology.
 */
public class Sensor  extends SensorData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>Sensor</code>.
   */
  public Sensor() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>Sensor</code>.
   * @param devicestatus    
   * @param haslocation    
   * @param instancename    
   * @param sensorvalue    
   * @param timestamp    
   */
  public Sensor(String devicestatus, Location haslocation, String instancename, String sensorvalue, String timestamp) {
    // Constructor using required slots (change if desired).
    setDeviceStatus(devicestatus);
    setHasLocation(haslocation);
    setInstanceName(instancename);
    setSensorValue(sensorvalue);
    setTimestamp(timestamp);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>Sensor</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public Sensor(Sensor proto) {
    setDeviceStatus(proto.getDeviceStatus());
    setHasLocation(proto.getHasLocation());
    setInstanceName(proto.getInstanceName());
    setSensorValue(proto.getSensorValue());
    setTimestamp(proto.getTimestamp());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>Sensor</code>.
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
  
  /** 
   *  Get a clone of this <code>Sensor</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new Sensor(this);
  }
  
  /** 
   *  Test the equality of this <code>Sensor</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>Sensor</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof Sensor) {
      Sensor cmp=(Sensor)obj;
      if (getDeviceStatus()!=cmp.getDeviceStatus() &&
           (getDeviceStatus()==null || !getDeviceStatus().equals(cmp.getDeviceStatus()))
          ) return false;
      if (getHasLocation()!=cmp.getHasLocation() &&
           (getHasLocation()==null || !getHasLocation().equals(cmp.getHasLocation()))
          ) return false;
      if (getInstanceName()!=cmp.getInstanceName() &&
           (getInstanceName()==null || !getInstanceName().equals(cmp.getInstanceName()))
          ) return false;
      if (getSensorValue()!=cmp.getSensorValue() &&
           (getSensorValue()==null || !getSensorValue().equals(cmp.getSensorValue()))
          ) return false;
      if (getTimestamp()!=cmp.getTimestamp() &&
           (getTimestamp()==null || !getTimestamp().equals(cmp.getTimestamp()))
          ) return false;
      return true;
    }
    return false;
  }
}
