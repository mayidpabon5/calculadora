public class calculadora{
    private int a;
    private int b;
    private int resultado;
    public calculadora() {
    }

    public void hacer_suma(int a, int b){
        resultado = (a+b);
    }
    public void hacer_resta(int a, int b){
        resultado = (a-b);
    }
    public void hacer_multiplicacion(int a, int b){
        resultado = (a*b);
    }
    public void hacer_division(int a, int b){
        resultado = (a/b);
    }
    public String respuesta_suma() {
        return "La suma es:" + resultado;
    }
    public String respuesta_resta() {
        return "La resta es:" + resultado;
    }
    public String respuesta_multiplicacion() {
        return "La multiplicacion es:" + resultado;
    }
    public String respuesta_division() {
        return "La division es:" + resultado;
    }
}