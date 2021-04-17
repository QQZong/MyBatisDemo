package com.qin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
/*无参构造*/
@NoArgsConstructor
/*有参构造*/
@AllArgsConstructor
@ToString
public class User implements Serializable {
    public int id;
    public String username;
    public String password;
}
