import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import play.api.libs.json.{JsValue, Json}
import java.io.File
import java.io.PrintWriter

class ParsedWeb(val pageNewsUrl : String) {
  val browser = JsoupBrowser()
  val doc = browser.get(pageNewsUrl)

  def getTitle : String = {
    val title = (doc >> text("title")) // for liputan 6
    //  var title = (doc >> text(".read__title")) // for nasional kompas
    //  var title = (doc >> text(".jdl h1")) //for detik news
    return title
  }

  def getAuthor : String = {
    var author = (doc >> texts("div span a span")).last // for liputan 6
    //  var author = (doc >> text(".read__author a")) //for nasional kompas
    //  var author = (doc >> text(".author")) //for nasional detik news
    return author
  }

//  def getEditor : String = {
//    var editor = (doc >> text("#editor a")) // for nasional kompas
//    return editor
//  }

  def getDate : String = {
    var date = doc >> text("time") // for liputan 6
    //  var date = doc >> text(".read__time") // for nasional kompas
    //  var date = doc >> text(".date") // for detik news
    return date
  }

  def getContent : String = {
    var content = doc >> texts(".article-content-body__item-content > p") //for liputan 6
    content = content.dropRight(1) //delete unused content from doc for liputan 6
    //  var content = doc >> texts(".read__content > p") // for nasional kompas
    //  var content = doc >> texts(".detail_text") // for detik news

    //generate content with endline
    var contentWithSpace : String = ""
    for {headline <- content} contentWithSpace += headline.toString + "\n"
    return contentWithSpace
  }

  def getJsonObject :JsValue = {
      val jsonObject: JsValue = Json.obj(
        "Author" -> getAuthor,
        // "Editor" -> editor,  //if exist
        "Title" -> getTitle,
        "Date" -> getDate,
        "Content" -> getContent,
      )
    return jsonObject
  }

  def printJsonObject : Unit = {
      val writer = new PrintWriter(new File("jsonObject.json"))
      writer.write(getJsonObject.toString)
      writer.close()
  }

}