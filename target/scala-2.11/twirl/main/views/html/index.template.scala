
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("hello world!")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

"""),_display_(/*5.2*/message),format.raw/*5.9*/("""

""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Sep 03 23:57:14 BST 2015
                  SOURCE: /Users/andyatkinson/orange-bus-form/app/views/index.scala.html
                  HASH: 9a57ab977f340ff44427fc01c53b71c2fe4a141e
                  MATRIX: 527->1|639->18|667->21|695->41|734->43|762->46|788->53|820->56
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|29->5|31->7
                  -- GENERATED --
              */
          