package questions.demoblaze;



import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.demoblaze.CartUI;

public class labelsProductosAdquiridos {

    public static Question<String> getNombreProductoAdquirido(String id){
        return Text.of(CartUI.NOMBRE_PRODUCTO_AGREGADO.of(id)).asString();
    }

    public static Question<String> getPrecioProductoAdquirido(String nombre){
        return Text.of(CartUI.PRECIO_PRODUCTO_AGREGADO.of(nombre)).asString();
    }

}