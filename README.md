# Hystrix Dashboard

Dashboard Hystrix.

1. Pre-Requisitos:
	* Java >= 1.8.x
	* Spring Boot 2.0.3.RELEASE
	* Spring Cloud Finchley.RC2

2. Dependencias:
	*  Hystrix Dashboard.
	
```
	dependencies {
		compile('org.springframework.cloud:spring-cloud-starter-netflix-hystrix-dashboard')
	}
```

3. Anotar con *@EnableHystrixDashboard* a la clase de configuración.

4. Detener *microservice-two* para realizar pruebas de fallos en *microservice-one*.

5. Abrir tu navegador favorito e ingresar al link *http://localhost:9000/hystrix* y agregamos:
	* Link stream: http://localhost:8070/actuator/hystrix.stream
	* Name app: microservice-one

