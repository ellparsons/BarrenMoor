package barrenMoor;

public class BarrenMoor {

	//////////// Attributes//////////////

	protected String description;
	protected String compassDirection;
	protected int northLocation;
	protected int eastLocation;
	protected int southLocation;
	protected int westLocation;

	/////////// Constructors/////////////

	public BarrenMoor(String vDescription, String vCompassDirection, int vNorthLocation, int vEastLocation, int vSouthLocation, int vWestLocation) 
	{
		this.description = vDescription;
		this.compassDirection = vCompassDirection;
		this.northLocation = vNorthLocation;
	    this.eastLocation = vEastLocation;
	    this.southLocation = vSouthLocation;
	    this.westLocation = vWestLocation;
	}

	////////////// Methods//////////////
	
	
}
