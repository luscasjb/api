package integracao.compras.api.scheduler;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component @EnableScheduling 
public class VerificadorPedidos {

    private final long SEGUNDO = 1000; 
    private final long MINUTO = SEGUNDO * 60; 
    private final long HORA = MINUTO * 60;
	

}
