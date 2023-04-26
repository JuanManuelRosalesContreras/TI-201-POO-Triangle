public class Triangle {
    private float base;
    private float height;
    private float area;

    public float getHeight() {
        return height;
    }
    
    public void setHeight(float height) {
        this.height = height;
        computeArea();
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
        computeArea();
    }
    
    public float computeArea() {
            area = base * height / 2;
            return area;       
    }

    public float getArea() {
        return area;
    }
}
