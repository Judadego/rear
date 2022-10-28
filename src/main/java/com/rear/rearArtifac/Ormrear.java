package com.rear.rearArtifac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
//@ComponentScan({"com.rear.rearArtifac.controllers","com.rear.rearArtifac.servicios"})//para acceder a otros paquetes desde aqui
public class Ormrear { 
	public static void main(String[] args) {
		
		//Al usar la libreria de spring se tiene que ejecutar el proyecto con 
		//esta linea 
		SpringApplication.run(Ormrear.class, args);
	}

}
