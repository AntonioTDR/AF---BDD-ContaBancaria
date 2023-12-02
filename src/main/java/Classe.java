// @Autor: Antônio Reche
// @Version: 1.0
// @Since: release 1.0
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// Classe feita para uma conta bancária.
public class Classe {
    private int Saldo;

    public Classe(int SaldoI) {
        this.Saldo = SaldoI;
    }
    // Realiza uma instância com o saldo da conta.
    // @param SaldoI:
    // O saldo inicial para o cliente Especial!
    
    @Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
    public void um_cliente_especial_com_saldo_atual_de_reais(int SaldoI) throws Throwable {
        this.Saldo = SaldoI;
    }
    // Realiza a solicitação de saque para o cliente especial.
    // @param ValorSaque O valor a ser sacado.

    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public void for_solicitado_um_saque_no_valor_de_reais(int ValorSaque) throws RuntimeException {
        if (ValorSaque > this.Saldo) {
            throw new RuntimeException("Saldo insuficiente!!!");
        }
        // Verifica se o saque foi efetuado, posteriormente atualiza o saldo da conta para oo saldo atual do cliente.
        // @param SaldoFinal: Mostra o saque atual do cliente.
        
    @Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int SaldoFinal) throws RuntimeException {
        if (this.Saldo != SaldoFinal) {
            throw new RuntimeException("O saldo da conta não foi atualizado, verifique novamente!");
            
            // Verifica os resultados da operação e exibe a mensagem de erro:
            // 'O saldo da conta não foi atualizado, verifique novamente'
        }
    }
}