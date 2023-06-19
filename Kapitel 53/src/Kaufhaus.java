public class Kaufhaus
{

  public static void main ( String[] args )
  {
    Waren         waren        = new Waren( "Tube", 1.40, 2 );
    Lebensmittel  lebensmittel = new Lebensmittel ( "Milch", 0.95, 690, 4 );
    Spielwaren    spiel        = new Spielwaren  ( "Lego", 24.45, 8 );
    Buecher       buch         = new Buecher ( "Emma", 14.95, "Austin", 3 );

    waren.anzeigen();

    lebensmittel.anzeigen();

    spiel.anzeigen();
    System.out.println
      ("Die Steuer betraegt: " + spiel.berechneSteuer(5.6) + "\n" );

    buch.anzeigen();
    System.out.println
      ("Die Steuer betraegt: " + buch.berechneSteuer(3.4) + "\n" );
  }
}