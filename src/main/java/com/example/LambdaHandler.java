package com.example;

import io.micronaut.context.annotation.Value;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;

import java.util.UUID;

@Introspected
public class LambdaHandler extends MicronautRequestHandler<Book, BookSaved>  {

  @Value("${author.prueba}")
  public String author;

  @Override
  public BookSaved execute(Book input) {
    BookSaved bookSaved = new BookSaved();
    bookSaved.setIsbn(UUID.randomUUID().toString());
    bookSaved.setName(input.getName());

    return bookSaved;
  }
}
