
package utils.web;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class DatosParametrizados {

    public static JSONObject  leerJson() throws IOException, ParseException {
        Object ob = new JSONParser().parse(new FileReader("./src/test/resources/data/carritoCompra/dataJson.json"));

        // typecasting ob to JSONObject
        JSONObject js = (JSONObject) ob;
        return js;
    }
}
