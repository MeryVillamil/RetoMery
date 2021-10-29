//Categoria,mensaje ,Reservacion,cliente
//1. Moelo o entidad
//2. Interfaces 
//3.repositorio
//servicios
//controlador o web

package Room34.Decameron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages ={"Room34.Decameron.modelo"})

public class DecameronApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecameronApplication.class, args);
	}
}
