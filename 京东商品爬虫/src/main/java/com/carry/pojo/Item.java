package com.carry.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "jd_item")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long spu;
    private Long sku;
    private String title;
    private Double  price;
    private String pic;
    private String url;
    private Date created;
    private Date updated;




}
