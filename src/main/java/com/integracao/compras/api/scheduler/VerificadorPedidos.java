/*package com.integracao.compras.api.scheduler;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.integracao.compras.api.pedidos.Pedido;
import com.integracao.compras.api.pedidos.Status;

@Component @EnableScheduling 
public record VerificadorPedidos(Status status, 
		LocalDateTime dataAtualizacao) {
    
	public class VerificadorDados {

		public VerificadorDados(Pedido pedido) {
			this(pedido.getStatus(), pedido.getDataAtualizacao());
		}
		
    public VerificadorDados(Status status, LocalDateTime dataAtualizacao) {
		}

	@Scheduled(fixedDelay = 86400000)//24 horas
    public void Verificador() {
    	LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime lastTime = currentTime.minus(48, ChronoUnit.HOURS);
    	
        if(status == "PEDIDO_NAO_FINALIZADO") {
        	
      
        }
    }
	}
}
*/