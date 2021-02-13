package org.jian.shadow.domain;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "classify")
@Entity
public class Classify {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "book_count")
    private String bookCount;
    @Column(name = "monthly_count")
    private String monthlyCount;
    @Column(name = "icon")
    private String icon;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "order_by")
    private int orderBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookCount() {
        return bookCount;
    }

    public void setBookCount(String bookCount) {
        this.bookCount = bookCount;
    }

    public String getMonthlyCount() {
        return monthlyCount;
    }

    public void setMonthlyCount(String monthlyCount) {
        this.monthlyCount = monthlyCount;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(int orderBy) {
        this.orderBy = orderBy;
    }
}
