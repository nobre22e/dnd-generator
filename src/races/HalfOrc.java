package races;

public class HalfOrc extends Race{

	public HalfOrc() {
		// TODO Auto-generated constructor stub
		super.abilityInc.put(STR, 2);
		super.abilityInc.put(CON, 1);
		
		super.size = MED;
		
		super.speed = 30;
		
		super.languages.add("Common");
		super.languages.add("Orc");
		
		super.hasDarkvision = true;
		
		super.raceName = "Half-Orc";
	}

}
