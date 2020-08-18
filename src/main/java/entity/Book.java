
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Book {

    @SerializedName("bookId")
    @Expose
    private Integer bookId;
    @SerializedName("bookName")
    @Expose
    private String bookName;
    @SerializedName("bookLanguage")
    @Expose
    private String bookLanguage;
    @SerializedName("bookDescription")
    @Expose
    private String bookDescription;
    @SerializedName("additional")
    @Expose
    private Additional additional;
    @SerializedName("publicationYear")
    @Expose
    private Integer publicationYear;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookLanguage() {
        return bookLanguage;
    }

    public void setBookLanguage(String bookLanguage) {
        this.bookLanguage = bookLanguage;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public Additional getAdditional() {
        return additional;
    }

    public void setAdditional(Additional additional) {
        this.additional = additional;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

}
class Size {

    @SerializedName("height")
    @Expose
    private Double height;
    @SerializedName("width")
    @Expose
    private Double width;
    @SerializedName("length")
    @Expose
    private Double length;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

}
 class Additional {

    @SerializedName("pageCount")
    @Expose
    private Integer pageCount;
    @SerializedName("size")
    @Expose
    private Size size;

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

}
