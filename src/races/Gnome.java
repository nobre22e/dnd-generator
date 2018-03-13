package races;
public class Gnome extends Race {

	public Gnome() {
		// TODO Auto-generated constructor stub
		super.abilityInc.put(INT, 2);
		
		super.size = SM;
		
		super.speed = 25;
		
		super.languages.add("Common");
		super.languages.add("Gnomish");
		
		super.hasDarkvision = true;
		
		super.raceName = "Gnome";
	}

}
