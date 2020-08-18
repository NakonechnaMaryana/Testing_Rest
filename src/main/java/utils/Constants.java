package utils;
public interface Constants {
    public static final int RESPONSE_STATUS_CODE_200 = 200;
    public static final int RESPONSE_STATUS_CODE_500 = 500;
    public static final int RESPONSE_STATUS_CODE_400 = 400;
    public static final int RESPONSE_STATUS_CODE_401 = 401;
    public static final int RESPONSE_STATUS_CODE_201 = 201;
    public static final String baseURI = "http://localhost:8080";
    public static final String GET_AUTHORS = "/api/library/authors";
    public static final String GET_AUTHOR = "/api/library/author/%s";
    public static final String GET_AUTHOR_BY_BOOK = "/api/library/book/%s/author";
    public static final String GET_AUTHORS_BY_GENRE = "/api/library/genre/%s/authors";
    public static final String CREATE_AUTHOR = "/api/library/author";
    public static final String UPDATE_AUTHOR = "/api/library/author";
    public static final String DELETE_AUTHOR = "/api/library/author/%s";
    public static final String CREATE_BOOK = "/api/library/book/%s/%s";
    public static final String UPDATE_BOOK = "/api/library/book/%s";
    public static final String GET_BOOK = "/api/library/book/%s";
    public static final String DELETE_BOOK = "/api/library/book/%s";
    public static final String GET_BOOKS_BY_AUTHOR = "/api/library/author/%s/books";
    public static final String GET_BOOKS = "/api/library/books";
}
