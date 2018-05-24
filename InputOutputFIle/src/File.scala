import java.io.{FileNotFoundException, IOException}

import scala.io.Source

object Hello extends App {
  def addInt(a:Int, b:Int) : Int = {
    var sum = 0

    sum = a + b
    return sum
  }

}

object File extends App {
  def readFIle(filename: String, filepath: String): List[String] = {
    try {
//      val fileContents = Source.fromFile(filename).getLines.mkString
      val fileContents = Source.fromFile(filepath+filename).getLines.toList
      fileContents
    } catch {
      case e: FileNotFoundException => List[String]("File tidak ditemukan")
      case e: IOException => List[String]("Ada IOException")
    }
  }

  val filepath = "src\\"
  print("Tuliskan nama file yang akan dicari : ")
  val filename = scala.io.StdIn.readLine()
  readFIle(filename,filepath).foreach{
    println
  }


}
