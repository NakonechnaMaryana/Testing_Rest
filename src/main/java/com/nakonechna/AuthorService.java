package com.nakonechna;
import entity.Author;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.Constants;

import static io.restassured.RestAssured.given;
import static utils.Constants.*;

public class AuthorService {

    private final RequestSpecification request =
            given()
            .baseUri(Constants.baseURI)
            .accept("application/json")
            .contentType("application/json;charset=UTF-8");

    public Response getAuthor(long authorId) {
        return request.get(String.format(GET_AUTHOR, authorId));
    }

    public Response getAuthors() {
        return request.get(GET_AUTHORS);
    }

    public Response createAuthor(Author author) {
        return request.body(author).that().post(CREATE_AUTHOR);
    }

    public Response updateAuthor(Author author) {
        return request.body(author).put(UPDATE_AUTHOR);
    }

    public Response deleteAuthor(long authorId) {
        return request.delete(String.format(DELETE_AUTHOR + authorId));
    }

    public Response getAuthorByBook(long bookId) {
        return request.get(String.format(GET_AUTHOR_BY_BOOK, bookId));
    }

    public Response getAuthorsByGenre(long genreId) {
        return request.get(String.format(GET_AUTHORS_BY_GENRE, genreId));
    }
}

