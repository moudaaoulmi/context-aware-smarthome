/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of CentralHeating.
 * Feel free to change.
 *
 */
package ontology.lowerOntology;


/**
 *  Editable Java class for concept <code>CentralHeating</code> of SmartHouseOntology ontology.
 */
public class CentralHeating  extends CentralHeatingData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>CentralHeating</code>.
   */
  public CentralHeating() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>CentralHeating</code>.
   * @param devicestatus    
   * @param haslocation    
   * @param instancename    
   * @param timestamp    
   */
  public CentralHeating(String devicestatus, Location haslocation, String instancename, String timestamp) {
    // Constructor using required slots (change if desired).
    setDeviceStatus(devicestatus);
    setHasLocation(haslocation);
    setInstanceName(instancename);
    setTimestamp(timestamp);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>CentralHeating</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public CentralHeating(CentralHeating proto) {
    setDeviceStatus(proto.getDeviceStatus());
    setHasLocation(proto.getHasLocation());
    setInstanceName(proto.getInstanceName());
    setTimestamp(proto.getTimestamp());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>CentralHeating</code>.
   *  @return The string representation.
   */
  public String toString() {
    return "CentralHeating("
         + "devicestatus="+getDeviceStatus()
         + ", haslocation="+getHasLocation()
         + ", instancename="+getInstanceName()
         + ", timestamp="+getTimestamp()
         + ")";
  }
  
  /** 
   *  Get a clone of this <code>CentralHeating</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new CentralHeating(this);
  }
  
  /** 
   *  Test the equality of this <code>CentralHeating</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>CentralHeating</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof CentralHeating) {
      CentralHeating cmp=(CentralHeating)obj;
      if (getDeviceStatus()!=cmp.getDeviceStatus() &&
           (getDeviceStatus()==null || !getDeviceStatus().equals(cmp.getDeviceStatus()))
          ) return false;
      if (getHasLocation()!=cmp.getHasLocation() &&
           (getHasLocation()==null || !getHasLocation().equals(cmp.getHasLocation()))
          ) return false;
      if (getInstanceName()!=cmp.getInstanceName() &&
           (getInstanceName()==null || !getInstanceName().equals(cmp.getInstanceName()))
          ) return false;
      if (getTimestamp()!=cmp.getTimestamp() &&
           (getTimestamp()==null || !getTimestamp().equals(cmp.getTimestamp()))
          ) return false;
      return true;
    }
    return false;
  }
}

