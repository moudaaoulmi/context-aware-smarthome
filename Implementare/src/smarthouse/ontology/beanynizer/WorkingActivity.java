/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of WorkingActivity.
 * Feel free to change.
 *
 */
package smarthouse.ontology.beanynizer;


/**
 *  Editable Java class for concept <code>WorkingActivity</code> of SmartHouseOntology ontology.
 */
public class WorkingActivity  extends WorkingActivityData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>WorkingActivity</code>.
   */
  public WorkingActivity() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>WorkingActivity</code>.
   * @param haslocation    
   * @param instancename    
   */
  public WorkingActivity(Location haslocation, String instancename) {
    // Constructor using required slots (change if desired).
    setHasLocation(haslocation);
    setInstanceName(instancename);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>WorkingActivity</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public WorkingActivity(WorkingActivity proto) {
    setHasLocation(proto.getHasLocation());
    setInstanceName(proto.getInstanceName());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>WorkingActivity</code>.
   *  @return The string representation.
   */
  public String toString() {
    return "WorkingActivity("
         + "haslocation="+getHasLocation()
         + ", instancename="+getInstanceName()
         + ")";
  }
  
  /** 
   *  Get a clone of this <code>WorkingActivity</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new WorkingActivity(this);
  }
  
  /** 
   *  Test the equality of this <code>WorkingActivity</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>WorkingActivity</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof WorkingActivity) {
      WorkingActivity cmp=(WorkingActivity)obj;
      if (getHasLocation()!=cmp.getHasLocation() &&
           (getHasLocation()==null || !getHasLocation().equals(cmp.getHasLocation()))
          ) return false;
      if (getInstanceName()!=cmp.getInstanceName() &&
           (getInstanceName()==null || !getInstanceName().equals(cmp.getInstanceName()))
          ) return false;
      return true;
    }
    return false;
  }
}

