/*
 * ChairData.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package smarthouse.ontology.beanynizer;



/**
 *  Java class for concept Chair of SmartHouseOntology ontology.
 */
public abstract class ChairData	extends Furniture implements nuggets.INugget
{
	//-------- constants ----------

	//-------- attributes ----------

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>Chair</code>.
	 */
	public ChairData()  { //
	}

	//-------- accessor methods --------

	//-------- object methods --------

	/**
	 *  Get a string representation of this Chair.
	 *  @return The string representation.
	 */
	public String toString() {
		return "Chair("
		+ "haslocation="+getHasLocation()
		+ ", instancename="+getInstanceName()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this Chair using the nuggets utility.
	 * @param c 
	 */
	public void _persist(nuggets.ICruncher c) {
		// declare references
		int idHasLocation = c.declare(haslocation);
		// persist the nugget
		c.startConcept(this);
		if (idHasLocation>0) 
			c.put("haslocation", idHasLocation);
		if (instancename!=null) 
			c.put("instancename", instancename);
	}
	
	/**
	 * Restore this Chair 
	 * @param a the name of the attribute
	 * @param v the value of the attribute
	 */
	public void _set(String a, Object v) { //
		switch(hash(a)) {
		case 0: haslocation =  (Location)v; return;
		case 1: instancename =  (String)v; return;
		}                        
	}
	
private static final int hash(String name) {
   return ((2146599590*name.charAt(0))>>>15)%2;
}

}