package backend.afwe.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Data
@Entity
@Table(name="article")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class article{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull(message = "id 不能为 null")
    private int id;

    private String Title;

    private String ContentHtml;

    private String ContentMd;

    private String Abstract;

    private String Cover;

    private Date Date;

    private String mode;

    public article(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContentHtml() {
        return ContentHtml;
    }

    public void setContentHtml(String contentHtml) {
        ContentHtml = contentHtml;
    }

    public String getContentMd() {
        return ContentMd;
    }

    public void setContentMd(String contentMd) {
        ContentMd = contentMd;
    }

    public String getAbstract() {
        return Abstract;
    }

    public void setAbstract(String anAbstract) {
        Abstract = anAbstract;
    }

    public String getCover() {
        return Cover;
    }

    public void setCover(String cover) {
        Cover = cover;
    }

    public java.sql.Date getDate() {
        return Date;
    }

    public void setDate(java.sql.Date date) {
        Date = date;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
