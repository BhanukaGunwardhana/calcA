public class Square extends Shape {
    private int length;
    public Square(int length){
        this.length=length;

    }
    public int getlength(){
        return length;
    }
    @Override
    public int printArea(){
        return this.length*this.length;

    }

}
