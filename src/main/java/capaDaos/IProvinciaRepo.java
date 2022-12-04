package capaDaos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Pojo.Provincia;

@Repository
public interface IProvinciaRepo extends JpaRepository<Provincia, Long> {


}
