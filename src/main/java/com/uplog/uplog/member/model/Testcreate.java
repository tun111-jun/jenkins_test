package com.uplog.uplog.member.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Testcreate {
    @Id
    @GeneratedValue
    @Column(name = "form_id")
    private Long id;





    @Column(name = "TESTD")
    private Long test;

    public void tesSetting(Long test){
        this.test=test;
    }

}