package br.com.santander.internetbankingtestesantander.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-28T22:08:26.805177-03:00[America/Sao_Paulo]")
@Controller
@RequestMapping("${openapi.testeDesenvolvedorBackendSantander.base-path:}")
public class ValoresApiController implements ValoresApi {

    private final ValoresApiDelegate delegate;

    public ValoresApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ValoresApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ValoresApiDelegate() {});
    }

    @Override
    public ValoresApiDelegate getDelegate() {
        return delegate;
    }

}
