import net.ruippeixotog.scalascraper.browser.{HtmlUnitBrowser, JsoupBrowser}
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import play.api.libs.json.{ JsNull, Json, JsString, JsValue }


object Main extends App {
  //Input Web Url From User

  print("Masukkan Link berita yang akan dicari : ")
  val pageNewsUrl = scala.io.StdIn.readLine()

  //fetch the HTML to Doc
  val browser = JsoupBrowser()
  val doc = browser.get(pageNewsUrl)

  // Fetch author, title, date and content from doc
  //author
  var author = (doc >> texts("div span a span")).last

  //title
  var title = (doc >> text("title"))

  //date
  var date = doc >> text("time")

  //content
  var content = doc >> texts(".article-content-body__item-content > p")
  content = content.dropRight(1) //delete unused content from doc

  //generate content with endline
  var contentWithSpace : String = ""
  for {headline <- content} contentWithSpace += headline.toString + "\n"

  //Generate Simple Json object for the Content from HTML
  val jsonObject: JsValue = Json.obj(
    "Author" -> author,
    "Title" -> title,
    "date" -> date,
    "Content" -> contentWithSpace,
  )

  //Print all items from html
  println("Author Name : " + author)
  println("Title : " + title)
  println("Tanggal : " + date)
  println("Content : " + "\n" + contentWithSpace)

  //Print jsonObject
//  println(jsonObject)


}