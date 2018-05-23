import net.ruippeixotog.scalascraper.browser.{HtmlUnitBrowser, JsoupBrowser}
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import play.api.libs.json.{ JsNull, Json, JsString, JsValue }


object Main extends App {
//  print("Masukkan Link berita yang akan dicari : ")
//  val pageNewsUrl = scala.io.StdIn.readLine()

  //fetch the HTML
  val browser = JsoupBrowser()
  val doc = browser.get("https://www.liputan6.com/news/read/3481953/pan-sepakat-wacana-sby-lahirkan-pemimpin-baru-di-pilpres")

  // fetch author, title and content
  var author = (doc >> texts("div span a span")).last
  var title = (doc >> text("title"))
  var date = doc >> text("time")
  var content = doc >> texts(".article-content-body__item-content > p")

  //Generate Simple Json object for the Content from HTML
  val jsonObject: JsValue = Json.obj(
    "Author" -> author,
    "Title" -> title,
    "date" -> date,
    "Content" -> content,
  )


  //printing all items from html
  println("Author Name : " + author)
  println("Title : " + title)
  println("Tanggal : " + date)
  println("Content : ")
  for {headline <- content} println(headline)



}