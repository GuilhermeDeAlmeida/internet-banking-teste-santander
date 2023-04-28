package br.com.santander.internetbankingtestesantander.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-28T15:24:37.976189-03:00[America/Sao_Paulo]")
@Controller
@RequestMapping("${openapi.testeDesenvolvedorBackendSantander.base-path:}")
public class TransacoesApiController implements TransacoesApi {

    private final TransacoesApiDelegate delegate;

    public TransacoesApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) TransacoesApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new TransacoesApiDelegate() {});
    }

    @Override
    public TransacoesApiDelegate getDelegate() {
        return delegate;
    }

}
