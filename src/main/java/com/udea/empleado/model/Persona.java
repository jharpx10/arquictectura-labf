/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.empleado.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Alejandro Rios
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ApiModel(description="Devuelve todos los detalles de la persona")
@ToString
@Entity
public class Persona implements Serializable{
    
@ApiModelProperty(notes = "The database generated person ID")
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="idperson")
private Long idPerson;
    
@ApiModelProperty(notes = "The first name")
@Column(name="firstname", nullable=false, length=80)
private @NonNull String firstName;

@ApiModelProperty(notes = "The last name")
@Column(name="lastname", nullable=false, length=80)
private @NonNull String lastName;

@ApiModelProperty(notes = "The personal occupation ")
@Column(name="occupation", nullable=false, length=80)
private @NonNull String occupation;

@ApiModelProperty(notes = "The personal salary ")
@Column(name="salary", nullable=false, length=80)
private @NonNull double salary;

@ApiModelProperty(notes = "The personal address ")
@Column(name="address", nullable=false, length=80)
private @NonNull String address;

@ApiModelProperty(notes = "The personal office ")
@Column(name="office", nullable=false, length=80)
private @NonNull String office;

@ApiModelProperty(notes = "The personal dependency ")
@Column(name="dependency", nullable=false, length=80)
private @NonNull String dependency;


@ApiModelProperty(notes = "The personal years")
@Column(name="years", nullable=false, length=80)
private @NonNull int years;

}
