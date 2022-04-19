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
    private int base;
    private int altura;
    private int perimetro;
    private int area;

    //Métodos get y set para acceder a atributos privados
    public int getBase() {return base;}
    public void setBase(int base) {this.base = base;}
    public int getAltura() {return altura;}
    public void setAltura(int altura) {this.altura = altura;}
    public int getPerimetro() {return perimetro;}
    public void setPerimetro(int perimetro) {this.perimetro = perimetro;}
    public int getArea() {return area;}
    public void setArea(int area) {this.area = area;}

    //Contructor vacío
    public Triangle() {}

    //Constructor con la base y la altura
    public Triangle(String base, String altura) 
    {
        this.base = Integer.parseInt(base);
        this.altura = Integer.parseInt(altura);
    }
}
