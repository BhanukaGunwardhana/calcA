public class Triangle extends Shape {
    private int height;

    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }

    private int base;
    public Triangle(int height,int base){
        this.height=height;
        this.base=base;
    }

    @Override
    public int printArea(){
         return this.height * this.base / 2;
    }
}
