package com.planosaude.planodesaude;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.planosaude.planodesaude.entity.plano;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PlanodesaudeApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateplanoSuccess() {
	var plano = new plano("plano 1", "nome plano 1", "telefone plano 1", "dataNascimento", "dataInclusao", "dataAtualizacao",false, 1);

	webTestClient
	.post()
	.uri("/planos")
	.bodyValue(plano)
	.exchange()
	.expectStatus().isOk()
	.expectBody()
	.jsonPath("$").isArray()
	.jsonPath("$.length()").isEqualTo(1)
	.jsonPath("$[0].nome").isEqualTo(plano.getNome())
	.jsonPath("$[0].nome").isEqualTo(plano.getTelefone())
	.jsonPath("$[0].nome").isEqualTo(plano.getDataNascimento())
	.jsonPath("$[0].nome").isEqualTo(plano.getDataInclusao())
	.jsonPath("$[0].nome").isEqualTo(plano.getDataAtualizacao());
	
	}

	@Test
	void testCreatePlanoSaudeFailure() {
	}

}
