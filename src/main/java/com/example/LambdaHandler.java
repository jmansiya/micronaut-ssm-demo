package com.example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.annotation.ConfigurationInject;
import io.micronaut.context.annotation.Value;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;

import javax.inject.Inject;
import java.util.UUID;
import java.util.stream.Collectors;

@Introspected
public class LambdaHandler extends MicronautRequestHandler<Book, BookSaved>  {

  @Value("${author.prueba}")
  public String author;

  @Inject
  public ApplicationContext context;

  @Override
  public BookSaved execute(Book input) {
    BookSaved bookSaved = new BookSaved();
    bookSaved.setIsbn(UUID.randomUUID().toString());
    bookSaved.setName(input.getName());
    bookSaved.setAuthor(author);

    return bookSaved;
  }
}
