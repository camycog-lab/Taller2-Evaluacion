package cl.iplacex;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps {

    private String mensajeSistema;

    @Given("que el usuario esta en la pagina de login")
    public void usuarioEnLogin() {
        // Simulamos abrir el navegador
        System.out.println("Navegador abierto en Login");
    }

    @When("ingresa el usuario {string} y la clave {string}")
    public void ingresaCredenciales(String usuario, String clave) {
        // Simulamos la lógica de validación
        if (usuario.equals("admin") && clave.equals("1234")) {
            mensajeSistema = "Acceso Exitoso";
        } else {
            mensajeSistema = "Clave Incorrecta";
        }
    }

    @Then("el sistema muestra el mensaje {string}")
    public void verificarMensaje(String mensajeEsperado) {
        assertEquals(mensajeEsperado, mensajeSistema);
    }
}