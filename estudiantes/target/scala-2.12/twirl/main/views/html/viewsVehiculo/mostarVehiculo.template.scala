
package views.html.viewsVehiculo

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object mostarVehiculo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Vehiculo,Form[Vehiculo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vehiculo: Vehiculo, formularioVehiculos : Form[Vehiculo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""
"""),_display_(/*2.2*/main("Busqueda Propietarios")/*2.31*/{_display_(Seq[Any](format.raw/*2.32*/("""
    """),format.raw/*3.5*/("""<div class="jumbotron">

            <div class="row">
                <div class="col-sm-6">
                    <p>    </p>
                    <p class="h2">Placa: """),_display_(/*8.43*/vehiculo/*8.51*/.getPlaca),format.raw/*8.60*/("""</p>
                    <p class="h2">Cedula: """),_display_(/*9.44*/vehiculo/*9.52*/.getPropietario().getCedula),format.raw/*9.79*/("""</p>
                    <p class="display-4">Marca: """),_display_(/*10.50*/vehiculo/*10.58*/.getMarca),format.raw/*10.67*/("""</p>
                    <p class="display-4">Modelo: """),_display_(/*11.51*/vehiculo/*11.59*/.getModelo),format.raw/*11.69*/("""</p>
                    <p class="display-4">Tipo: """),_display_(/*12.49*/vehiculo/*12.57*/.getTipo),format.raw/*12.65*/("""</p>
                    <p class="display-4">Marca: """),_display_(/*13.50*/vehiculo/*13.58*/.getMarca),format.raw/*13.67*/("""</p>
                    <p class="display-4">Pasajeros: """),_display_(/*14.54*/vehiculo/*14.62*/.getPasajeros),format.raw/*14.75*/("""</p>

                    """),format.raw/*16.105*/("""
                    """),format.raw/*17.21*/("""<p>    </p>
                    <p>    </p>
                    <a class="btn btn-success" href=""""),_display_(/*19.55*/routes/*19.61*/.ControladorVehiculo.eliminarVehiculo(vehiculo.getPlaca)),format.raw/*19.117*/("""" contenteditable="false">
                        <i class="glyphicon glyphicon-trash"></i>
                        Eliminar
                    </a>

                </div>

                <div class="col-sm-6">
                """),_display_(/*27.18*/helper/*27.24*/.form(action = routes.ControladorVehiculo.modificarvehiculo(vehiculo.getPlaca()))/*27.105*/{_display_(Seq[Any](format.raw/*27.106*/("""
                    """),_display_(/*28.22*/helper/*28.28*/.CSRF.formField),format.raw/*28.43*/("""
                    """),_display_(/*29.22*/helper/*29.28*/.CSRF.formField),format.raw/*29.43*/("""
                    """),_display_(/*30.22*/helper/*30.28*/.inputText(formularioVehiculos("placa"),'class -> "form-control", 'placeholder -> vehiculo.getPlaca, 'readonly ->"true")),format.raw/*30.148*/("""
                    """),_display_(/*31.22*/helper/*31.28*/.inputText(formularioVehiculos("cc propietario"),'class ->" form-control",'placeholder -> vehiculo.getPropietario().getCedula(), 'readonly ->"true")),format.raw/*31.176*/("""
                    """),_display_(/*32.22*/helper/*32.28*/.inputText(formularioVehiculos("marca"),'class ->" form-control",'placeholder -> "marca" )),format.raw/*32.118*/("""
                    """),_display_(/*33.22*/helper/*33.28*/.inputText(formularioVehiculos("modelo"),'class ->" form-control",'placeholder -> "modelo" )),format.raw/*33.120*/("""
                    """),_display_(/*34.22*/helper/*34.28*/.inputText(formularioVehiculos("tipo"),'class ->" form-control",'placeholder -> "tipo" )),format.raw/*34.116*/("""
                    """),_display_(/*35.22*/helper/*35.28*/.inputText(formularioVehiculos("cantidad pasajeros"),'class ->" form-control",'placeholder -> "cantidad" )),format.raw/*35.134*/("""

                    """),format.raw/*37.21*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-edit"></i>Modificar</button>
                """)))}),format.raw/*38.18*/("""
                """),format.raw/*39.17*/("""</div>

            </div>

    </div>

""")))}))
      }
    }
  }

  def render(vehiculo:Vehiculo,formularioVehiculos:Form[Vehiculo]): play.twirl.api.HtmlFormat.Appendable = apply(vehiculo,formularioVehiculos)

  def f:((Vehiculo,Form[Vehiculo]) => play.twirl.api.HtmlFormat.Appendable) = (vehiculo,formularioVehiculos) => apply(vehiculo,formularioVehiculos)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 28 14:40:35 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsVehiculo/mostarVehiculo.scala.html
                  HASH: 3b4be9e2c60ea81ccf553812b43afb7d3e36ffa7
                  MATRIX: 988->1|1141->59|1169->62|1206->91|1244->92|1276->98|1475->271|1491->279|1520->288|1595->337|1611->345|1658->372|1740->427|1757->435|1787->444|1870->500|1887->508|1918->518|1999->572|2016->580|2045->588|2127->643|2144->651|2174->660|2260->719|2277->727|2311->740|2368->852|2418->874|2545->974|2560->980|2638->1036|2905->1276|2920->1282|3011->1363|3051->1364|3101->1387|3116->1393|3152->1408|3202->1431|3217->1437|3253->1452|3303->1475|3318->1481|3460->1601|3510->1624|3525->1630|3695->1778|3745->1801|3760->1807|3872->1897|3922->1920|3937->1926|4051->2018|4101->2041|4116->2047|4226->2135|4276->2158|4291->2164|4419->2270|4471->2294|4625->2417|4671->2435
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|48->16|49->17|51->19|51->19|51->19|59->27|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|69->37|70->38|71->39
                  -- GENERATED --
              */
          