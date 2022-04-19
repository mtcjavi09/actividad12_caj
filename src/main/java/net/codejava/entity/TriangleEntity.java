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
    private int base;
    private int altura;
    private int perimetro;
    private int area;
    
    //Contructor vacío
    public TriangleEntity() {}

    //Constructor protegido con todos los atributos
    protected TriangleEntity(Long id, int base, int altura, int perimetro, int area) 
    {
        super();
        this.id = id;
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
        this.area = area;
    }

    //Se generaron los getters para cada atributo
    public Long getId() {return id;}
    public int getBase() {return base;}
    public int getAltura() {return altura;}
    public int getPerimetro() {return perimetro;}
    public int getArea() {return area;}    
}
