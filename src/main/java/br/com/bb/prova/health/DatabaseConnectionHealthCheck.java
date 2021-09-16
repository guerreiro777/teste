package br.com.bb.prova.health;

import br.com.bb.prova.repository.CotacaoRepository;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Readiness
@ApplicationScoped
public class DatabaseConnectionHealthCheck implements HealthCheck
{
	@Inject
	CotacaoRepository cotacaoRepository;
	
	@Override
	public HealthCheckResponse call()
	{
		Boolean oBancoTaNoAr;
		try 
		{
			cotacaoRepository.listAll();
			oBancoTaNoAr = true;
		} catch (Exception e) {
			oBancoTaNoAr = false;
		}
		
		if (oBancoTaNoAr) 
		{
			return HealthCheckResponse.up("Banco de Dados UP");
		}
		
		return HealthCheckResponse.down("Banco de Dados DOWN");
	}
}