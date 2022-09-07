package repository;

import com.example.springbootAPIRESTful.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;



public interface UsuarioRepository extends CrudRepository<UsuarioModel,Integer> {



}
