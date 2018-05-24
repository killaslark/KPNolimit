import java.io.{FileNotFoundException, IOException}
import scala.io.Source


object File extends App {
  def readFIle(filename: String, filepath: String): String = {
    try {
//      val fileContents = Source.fromFile(filename).getLines.mkString
      val fileContent = Source.fromFile(filepath+filename).getLines.toList
      var fileContets = ""
      for {content <- fileContent} fileContets += content.toString + "\n"

      return fileContets

    } catch {
      case e: FileNotFoundException => "File tidak ditemukan"
      case e: IOException => "Ada IOException"
    }
  }

  val filepath = "src/main/scala/"
  print("Tuliskan nama file yang akan dicari : ")
  val filename = scala.io.StdIn.readLine()
  print(readFIle(filename,filepath))


}
