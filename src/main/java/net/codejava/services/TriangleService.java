/*
    GUARDADO TRIANGULOS HEROKU HTML :   TriangleService
    AUTORA                          :   Maria Tchijov Cruz
    FECHA                           :   19 abr 2022
    Servicio para el repositorio TriangleRepository
 */

package net.codejava.services;

import net.codejava.entity.TriangleEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import net.codejava.repositories.TriangleRepository;

@Service
@Transactional
public class TriangleService {

	@Autowired
	private TriangleRepository repo;
	
	public List<TriangleEntity> listAll() {return repo.findAll();}
	public void save(TriangleEntity product) {repo.save(product);}
	public TriangleEntity get(long id) {return repo.findById(id).get();}
	public void delete(long id) {repo.deleteById(id);}
}
