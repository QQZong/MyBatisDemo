package com.qin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book implements Serializable {
    private String id;
    private String bookName;
    private Date date;
    private String author;
    private String publisher;
}
