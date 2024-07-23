public class Cuadrilatero extends Poligono {

    public Cuadrilatero(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double areaPoligono() {
        area = base * altura;
        return area;
    }
}
