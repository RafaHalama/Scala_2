

object Homework {
  
  class Osoba5(private var _imie:String, private var _nazwisko:String, private var _podatek:Double = 0){
  def imie: String = _imie
  def nazwisko: String = _nazwisko
  def podatek: Double = _podatek
  }

  trait Pracownik extends Osoba5{
      protected var _pensja:Double = 0.0
      def pensja = _pensja
      def pensja_= (value:Double): Unit =
      {
          _pensja = value
      }
          
      override def podatek:Double = _pensja *0.2
  } 
  
    trait Student extends Osoba5{
      override def podatek:Double = 0
  } 
  
  
  trait Nauczyciel extends Pracownik {
      override def podatek:Double = _pensja *0.1
  }
  
  
  def main(args: Array[String]): Unit = {
    var pracownik = new Osoba5("Jan", "Nowak") with Pracownik
    pracownik.pensja = 5000
    println(pracownik.podatek)
    
     var student = new Osoba5("Rafał", "Halama") with Student
    println(student.podatek)
    
     var nauczyciel = new Osoba5("Adam", "M") with Nauczyciel
    nauczyciel.pensja = 5000
    println(nauczyciel.podatek)
    
     var studprac = new Osoba5("a", "b") with Student with Pracownik
    studprac.pensja = 5000
    println(studprac.podatek)
     var pracstud = new Osoba5("x", "y") with Pracownik with Student
    pracstud.pensja = 5000
    println(pracstud.podatek)
  }
}