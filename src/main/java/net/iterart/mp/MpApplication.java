package net.iterart.mp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mercadopago.MercadoPago;

@SpringBootApplication
public class MpApplication  implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(MpApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

		//Credenciales de prueba (las pruebas sólo funcionan en un navegador que NO ESTÉ logueado en MP):
		MercadoPago.SDK.setAccessToken(System.getenv("TEST-721755740151973-112211-7e9b4fce47c7c080f0e528b7c34f09cc-253339153"));	
		MercadoPago.SDK.setUserToken("TEST-1d94182c-55da-4b1f-a79a-27ec1177136a");

		//Credenciales reales (crear aplicación en https://www.mercadopago.com.ar/developers/panel/app)
		//MercadoPago.SDK.setClientId("###############");
		//MercadoPago.SDK.setClientSecret("################################");
	}

}
