public class beispiel1
{
public static void main(String args[])
{
 dackel Waldi = new dackel();
 dackel.moreDackel();
 dackel hundi = new dackel();
 dackel.moreDackel();
 Waldi.bellen();
 Waldi.Name="Waldi";
 Waldi.fressen();
 Waldi.setAlter(4);
 System.out.println(Waldi.getAlter());

 
 hundi.bellen();
 hundi.Alter=10;
 hundi.Name= "Hundi";
 hundi.fressen();
 System.out.println(hundi.Name);
 System.out.println(hundi.Alter);
 System.out.println(dackel.anzahl);
 

 
 
}
}
