public abstract class Poligono {
    // Atributos del poligono
    protected double base;
    protected double altura;
    protected double area;

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // Funcion que retorna el area del poligono
    public abstract double areaPoligono();
}
