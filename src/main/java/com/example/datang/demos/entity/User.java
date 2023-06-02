package com.example.datang.demos.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    public Integer id;
    public String username;
    public String password;
    public String belong;
    public String gender;
    public String entryTime;
    public String position;
    public String birthday;
    public String education;
    public String major;
    public String experience;
}
