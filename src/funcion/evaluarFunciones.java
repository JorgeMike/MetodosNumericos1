package funcion;

/**
 *
 * @author Jorge Alvarado
 */
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class evaluarFunciones {

    private String funcion = ""; // <-- Aqui se guarda la funcion :)
    private double valorX = 0.0;//<-Se usara para sustituir el valor x
    private double resultado = 0.0;//<-Aqui se guardara el resultado

    JEP jep;

    public void setFuncion(String funcion) { //Funcion set para establecer la funcion en esta clase
        this.funcion = funcion;
    }

    public String getFuncion() { //Funcion get para poder devolver la función
        return this.funcion;
    }

    public double evaluar(double valorX) {
        this.valorX = valorX;

        jep = new JEP();

        this.jep.addStandardFunctions(); //Añade funciones basicas como las trigonometricas
        this.jep.addStandardConstants(); //Añade constantes basicas con e, pi, etc.
        this.jep.addVariable("x", this.valorX); //Define que letra sera la que sustituiremos por que valor
        this.jep.parseExpression(this.funcion); //Hace un parseo para convertir la funcion en una var funcion
        this.resultado = this.jep.getValue(); //Guarda el valor de la evalucion en la var resultado
        return this.resultado;

    }

    public boolean contieneX() {
        for (int i = 0; i < this.funcion.length(); i++) {
            if (this.funcion.substring(i, i + 1).contains("x")) { //Esta linea recorre la funcion y si contiene x de la posicion i hasta i+1 entonces devuelve true
                return true;
            }
        }
        return false;
    }

    public String derivar() { //Funcion

        try {

            DJep djepObject;
            Node node_funcion;
            Node diff_simplificada;

            djepObject = new DJep();
            djepObject.addStandardFunctions();
            djepObject.addStandardConstants();
            djepObject.addComplex();
            djepObject.setAllowUndeclared(true);
            djepObject.setAllowAssignment(true);
            djepObject.setImplicitMul(true);
            djepObject.addStandardDiffRules();

            node_funcion = (Node) djepObject.parse(funcion);

            Node diff = djepObject.differentiate(node_funcion, "x");
            diff_simplificada = djepObject.simplify(diff);

            return djepObject.toString(diff_simplificada);
        } catch (ParseException e) {
            System.out.println("No se puede derivar");
            return "";
        }

    }
}
