object Homework {
  
class KontoBankowe(private var _stanKonta: Double) {
 def stanKonta:Double = _stanKonta
  
  def this()={
    this(0.0)
  }
    
  
  def wplata(x:Double):Unit={
    if(x>0)
    _stanKonta += x
    else
    println("blad")
  }
  
  def wyplata(x:Double):Unit={
    if(x > 0 && stanKonta > x)
    _stanKonta -= x
    else
    println("blad")
  }
  
}
  
  def main(args: Array[String]): Unit = {
  val bank = new KontoBankowe()
    println(bank.stanKonta)
    bank.wplata(-80.0)
    bank.wplata(80.0)
    println(bank.stanKonta)
    bank.wyplata(60.0)
    println(bank.stanKonta)
    bank.wyplata(60.0)

    
    val bank2 = new KontoBankowe(500.0)
    println(bank2.stanKonta)
  }
}