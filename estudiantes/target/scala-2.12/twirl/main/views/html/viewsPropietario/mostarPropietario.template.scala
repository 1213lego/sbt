
package views.html.viewsPropietario

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

object mostarPropietario extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Propietario,Form[Propietario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(propietario: Propietario, formularioPropietarios : Form[Propietario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""
"""),_display_(/*2.2*/main("Busqueda Propietarios")/*2.31*/{_display_(Seq[Any](format.raw/*2.32*/("""
    """),format.raw/*3.5*/("""<div class="jumbotron">


        <div class="row">
            <div class="col-sm-4">
                <p>    </p>
                <p class="h2">Cedula: """),_display_(/*9.40*/propietario/*9.51*/.getCedula),format.raw/*9.61*/("""</p>
                <p>    </p>
                <p class="display-4">Nombres: """),_display_(/*11.48*/propietario/*11.59*/.getNombres),format.raw/*11.70*/("""</p>
                <p>    </p>
                <p class="display-4">Apellidos: """),_display_(/*13.50*/propietario/*13.61*/.getApellidos),format.raw/*13.74*/("""</p>

         """),format.raw/*15.94*/("""
                """),format.raw/*16.17*/("""<p>    </p>
                <p>    </p>
                <a class="btn btn-success" href=""""),_display_(/*18.51*/routes/*18.57*/.ControladorPropietario.eliminar(propietario.getCedula())),format.raw/*18.114*/("""" contenteditable="false">
                    <i class="glyphicon glyphicon-trash"></i>
                    Eliminar
                </a>

            </div>
            <div class="col-sm-8">
            """),_display_(/*25.14*/helper/*25.20*/.form(action = routes.ControladorPropietario.modificar(propietario.getCedula))/*25.98*/{_display_(Seq[Any](format.raw/*25.99*/("""
                """),_display_(/*26.18*/helper/*26.24*/.CSRF.formField),format.raw/*26.39*/("""
                """),_display_(/*27.18*/helper/*27.24*/.inputText(formularioPropietarios("cedula"),'class -> "form-control", 'placeholder -> propietario.getCedula, 'readonly ->"true")),format.raw/*27.152*/("""
                """),_display_(/*28.18*/helper/*28.24*/.inputText(formularioPropietarios("nombres"),'class -> "form-control", 'placeholder -> "nombres")),format.raw/*28.121*/("""
                """),_display_(/*29.18*/helper/*29.24*/.inputText(formularioPropietarios("apellidos"),'class -> "form-control", 'placeholder -> "apellidos")),format.raw/*29.125*/("""

            """),format.raw/*31.192*/("""
                """),format.raw/*32.17*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-edit"></i>Modificar</button>
            """)))}),format.raw/*33.14*/("""
            """),format.raw/*34.13*/("""</div>
        </div>

    </div>

    <div class="jumbotron">

        <h1>Vehiculos vinculados al Propietario</h1>
        <table class="table table-bordered table-dark">
            <thead>
                <tr>
                    <th scope="col">Placa</th>
                    <th scope="col">Marca</th>
                    <th scope="col">Modelo</th>
                    <th scope="col">Tipo</th>
                    <th scope="col">Pasajeros</th>
                </tr>
            </thead>
            <tbody>


            """),_display_(/*55.14*/for(vehiculos <- propietario.getVehiculoList()) yield /*55.61*/{_display_(Seq[Any](format.raw/*55.62*/("""
                """),format.raw/*56.17*/("""<tr>
                    <th scope="row"><a class="glyphicon glyphicon-eye-open" href=""""),_display_(/*57.84*/routes/*57.90*/.ControladorVehiculo.buscarVehiculo(vehiculos.getPlaca)),format.raw/*57.145*/("""">"""),_display_(/*57.148*/vehiculos/*57.157*/.getPlaca()),format.raw/*57.168*/("""</a></th>
                    <td>"""),_display_(/*58.26*/vehiculos/*58.35*/.getMarca),format.raw/*58.44*/("""</td>
                    <td>"""),_display_(/*59.26*/vehiculos/*59.35*/.getModelo),format.raw/*59.45*/("""</td>
                    <td>"""),_display_(/*60.26*/vehiculos/*60.35*/.getTipo),format.raw/*60.43*/("""</td>
                    <td>"""),_display_(/*61.26*/vehiculos/*61.35*/.getPasajeros),format.raw/*61.48*/("""</td>
                </tr>
            """)))}),format.raw/*63.14*/("""
            """),format.raw/*64.13*/("""</tbody>
        </table>
    </div>
""")))}))
      }
    }
  }

  def render(propietario:Propietario,formularioPropietarios:Form[Propietario]): play.twirl.api.HtmlFormat.Appendable = apply(propietario,formularioPropietarios)

  def f:((Propietario,Form[Propietario]) => play.twirl.api.HtmlFormat.Appendable) = (propietario,formularioPropietarios) => apply(propietario,formularioPropietarios)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 28 15:00:26 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsPropietario/mostarPropietario.scala.html
                  HASH: 9907dbd9661077c491858ad9831454e3a626b04a
                  MATRIX: 1000->1|1165->71|1193->74|1230->103|1268->104|1300->110|1486->270|1505->281|1535->291|1644->373|1664->384|1696->395|1807->479|1827->490|1861->503|1906->604|1952->622|2071->714|2086->720|2165->777|2406->991|2421->997|2508->1075|2547->1076|2593->1095|2608->1101|2644->1116|2690->1135|2705->1141|2855->1269|2901->1288|2916->1294|3035->1391|3081->1410|3096->1416|3219->1517|3264->1712|3310->1730|3460->1849|3502->1863|4081->2415|4144->2462|4183->2463|4229->2481|4345->2570|4360->2576|4437->2631|4468->2634|4487->2643|4520->2654|4583->2690|4601->2699|4631->2708|4690->2740|4708->2749|4739->2759|4798->2791|4816->2800|4845->2808|4904->2840|4922->2849|4956->2862|5030->2905|5072->2919
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|41->9|41->9|41->9|43->11|43->11|43->11|45->13|45->13|45->13|47->15|48->16|50->18|50->18|50->18|57->25|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|63->31|64->32|65->33|66->34|87->55|87->55|87->55|88->56|89->57|89->57|89->57|89->57|89->57|89->57|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|92->60|93->61|93->61|93->61|95->63|96->64
                  -- GENERATED --
              */
          