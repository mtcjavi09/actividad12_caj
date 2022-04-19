/*
    GUARDADO TRIANGULOS HEROKU HTML :   Triangle
    AUTORA                          :   Maria Tchijov Cruz
    FECHA                           :   19 abr 2022
    Clase Triangle con los métodos y atributos del triángulo
 */

package net.codejava.entity;

public class Triangle 
{
    //Atributos del triángulo
    private double base;
    private double altura;
    private double perimetro;
    private double area;

    //Métodos get y set para acceder a atributos privados
    public double getBase() {return base;}
    public void setBase(double base) {this.base = base;}
    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}
    public double getPerimetro() {return perimetro;}
    public void setPerimetro(double perimetro) {this.perimetro = perimetro;}
    public double getArea() {return area;}
    public void setArea(double area) {this.area = area;}

    //Contructor vacío
    public Triangle() {}

    //Constructor con la base y la altura
    public Triangle(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }
}
