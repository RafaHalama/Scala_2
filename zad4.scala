
object Homework {
  
def funkcja(x:Int):Int={
    x *  10
}
  
  
def doThrice(x:Int, f:Int => Int): Int= {
    f(f(f(x)))
    
}  
  
  def main(args: Array[String]): Unit = {
   println(doThrice(10,funkcja))
 
  }
}