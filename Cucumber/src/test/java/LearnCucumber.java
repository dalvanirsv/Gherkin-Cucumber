import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LearnCucumber {
	@Given("que criei o arquivo corretamente")
	public void que_criei_o_arquivo_corretamente() {
	  System.out.println("qualquer coisa");
	}

	@When("executa-lo")
	public void execut_lo() {
	   
	}
	
			
	@Then("a especificacao deve finalizar com sucesso")
	public void a_especifica_o_deve_finalizar_com_sucesso() {
	  
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////
	
	private int contador = 0;
	@Given("que o valor do contador e {int}")
	public void que_o_valor_do_contador_e(Integer int1) throws Throwable {
		 contador = int1;
	}

	@When("eu incrementar em {int}")
	public void eu_incrementar_em(Integer int1) throws Throwable{
		contador = contador + int1;
	}

	@Then("o valor do contador sera {int}")
	public void o_valor_do_contador_sera(Integer int1) {
		System.out.println(int1);
		System.out.println(int1 == contador);
	}
	}

	
