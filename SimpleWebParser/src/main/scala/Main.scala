import net.ruippeixotog.scalascraper.browser.{JsoupBrowser}
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import play.api.libs.json.{ Json, JsValue }


object Main extends App {
  //Input Web Url From User

  print("Masukkan Link berita yang akan dicari : ")
  val pageNewsUrl = scala.io.StdIn.readLine()

  //fetch the HTML to Doc
  val browser = JsoupBrowser()
  val doc = browser.get(pageNewsUrl)

  // Fetch author, title, date and content from doc

  //Author
  var author = (doc >> texts("div span a span")).last // for liputan 6
//  var author = (doc >> text(".read__author a")) //for nasional kompas
//  var author = (doc >> text(".author")) //for nasional detik news

  //Editor
//  var editor = (doc >> text("#editor a")) // for nasional kompas


  //title
  var title = (doc >> text("title")) // for liputan 6
//  var title = (doc >> text(".read__title")) // for nasional kompas
//  var title = (doc >> text(".jdl h1")) //for detik news

  //date
  var date = doc >> text("time") // for liputan 6
//  var date = doc >> text(".read__time") // for nasional kompas
//  var date = doc >> text(".date") // for detik news


  //content
  var content = doc >> texts(".article-content-body__item-content > p") //for liputan 6
  content = content.dropRight(1) //delete unused content from doc for liputan 6
//  var content = doc >> texts(".read__content > p") // for nasional kompas
//  var content = doc >> texts(".detail_text") // for detik news

  //generate content with endline
  var contentWithSpace : String = ""
  for {headline <- content} contentWithSpace += headline.toString + "\n"

  //Generate Simple Json object for the Content from HTML
  val jsonObject: JsValue = Json.obj(
    "Author" -> author,
    // "Editor" -> editor,  //if exist
    "Title" -> title,
    "date" -> date,
    "Content" -> contentWithSpace,

  )

  //Print all items from html
  println("Author Name : " + author)
//  println("Editor Name : " + editor) // if exist
  println("Title : " + title)
  println("Tanggal : " + date)
  println("Content : " + "\n" + contentWithSpace)


  //Print jsonObject
//  println(jsonObject)


}