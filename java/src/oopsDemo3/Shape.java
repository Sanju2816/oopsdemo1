package oopsDemo3;

public interface Shape {

	 //implicitly public, static and final
    public String LABLE="Shape";
    
    //interface methods are implicitly abstract and public
     
     void draw();
     public double getArea();
}