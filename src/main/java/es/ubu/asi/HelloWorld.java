package es.ubu.asi;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless(mappedName = "hello")
@LocalBean
public class HelloWorld {

    /**
     * Default constructor. 
     */
    public HelloWorld() {
    }

    /**
     * Obtiene la fecha actual en formato texto.
     * 
     * @return texto
     */
    public String getMessage() {
		return "JSF hello world example.";
	}
}
