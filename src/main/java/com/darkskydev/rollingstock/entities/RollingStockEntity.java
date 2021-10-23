package com.darkskydev.rollingstock.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rollingstock")
public class RollingStockEntity {
  
    @Id
    @Column(name="rs_key")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name="rs_reportingmark")
    private String reportingmark;

    @Column(name="rs_roadnumber")
    private String roadnumber;

    @Column(name="rs_rss_key")
    private Integer rss_key;

    @Column(name="rs_rst_key")
    private Integer rst_key;

    @Column(name="rs_rsm_key")
    private Integer rsm_key;
    
    @Column(name="rs_notes")
    private String notes;
    
    @Column(name="rs_image")
    private String image;

    public String getRoadNumber() {
        return roadnumber;
    }
}
