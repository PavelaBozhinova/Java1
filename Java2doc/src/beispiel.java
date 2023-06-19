
public class beispiel
{
public static void main(String args[])
{
dackel Waldi = new dackel();
dackel hundi = new dackel();

Waldi.bellen();
Waldi.setAlter(4);
System.out.println(Waldi.getAlter());
Waldi.laufen();
Waldi.schulterhoehe=46;
System.out.println(Waldi.schulterhoehe);

hundi.bellen();
hundi.Alter=10;
System.out.println(hundi.Alter);
hundi.laufen();
hundi.schulterhoehe=28;
System.out.println(hundi.schulterhoehe);

dackel Nori = new dackel();
dackel katzi = new dackel();

Nori.bellen();
Nori.setAlter(5);
System.out.println(Nori.getAlter());
Nori.laufen();
Nori.schulterhoehe=45;
System.out.println(katzi.schulterhoehe);


katzi.bellen();
katzi.Alter=7;
System.out.println(katzi.Alter);
katzi.laufen();
katzi.schulterhoehe=19;
System.out.println(katzi.schulterhoehe);
}}
