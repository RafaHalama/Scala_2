object Homework {
  
  def zad1(a:String) : String = a match {
  case "Poniedziałek" | "Wtorek" | "Środa" | "Czwartek" | "Piątek" => "Praca"
  case "Sobota" | "Niedziela" => "Weekend"
  case _ => "Nie ma takiego dnia"
  }
  
  def main(args: Array[String]): Unit = {
      println(zad1("Poniedziałek"))
       println(zad1("Wtorek"))
      println(zad1("Sobota"))
    println(zad1("Coś"))
  }
}