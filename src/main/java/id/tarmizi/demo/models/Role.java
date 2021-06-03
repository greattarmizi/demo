/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tarmizi.demo.models;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Tarmizi
 */
@Entity
@Table(name = "roles")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private EnumRole name;

    public Role() {

    }

    public Role(EnumRole name) {
        this.name = name;
    }
}
