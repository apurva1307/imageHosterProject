package ImageHoster.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//@Entity annotation specifies that the corresponding class is a JPA entity
@Entity
@Table(name = "comments")
public class Comment {

    //@Id annotation stands for below attribute as primary key for the comment table.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "text")
    private String text;

    @Column(name = "createddate")
    private Date createdDate;

    @ManyToOne(fetch = FetchType.EAGER)
    //Below annotation indicates that the name of the column in 'user' table referring the primary key in 'users' table will be 'user_id'
    @JoinColumn(name = "userId")
    private User user;


    @ManyToOne(fetch = FetchType.EAGER)
    //Below annotation indicates that the name of the column in 'images' table referring the primary key in 'image' table will be 'id'
    @JoinColumn(name = "imageId")
    private Image image;


    public Comment() {
    }

    public Comment(int id, String text, Date createdDate, User user, Image image) {
        this.id = id;
        this.text = text;
        this.createdDate = createdDate;
        this.user = user;
        this.image = image;
    }

    public Integer getCommentId() {
        return id;
    }

    public void setCommentId(Integer comment_id) {
        this.id = comment_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
