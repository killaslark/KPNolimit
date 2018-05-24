import org.scalatest.exceptions.TableDrivenPropertyCheckFailedException
import org.scalatest.prop.TableDrivenPropertyChecks
  import org.scalatest.{FlatSpec, Matchers, PropSpec, WordSpec}

class ParsedWebTestwithFlatSpec extends FlatSpec with Matchers  {
  val filepath = "src/main/scala/"
  val filename = "data.txt"

  "Isi File Eksternal " should "be Halooo" in {
    assert(File.readFIle(filename,filepath) == "Halooo\n\nNama Saya Bobby\n")
  }
}

class ParsedWebTestwithWordSpec extends WordSpec with Matchers  {
  val filepath = "src/main/scala/"
  val filename = "data.txt"

  "Isi File Eksternal" when {
    "WITH INPUT = data.txt" should {
      "GENERATE OUTPUT = Halooo" in {
        assert(File.readFIle(filename,filepath) == "Halooo\n\nNama Saya Bobby\n")
      }
    }
  }
}
