object Main extends App {

    print("Masukkan Link berita yang akan dicari : ")
    val pageNewsUrl = scala.io.StdIn.readLine()
    val parsedWeb = new ParsedWeb(pageNewsUrl)

  //Print Parsed Web
    println(parsedWeb.getTitle)
    println(parsedWeb.getDate)
    println(parsedWeb.getAuthor)
    println(parsedWeb.getContent)
//    println(parsedWeb.getEditor)


}