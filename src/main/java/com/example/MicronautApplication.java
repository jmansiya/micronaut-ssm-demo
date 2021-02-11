package com.example;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import edu.umd.cs.findbugs.annotations.Nullable;
import io.micronaut.context.ApplicationContext;
import io.micronaut.function.aws.runtime.AbstractMicronautLambdaRuntime;

import java.net.MalformedURLException;
import java.util.stream.Collectors;

public class MicronautApplication extends AbstractMicronautLambdaRuntime<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent, Book, BookSaved> {

    public static void main(String[] args) {
        try {
            new MicronautApplication()
                    .run(args);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    @Nullable
    protected RequestHandler<Book, BookSaved> createRequestHandler(String... args) {
        return new LambdaHandler();
    }
}
