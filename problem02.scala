package caseclasspack2

object problem02 {
  def main(args:Array[String]){
    val p1=Point(3,5);
    val p2=p1.move(3,3);
    println(p2);
    println(p1);
    
  }
}

case class Point(a:Int,b:Int){
  def x:Int=a;
  def y:Int=b;
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy);
    
  
}