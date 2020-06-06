package br.com.tis;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.tis.domain.Creche;
import br.com.tis.domain.Endereco;
import br.com.tis.domain.Atividade;
import br.com.tis.repositories.CrecheRepository;

@SpringBootApplication
public class CrecheArcoIrisApplication implements CommandLineRunner {

	@Autowired
	private CrecheRepository crecheRepository;
	
	private Endereco endereco;
	
	public static void main(String[] args) {
		SpringApplication.run(CrecheArcoIrisApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
	}

	@Autowired
	private CrecheCryptography crecheCrypto;
	
	private Crypto main;

	public static void crypto() {
		DoCrypto(crecheCrypto)
	}

	public void run(String... args) throws Exception {
		
	}

}
