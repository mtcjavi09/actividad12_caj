/*
    GUARDADO TRIANGULOS HEROKU HTML :   TriangleEntity
    AUTORA                          :   Maria Tchijov Cruz
    FECHA                           :   19 abr 2022
    Entidad encargada de generar la tabla triangle
 */

package net.codejava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "triangle")
public class TriangleEntity 
{
    //Se agrega la tag de ID necesaria para el correcto funcionamiento de la entidad
    @Id
    //Se indica que el ID será generado de forma automática
    @GeneratedValue(strategy=GenerationType.AUTO)
    //Se indican los atributos de la tabla
    private Long id;
    private double base;
    private double altura;
    private double perimetro;
    private double area;
    
    //Contructor vacío
    public TriangleEntity() {}

    //Constructor protegido con todos los atributos
    protected TriangleEntity(Long id, double base, double altura) 
    {
        super();
        this.id = id;
        this.base = base;
        this.altura = altura;
    }
    
    //Se generaron los getters y setters para cada atributo
    public void setId(Long id) {this.id = id;}
    public void setBase(double base) {this.base = base;}
    public void setAltura(double altura) {this.altura = altura;}
    public void setPerimetro(double perimetro) {this.perimetro = perimetro;}
    public void setArea(double area) {this.area = area;}
    public Long getId() {return id;}
    public double getBase() {return base;}
    public double getAltura() {return altura;}
    public double getPerimetro() {return perimetro;}
    public double getArea() {return area;}    
}
