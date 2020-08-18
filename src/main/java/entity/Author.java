
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author {
    @SerializedName("authorId")
    @Expose
    private Integer authorId;
    @SerializedName("authorName")
    @Expose
    private AuthorName authorName;
    @SerializedName("first")
    @Expose
    private String first;
    @SerializedName("second")
    @Expose
    private String second;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("birth")
    @Expose
    private Birth birth;
    @SerializedName("authorDescription")
    @Expose
    private String authorDescription;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Birth getBirth() {
        return birth;
    }

    public void setBirth(Birth birth) {
        this.birth = birth;
    }

    public String getAuthorDescription() {
        return authorDescription;
    }

    public void setAuthorDescription(String authorDescription) {
        this.authorDescription = authorDescription;}
}
