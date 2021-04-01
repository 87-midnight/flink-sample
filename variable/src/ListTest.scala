object ListTest {
  def main(args: Array[String]): Unit = {
    val x:Array[Int] = new Array[Int](2);
    x(0)= 22;
    x(1) =32;
    for (y<-x){
      println(y)
    }
  }
}
