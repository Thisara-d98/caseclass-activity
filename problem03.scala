package caseclasspack3
import scala.math.sqrt
object problem03 {
  def main(args:Array[String]){
    val p1=Point(1,4);
    val p2=Point(4,6);
    println(p2.distance(p1))
  }
}

case class Point(a:Int,b:Int){
   def x:Int=a;
   def y:Int=b;
   
   def distance(that:Point) =sqrt( (this.x - that.x)*(this.x-that.x) + (this.y-that.y)*(this.y-that.y))
     
  
}