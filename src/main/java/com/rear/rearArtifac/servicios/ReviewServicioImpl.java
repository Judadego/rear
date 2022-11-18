package com.rear.rearArtifac.servicios;

//import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//import javax.servlet.http.HttpSession;

import com.rear.rearArtifac.controllers.dto.ReviewCompletaDto;
import com.rear.rearArtifac.entities.Lessor;
import com.rear.rearArtifac.entities.Review;
//import com.rear.rearArtifac.entities.Usuario;
import com.rear.rearArtifac.entities.Property;
import com.rear.rearArtifac.repositories.LessorRepository;
import com.rear.rearArtifac.repositories.PropertyRepository;
import com.rear.rearArtifac.repositories.ReviewRepository;
import com.rear.rearArtifac.repositories.UsuarioRepository;

@Service
public class ReviewServicioImpl implements ReviewServicio {

    @Autowired
    public ReviewRepository rvwRepo;

    @Autowired
    public PropertyRepository propRepo;

    @Autowired
    public LessorRepository lssrRepo;

    //private ReviewCompletaDto registroDto;

    public UsuarioRepository usrRepo;

    public ReviewServicioImpl(ReviewRepository rvwRepo, LessorRepository lssrRepo, PropertyRepository propRepo) {
        super();
        this.rvwRepo = rvwRepo;
        this.lssrRepo = lssrRepo;
        this.propRepo = propRepo;
    }
 

    // Aqui vamos, hay que probar si con usuarioRepository podemos acceder al
    // usuario actual
    // para relacionarlo con su respectiva review
    /*
     * @Override
     * public Review guardar(ReviewRegistroDto registroDto) {
     * Review review = new Review(
     * registroDto.getPuntuaction(),
     * registroDto.getdStart(),
     * registroDto.getdEnd(),
     * user,
     * registroDto.getId_lessor(),
     * registroDto.getId_property()
     * );
     * return null;
     * }
     */
    
    //Usuario usuario1 = usrRepo.getById(null);
    
    Date dStart = null;
    Date dEnd = null;
    Lessor lssr;
    Property prop;
    /*Usuario is = idUser("usuariosession");
    //Usuario loggueado;
   // HttpSession session = (Usuario) session.getAttribute("usuariosession");
    public String idUser(HttpSession session){
        
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");
        //Long Id = logueado.getId_user();
        return is = logueado;
    }*/

    Long id = (long) 123;
    Long id1 = (long) 1234;
    String f = "is.getFname()";
    String l = "is.getLname()";
    String t = "vv";
    Long p = (long) 123;
    Long p1 = (long) 1234;
    String e = "is.getEmail()";
    String e1 = "is.getEmcail()";
           
    @Override
    public Review guardar(ReviewCompletaDto registroDto){
        
        Review review = new Review(
            registroDto.getPuntuaction(),
            //registroDto.getdStart(null),
            dStart, dEnd,
            //registroDto.getdEnd(null),
           // usuario1,
            lssr = lssrRepo.save(new Lessor(
                registroDto.getId_Lessor(),                
                registroDto.getpFName(),
                registroDto.getpLName(),
                registroDto.getNationality(),
                registroDto.getTypeDni()
                )),
            prop = propRepo.save(new Property(
                registroDto.getCity(),
                registroDto.getDepartament(),
                registroDto.getAdress()            
                                
                ))
            
        );
        System.out.println("************************************************************************************************Llegamos a guardar");
        System.out.println(lssr.toString()+"_-_____-____-______----_______------__--_______-----___--____--__--------_--_---");
        System.out.println(prop.toString());
        System.out.println(review.toString()+ registroDto.getPuntuaction() +"00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        return rvwRepo.save(review);
    };

   /* @Override
	public UserDetails loadUserByUserDetails(Long) {
		Usuario usuario = usrRepo.findByEmail(username);
       
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario y/o password inválidos");
		}
        return new User(usuario.getEmail(),usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
	}
    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
	} */

    @Override
    @Transactional
    public List<Review> listarReviews() {
        // el return debe ser de tipo lista
        return (List<Review> ) rvwRepo.findAll();
    }

    @Override
    public Review buscarPorId (Integer id){
        return rvwRepo.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id){
        rvwRepo.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        return null;
    }

    @Override
    public Review get(Integer id) {
        return rvwRepo.findById(id).get();
    }

    @Override
    @Transactional
    public Page<Review> findAll(Pageable pageabe) {
       
        return rvwRepo.findAll(pageabe);
    }

    @Override
    @Transactional
    public Review findOne(Integer id) {
        
        return rvwRepo.findById(id).orElse(null);
    }



}
