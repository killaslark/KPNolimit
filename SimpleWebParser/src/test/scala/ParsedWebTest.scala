import org.scalatest.FlatSpec

class ParsedWebTest extends FlatSpec {

  val parsedWeb = new ParsedWeb("https://www.liputan6.com/bisnis/read/3537205/bandara-kertajati-bakal-jadi-bandara-terbaik-ke-2-di-ri?medium=Headline&campaign=Headline_click_1")
  "Content Title " should "be Bandara Kertajati Bakal Jadi Bandara Terbaik ke-2 di RI - Bisnis Liputan6.com" in {
    assert(parsedWeb.getTitle == "Bandara Kertajati Bakal Jadi Bandara Terbaik ke-2 di RI - Bisnis Liputan6.com")
  }

  "Content Date time " should "be 24 Mei 2018, 13:04 WIB" in {
    assert(parsedWeb.getDate == "24 Mei 2018, 13:04 WIB")
  }

  "Content Author Name " should "be Ilyas Istianur Praditya" in {
    assert(parsedWeb.getAuthor == "Ilyas Istianur Praditya")
  }

  "Part of the Content " should "be Liputan6.com, Majalengka - Bandara Internasional Jawa Barat (BIJB) Kertajati siap melayani penerbangan pesawat dan penumpang. Rencananya" in {
    assert(parsedWeb.getContent contains  "Liputan6.com, Majalengka - Bandara Internasional Jawa Barat (BIJB) Kertajati siap melayani penerbangan pesawat dan penumpang. Rencananya")
  }

}
