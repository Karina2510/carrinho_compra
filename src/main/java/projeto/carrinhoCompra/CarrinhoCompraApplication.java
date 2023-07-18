package projeto.carrinhoCompra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

@SpringBootApplication
public class CarrinhoCompraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrinhoCompraApplication.class, args);
	}

}
