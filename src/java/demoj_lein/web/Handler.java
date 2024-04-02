package demoj_lein.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class Handler {

    public Mono<ServerResponse> helloWorldHandler(ServerRequest serverRequest)
    {
        return ServerResponse.ok()
                .bodyValue("Hello world");
    }
}