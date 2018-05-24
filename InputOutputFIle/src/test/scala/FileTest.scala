import org.scalatest.FlatSpec

class ParsedWebTest extends FlatSpec {
  val filepath = "src/main/scala/"
  val filename = "data.txt"

  "Isi File Eksternal " should "be Halooo" in {
    assert(File.readFIle(filename,filepath) == "Halooo\n\nNama Saya Bobby\n")
  }
}