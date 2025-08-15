package com.prog.fatec.api_fatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/* primeira classe q executa *//*patch tu manda o put com apenas o que tu quer colocar */
/*controller:endpoints de cada classe 
service:regra de negocio, processa e valida -> banco de dados
domain:espelho do banco de dados, ex: cliente e propriedades dentro do banco de dados, como id, nome, cnpj etc */
public class ApiFatecApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);
	}        
}
