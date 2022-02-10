package com.kodem.Linkedin.model;

import javax.persistence.*;

@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private users user;

    private String title;
    @Column(name = "companyName")
    private String companyName;
    private String location;
    private String start;
    private String stop;
    private String headline;

    public Experience(users user, String title, String companyName, String location, String start, String stop, String headline) {
        this.user = user;
        this.title = title;
        this.companyName = companyName;
        this.location = location;
        this.start = start;
        this.stop = stop;
        this.headline = headline;
    }

    public Experience() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public users getUser() {
        return user;
    }

    public void setUser(users user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", start='" + start + '\'' +
                ", stop='" + stop + '\'' +
                ", headline='" + headline + '\'' +
                '}';
    }
}
