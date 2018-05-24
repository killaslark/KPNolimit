import org.scalatest.{ FlatSpec, Matchers, WordSpec}

class ParsedWebTestwithFlatSpec extends FlatSpec with Matchers{

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

class ParsedWebTestWithWordSpec extends WordSpec with Matchers{

  val parsedWeb = new ParsedWeb("https://www.liputan6.com/bisnis/read/3537205/bandara-kertajati-bakal-jadi-bandara-terbaik-ke-2-di-ri?medium=Headline&campaign=Headline_click_1")

  "Content Title " when {
    "WITH INPUT = https://www.liputan6.com/bisnis/read/3537205/bandara-kertajati-bakal-jadi-bandara-terbaik-ke-2-di-ri?medium=Headline&campaign=Headline_click_1 " should {
      "GENERATE OUTPUT = Bandara Kertajati Bakal Jadi Bandara Terbaik ke-2 di RI - Bisnis Liputan6.com" in {
        assert(parsedWeb.getTitle == "Bandara Kertajati Bakal Jadi Bandara Terbaik ke-2 di RI - Bisnis Liputan6.com")
      }
    }
  }

  "Content Date time " when {
    "WITH INPUT = https://www.liputan6.com/bisnis/read/3537205/bandara-kertajati-bakal-jadi-bandara-terbaik-ke-2-di-ri?medium=Headline&campaign=Headline_click_1 " should {
      "GENERATE OUTPUT = 24 Mei 2018, 13:04 WIB" in {
        assert(parsedWeb.getDate == "24 Mei 2018, 13:04 WIB")
      }
    }
  }

  "Content Author Name " when {
    "WITH INPUT = https://www.liputan6.com/bisnis/read/3537205/bandara-kertajati-bakal-jadi-bandara-terbaik-ke-2-di-ri?medium=Headline&campaign=Headline_click_1 " should {
      "GENERATE OUTPUT = Ilyas Istianur Praditya" in {
        assert(parsedWeb.getAuthor == "Ilyas Istianur Praditya")
      }
    }
  }

  "Part of the Content " when {
    "WITH INPUT = https://www.liputan6.com/bisnis/read/3537205/bandara-kertajati-bakal-jadi-bandara-terbaik-ke-2-di-ri?medium=Headline&campaign=Headline_click_1 " should {
      "CONSIST OUTPUT = Liputan6.com, Majalengka - Bandara Internasional Jawa Barat (BIJB) Kertajati siap melayani penerbangan pesawat dan penumpang. Rencananya" in {
        assert(parsedWeb.getContent contains  "Liputan6.com, Majalengka - Bandara Internasional Jawa Barat (BIJB) Kertajati siap melayani penerbangan pesawat dan penumpang. Rencananya")
      }
    }
  }

}
