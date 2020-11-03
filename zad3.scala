object Homework {
  
case class Osoba2(var imie:String, var nazwisko:String) {

}
  
    def przywitaj(osoba:Osoba2):String = osoba match{
    case Osoba2("Rafal", _) => "Witaj Rafale"
    case Osoba2(_, "Nowak") => "Dzien dobry Nowak"
    case Osoba2(_,_) => "Witaj nieznajomy"
  }
  
  
  def main(args: Array[String]): Unit = {
 
    var osoba1 = new Osoba2("Rafal", "Halama")
    var osoba2 = new Osoba2("Jan", "Nowak")
    var osoba3 = new Osoba2("Gandalf", "Szary")

    println(przywitaj(osoba1))
    println(przywitaj(osoba2))
    println(przywitaj(osoba3))
  }
}