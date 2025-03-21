package ma.ensa.jeeexame1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date_prelvation;
    private Date retur_date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate_prelvation() {
        return date_prelvation;
    }

    public void setDate_prelvation(Date date_prelvation) {
        this.date_prelvation = date_prelvation;
    }

    public Date getRetur_date() {
        return retur_date;
    }

    public void setRetur_date(Date retur_date) {
        this.retur_date = retur_date;
    }
}

