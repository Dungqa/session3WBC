import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    double delta;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
        this.delta=delta;
    }
    public double Discriminant(){
        this.delta= (this.b*this.b-4*this.a*this.c);
        return delta;
    }
    public double Root1(){
        return (-this.b+Math.pow(this.delta,0.5)/(2*this.a));
    }
    public double Root2(){
        return (-this.b-Math.pow(this.delta,0.5)/(2*this.a));

    }
}
class Display{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        QuadraticEquation quadraticequation = new QuadraticEquation(a,b,c);
        if (quadraticequation.Discriminant()>0){
            System.out.println("Root1= "+quadraticequation.Root1()+", Root2="+ quadraticequation.Root2());
        }else if(quadraticequation.Discriminant()==0){
            System.out.println("Root= "+quadraticequation.Root1());
        }else {
            System.out.println("No Root");
        }
    }
}