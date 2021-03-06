/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of Wall.
 * Feel free to change.
 *
 */
package smarthouse.ontology.beanynizer;


/**
 *  Editable Java class for concept <code>Wall</code> of SmartHouseOntology ontology.
 */
public class Wall  extends WallData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>Wall</code>.
   */
  public Wall() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>Wall</code>.
   * @param instancename    
   */
  public Wall(String instancename) {
    // Constructor using required slots (change if desired).
    setInstanceName(instancename);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>Wall</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public Wall(Wall proto) {
    setInstanceName(proto.getInstanceName());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>Wall</code>.
   *  @return The string representation.
   */
  public String toString() {
    return "Wall("
         + "instancename="+getInstanceName()
         + ")";
  }
  
  /** 
   *  Get a clone of this <code>Wall</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new Wall(this);
  }
  
  /** 
   *  Test the equality of this <code>Wall</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>Wall</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof Wall) {
      Wall cmp=(Wall)obj;
      if (getInstanceName()!=cmp.getInstanceName() &&
           (getInstanceName()==null || !getInstanceName().equals(cmp.getInstanceName()))
          ) return false;
      return true;
    }
    return false;
  }
}

