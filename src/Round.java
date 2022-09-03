public class Round extends Shape {
    private int radius;
    public Round(int r){
        this.radius=r;

    }
    public int getradius(){
        return radius;
    }
    @Override
    public int printArea(){
        return (int) (Math.PI*this.radius*this.radius);

    }
}
