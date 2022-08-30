public class Main {
    public static void main(String[] args) {
        Square input1=new Square(10);
        int x=input1.getlength();
        CalcA input_a=new CalcA();
        input_a.area(x);

        Round input2=new Round(10);
        double y= input2.getradius();
        CalcA input_b=new CalcA();
        input_b.area(y);

        Triangle input3=new Triangle(10,10);
        int z=input3.getBase();
        int i=input3.getHeight();
        CalcA input_c=new CalcA();
        input_c.area(z,i);

    }
}