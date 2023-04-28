package br.com.santander.internetbankingtestesantander.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-28T15:24:37.976189-03:00[America/Sao_Paulo]")
@Controller
@RequestMapping("${openapi.testeDesenvolvedorBackendSantander.base-path:}")
public class ClientesApiController implements ClientesApi {

    private final ClientesApiDelegate delegate;

    public ClientesApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ClientesApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ClientesApiDelegate() {});
    }

    @Override
    public ClientesApiDelegate getDelegate() {
        return delegate;
    }

}
