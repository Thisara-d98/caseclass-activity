package caseclasspack4

object problem04 {
  def main(args:Array[String]) {
    val p1=Point(3,6);
    val p2=p1.Invert();
    println(p2);
  }
}

case class Point(a:Int,b:Int) {
  def x:Int=a;
  def y:Int=b;
  
  def Invert() = Point(this.y,this.x);
}