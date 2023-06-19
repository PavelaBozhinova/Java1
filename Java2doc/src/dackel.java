
public class dackel
{
//Instanzvariablen

	int Alter;
	int schulterhoehe;
	static int anzahl;
	String Name;

//Instanzmethoden
	public void bellen()
	{
		System.out.println("WauWau!\n");
	}
	
	public void laufen()
	{
		System.out.println("Der dackel läuft geradeaus.\n");
	}
	
	
	public int getAlter()
	{
		return this.Alter;
	}
	public void setAlter(int x)
	{
		this.Alter = x;
	}
public int getschulterhoehe()
{
return this.schulterhoehe;
}
public void setschulterhoehe(int x)
{
 this.schulterhoehe = x;
}

//Klassenmethoden
static void moreDackel()
{
dackel.anzahl = dackel.anzahl + 1;
}
public void fressen()
{
	System.out.println
	(Name + " frisst seinen Napf leer.\n");
}
public String getName(String string) {
	return this.Name;
}
//Konstruktor
	 public dackel()
	{
	System.out.println("Geburt eines Dackels!\n");
	dackel.anzahl=dackel.anzahl+1;
	this.Alter=1;
	}
	//Destruktor
	protected void finalize()
	{
	dackel.anzahl=dackel.anzahl-1;
	}
	
	 

}


