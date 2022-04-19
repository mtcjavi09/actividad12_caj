/*
    GUARDADO TRIANGULOS HEROKU HTML :   TriangleRepository
    AUTORA                          :   Maria Tchijov Cruz
    FECHA                           :   19 abr 2022
    Repositorio de la entidad TriangleEntity
 */

package net.codejava.repositories;

import net.codejava.entity.TriangleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TriangleRepository extends JpaRepository<TriangleEntity, Long> {}
