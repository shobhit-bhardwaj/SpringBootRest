package com.shobhit.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Data
public class EmployBean {
	private int id;
	private String name;
	private String designation;
	private int salary;
}