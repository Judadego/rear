package com.rear.rearArtifac;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.rear.rearArtifac.repositories.LessorRepository;
import com.rear.rearArtifac.repositories.PropertyRepository;
import com.rear.rearArtifac.repositories.ReviewRepository;
import com.rear.rearArtifac.repositories.UsuarioRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@SpringBootTest
@EntityScan("com.rear.rearArtifac.entities.*")
class Ormrear {

	@Autowired
	private LessorRepository LessorRepo;
	@Autowired
	private PropertyRepository PropertyRepo;
	@Autowired
	private ReviewRepository ReviewRepo;
	@Autowired 
	private UsuarioRepository UsuarioRepo;
	
	@Test
	void contextLoads() {


//Aqui confirmamos la conexion a la base de datos 
		Long numLessor = LessorRepo.count();
		assertNotNull(numLessor);
		Long numProperty = PropertyRepo.count();
		assertNotNull(numProperty);
		Long numReview = ReviewRepo.count();
		assertNotNull(numReview);
		Long numUsuario = UsuarioRepo.count();
		assertNotNull(numUsuario);


		/*/assertEquals(3,query.findall().conunt());
		assertFalse(false);
		System.out.println("assddasdasdas");*/
	}

}
