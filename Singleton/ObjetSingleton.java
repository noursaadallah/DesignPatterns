
import java.util.*;


public class ObjetSingleton {

    private static ObjetSingleton oSingleton /*= new ObjetSingleton()*/;

    private ObjetSingleton() {
        super();
    }

    public static ObjetSingleton getOSingleton() {
    	if(oSingleton == null) {
    		System.out.println("Creating a new oSingleton");
    		oSingleton = new ObjetSingleton();
    	} else {
    		System.out.println("oSingleton exists");
    	}
    	return oSingleton;
    }

    public void Afficher() {
        System.out.println(oSingleton);
    }

}