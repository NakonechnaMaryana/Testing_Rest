package com.nakonechna;
import entity.Book;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.Constants;

import static io.restassured.RestAssured.given;
import static utils.Constants.*;

public class BookService {
    private final RequestSpecification request =
            given()
            .baseUri(Constants.baseURI)
            .accept("application/json")
            .contentType("application/json;charset=UTF-8");

    public Response getBook(long bookId){
        return request.get(Constants.GET_BOOK);
    }

    public Response getBooks() {
        return request.get(GET_BOOKS);
    }

    public Response createBook(Book book) {
        return request.body(book).that().post(CREATE_BOOK);
    }

    public Response updateBook(Book book) {
        return request.body(book).put(UPDATE_BOOK);
    }

    public Response deleteBook(long bookId) {
        return request.delete(String.format(DELETE_BOOK + bookId));
    }

    public Response getBookByAuthor(long authorId) {
        return request.get(String.format(GET_BOOKS_BY_AUTHOR, authorId));
    }

    public Response getAuthorsByGenre(long genreId) {
        return request.get(String.format(GET_AUTHORS_BY_GENRE, genreId));
    }
}