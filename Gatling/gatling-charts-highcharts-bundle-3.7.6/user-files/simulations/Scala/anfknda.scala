
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class anfknda extends Simulation {

  private val httpProtocol = http
    .baseUrl("http://automationpractice.com")
    .inferHtmlResources(AllowList(), DenyList())
  
  private val headers_0 = Map(
  		"Accept" -> "application/json, text/javascript, */*; q=0.01",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
  		"User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36",
  		"X-Requested-With" -> "XMLHttpRequest"
  )
  
  private val headers_2 = Map("User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36")
  
  private val headers_35 = Map(
  		"Origin" -> "http://automationpractice.com",
  		"User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_53 = Map(
  		"Accept" -> "text/css,*/*;q=0.1",
  		"User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_54 = Map(
  		"Accept" -> "text/css,*/*;q=0.1",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
  		"User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_56 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
  		"Upgrade-Insecure-Requests" -> "1",
  		"User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_57 = Map(
  		"Accept" -> "*/*",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
  		"User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_65 = Map(
  		"Origin" -> "http://automationpractice.com",
  		"User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36",
  		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="98", "Google Chrome";v="98""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Linux"
  )
  
  private val headers_66 = Map(
  		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
  		"User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_73 = Map(
  		"Accept" -> "application/json, text/javascript, */*; q=0.01",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
  		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
  		"Origin" -> "http://automationpractice.com",
  		"User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36",
  		"X-Requested-With" -> "XMLHttpRequest"
  )
  
  private val uri2 = "https://fonts.gstatic.com/s/opensans/v28/memvYaGs126MiZpBA-UvWbX2vVnXBbObj2OVTS-muw.woff2"
  
  private val uri3 = "http://fonts.googleapis.com/css"

  private val scn = scenario("anfknda")
    .exec(
      http("request_0")
        .get("/index.php?controller=search&q=dress&limit=10&timestamp=1646668405243&ajaxSearch=1&id_lang=1")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get("/index.php?controller=search&q=dress&limit=10&timestamp=1646668406503&ajaxSearch=1&id_lang=1")
            .headers(headers_0)
        )
    )
    .pause(2)
    .exec(
      http("request_2")
        .get("/js/jquery/jquery-1.11.0.min.js")
        .headers(headers_2)
        .resources(
          http("request_3")
            .get("/js/jquery/jquery-migrate-1.2.1.min.js")
            .headers(headers_2),
          http("request_4")
            .get("/js/jquery/plugins/jquery.easing.js")
            .headers(headers_2),
          http("request_5")
            .get("/js/tools.js")
            .headers(headers_2),
          http("request_6")
            .get("/themes/default-bootstrap/js/global.js")
            .headers(headers_2),
          http("request_7")
            .get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js")
            .headers(headers_2),
          http("request_8")
            .get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js")
            .headers(headers_2),
          http("request_9")
            .get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js")
            .headers(headers_2),
          http("request_10")
            .get("/js/jquery/plugins/fancybox/jquery.fancybox.js")
            .headers(headers_2),
          http("request_11")
            .get("/themes/default-bootstrap/js/products-comparison.js")
            .headers(headers_2),
          http("request_12")
            .get("/themes/default-bootstrap/css/global.css"),
          http("request_13")
            .get("/themes/default-bootstrap/css/autoload/highdpi.css"),
          http("request_14")
            .get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
          http("request_15")
            .get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
          http("request_16")
            .get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
          http("request_17")
            .get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
          http("request_18")
            .get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
          http("request_19")
            .get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
          http("request_20")
            .get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
          http("request_21")
            .get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
          http("request_22")
            .get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
          http("request_23")
            .get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
          http("request_24")
            .get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
          http("request_25")
            .get("/themes/default-bootstrap/css/product_list.css"),
          http("request_26")
            .get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
          http("request_27")
            .get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
          http("request_28")
            .get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
          http("request_29")
            .get("/modules/themeconfigurator/css/hooks.css"),
          http("request_30")
            .get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
          http("request_31")
            .get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
          http("request_32")
            .get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
          http("request_33")
            .get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
          http("request_34")
            .get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
          http("request_35")
            .get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
            .headers(headers_35),
          http("request_36")
            .get("/js/jquery/plugins/jquery.scrollTo.js")
            .headers(headers_2),
          http("request_37")
            .get("/js/jquery/plugins/jquery.serialScroll.js")
            .headers(headers_2),
          http("request_38")
            .get("/js/jquery/plugins/bxslider/jquery.bxslider.js")
            .headers(headers_2),
          http("request_39")
            .get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js")
            .headers(headers_2),
          http("request_40")
            .get("/themes/default-bootstrap/js/tools/treeManagement.js")
            .headers(headers_2),
          http("request_41")
            .get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js")
            .headers(headers_2),
          http("request_42")
            .get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js")
            .headers(headers_2),
          http("request_43")
            .get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js")
            .headers(headers_2),
          http("request_44")
            .get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js")
            .headers(headers_2),
          http("request_45")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js")
            .headers(headers_2),
          http("request_46")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js")
            .headers(headers_2),
          http("request_47")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js")
            .headers(headers_2),
          http("request_48")
            .get("/modules/blockbanner/img/sale70.png")
            .headers(headers_2),
          http("request_49")
            .get("/img/logo.jpg")
            .headers(headers_2),
          http("request_50")
            .get("/img/c/3-0_thumb.jpg")
            .headers(headers_2),
          http("request_51")
            .get("/img/c/3-1_thumb.jpg")
            .headers(headers_2),
          http("request_52")
            .get("/img/p/7/7-home_default.jpg")
            .headers(headers_2),
          http("request_53")
            .get(uri3 + "?family=Open+Sans:300,600&subset=latin,latin-ext")
            .headers(headers_53),
          http("request_54")
            .get("/modules/socialsharing/css/socialsharing.css")
            .headers(headers_54),
          http("request_55")
            .get("/modules/sendtoafriend/sendtoafriend.css")
            .headers(headers_54),
          http("request_56")
            .get("/index.php?id_product=2&controller=product")
            .headers(headers_56),
          http("request_57")
            .get("/js/jquery/plugins/jquery.idTabs.js")
            .headers(headers_57),
          http("request_58")
            .get("/modules/socialsharing/js/socialsharing.js")
            .headers(headers_57),
          http("request_59")
            .get("/modules/productcomments/js/jquery.rating.pack.js")
            .headers(headers_57),
          http("request_60")
            .get("/themes/default-bootstrap/js/modules/sendtoafriend/sendtoafriend.js")
            .headers(headers_57),
          http("request_61")
            .get("/modules/productcomments/js/jquery.textareaCounter.plugin.js")
            .headers(headers_57),
          http("request_62")
            .get("/themes/default-bootstrap/css/product.css")
            .headers(headers_54),
          http("request_63")
            .get("/themes/default-bootstrap/js/modules/productcomments/js/productcomments.js")
            .headers(headers_57),
          http("request_64")
            .get("/themes/default-bootstrap/js/product.js")
            .headers(headers_57),
          http("request_65")
            .get(uri2)
            .headers(headers_65),
          http("request_66")
            .get("/img/p/5/5-cart_default.jpg")
            .headers(headers_66),
          http("request_67")
            .get("/img/p/7/7-medium_default.jpg")
            .headers(headers_66),
          http("request_68")
            .get("/img/p/7/7-cart_default.jpg")
            .headers(headers_66),
          http("request_69")
            .get("/img/p/6/6-cart_default.jpg")
            .headers(headers_66),
          http("request_70")
            .get("/themes/default-bootstrap/css/print.css")
            .headers(headers_54),
          http("request_71")
            .get("/img/p/7/7-large_default.jpg")
            .headers(headers_66),
          http("request_72")
            .get("/themes/default-bootstrap/img/jquery/uniform/sprite.png")
        )
    )
    .pause(5)
    .exec(
      http("request_73")
        .post("/index.php?rand=1646668419703")
        .headers(headers_73)
        .formParam("controller", "cart")
        .formParam("add", "1")
        .formParam("ajax", "true")
        .formParam("qty", "1")
        .formParam("id_product", "2")
        .formParam("token", "e817bb0705dd58da8db074c69f729fd8")
        .formParam("ipa", "7")
        .resources(
          http("request_74")
            .get("/themes/default-bootstrap/img/bg_bt.gif")
            .headers(headers_2)
        )
    )
    .pause(4)
    .exec(
      http("request_75")
        .get("/themes/default-bootstrap/css/global.css")
        .headers(headers_2)
        .resources(
          http("request_76")
            .get("/themes/default-bootstrap/css/autoload/highdpi.css")
            .headers(headers_2),
          http("request_77")
            .get("/themes/default-bootstrap/css/autoload/responsive-tables.css")
            .headers(headers_2),
          http("request_78")
            .get("/themes/default-bootstrap/css/autoload/uniform.default.css")
            .headers(headers_2),
          http("request_79")
            .get("/js/jquery/plugins/fancybox/jquery.fancybox.css")
            .headers(headers_2),
          http("request_80")
            .get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css")
            .headers(headers_2),
          http("request_81")
            .get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css")
            .headers(headers_2),
          http("request_82")
            .get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css")
            .headers(headers_2),
          http("request_83")
            .get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css")
            .headers(headers_2),
          http("request_84")
            .get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css")
            .headers(headers_2),
          http("request_85")
            .get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css")
            .headers(headers_2),
          http("request_86")
            .get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css")
            .headers(headers_2),
          http("request_87")
            .get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css")
            .headers(headers_2),
          http("request_88")
            .get("/themes/default-bootstrap/css/product_list.css")
            .headers(headers_2),
          http("request_89")
            .get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css")
            .headers(headers_2),
          http("request_90")
            .get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css")
            .headers(headers_2),
          http("request_91")
            .get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css")
            .headers(headers_2),
          http("request_92")
            .get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css")
            .headers(headers_2),
          http("request_93")
            .get("/modules/themeconfigurator/css/hooks.css")
            .headers(headers_2),
          http("request_94")
            .get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css")
            .headers(headers_2),
          http("request_95")
            .get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css")
            .headers(headers_2),
          http("request_96")
            .get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css")
            .headers(headers_2),
          http("request_97")
            .get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css")
            .headers(headers_2),
          http("request_98")
            .get("/js/jquery/jquery-1.11.0.min.js")
            .headers(headers_2),
          http("request_99")
            .get("/js/jquery/jquery-migrate-1.2.1.min.js")
            .headers(headers_2),
          http("request_100")
            .get("/js/jquery/plugins/jquery.easing.js")
            .headers(headers_2),
          http("request_101")
            .get("/js/tools.js")
            .headers(headers_2),
          http("request_102")
            .get("/themes/default-bootstrap/js/global.js")
            .headers(headers_2),
          http("request_103")
            .get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js")
            .headers(headers_2),
          http("request_104")
            .get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js")
            .headers(headers_2),
          http("request_105")
            .get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js")
            .headers(headers_2),
          http("request_106")
            .get("/js/jquery/plugins/fancybox/jquery.fancybox.js")
            .headers(headers_2),
          http("request_107")
            .get("/themes/default-bootstrap/js/products-comparison.js")
            .headers(headers_2),
          http("request_108")
            .get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js")
            .headers(headers_2),
          http("request_109")
            .get("/js/jquery/plugins/jquery.scrollTo.js")
            .headers(headers_2),
          http("request_110")
            .get("/js/jquery/plugins/jquery.serialScroll.js")
            .headers(headers_2),
          http("request_111")
            .get("/js/jquery/plugins/bxslider/jquery.bxslider.js")
            .headers(headers_2),
          http("request_112")
            .get("/themes/default-bootstrap/js/tools/treeManagement.js")
            .headers(headers_2),
          http("request_113")
            .get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js")
            .headers(headers_2),
          http("request_114")
            .get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js")
            .headers(headers_2),
          http("request_115")
            .get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js")
            .headers(headers_2),
          http("request_116")
            .get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js")
            .headers(headers_2),
          http("request_117")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js")
            .headers(headers_2),
          http("request_118")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js")
            .headers(headers_2),
          http("request_119")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js")
            .headers(headers_2),
          http("request_120")
            .get("/modules/blockbanner/img/sale70.png")
            .headers(headers_2),
          http("request_121")
            .get("/img/logo.jpg")
            .headers(headers_2),
          http("request_122")
            .get("/img/p/7/7-cart_default.jpg")
            .headers(headers_2),
          http("request_123")
            .get(uri3 + "?family=Open+Sans:300,600&subset=latin,latin-ext")
            .headers(headers_53),
          http("request_124")
            .get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1"),
          http("request_125")
            .get("/themes/default-bootstrap/css/addresses.css")
            .headers(headers_54),
          http("request_126")
            .get("/img/c/3-0_thumb.jpg")
            .headers(headers_2),
          http("request_127")
            .get("/img/c/3-1_thumb.jpg")
            .headers(headers_2),
          http("request_128")
            .get("/index.php?controller=order")
            .headers(headers_56),
          http("request_129")
            .get("/js/jquery/plugins/jquery.typewatch.js")
            .headers(headers_57),
          http("request_130")
            .get("/img/p/7/7-small_default.jpg"),
          http("request_131")
            .get("/themes/default-bootstrap/js/cart-summary.js")
            .headers(headers_57),
          http("request_132")
            .get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1"),
          http("request_133")
            .get(uri2)
            .headers(headers_65)
        )
    )

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
