package com.peigo.account.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users_type")
public class UserType {

    @Id
    @Column(name = "user_type_id")
    private String userTypeId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
