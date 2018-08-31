package pl.altkom.asc.lab.micronaut.poc;

import io.reactivex.Maybe;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.Client;
import pl.altkom.asc.lab.micronaut.poc.policy.search.service.api.v1.queries.findpolicy.FindPolicyQueryResult;

@Client(id = "/policy-search-service", path = "/policies")
public interface PolicySearchTestClient {

    @Get
    Maybe<FindPolicyQueryResult> policies(@QueryValue("q") String queryText);
}
