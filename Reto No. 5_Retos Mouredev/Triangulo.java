public class Triangulo extends Poligono {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double areaPoligono() {
        area = (base * altura) / 2;
        return area;
    }
}
