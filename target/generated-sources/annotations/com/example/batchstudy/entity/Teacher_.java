package com.example.batchstudy.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Teacher.class)
public abstract class Teacher_ {

	public static volatile SingularAttribute<Teacher, String> subject;
	public static volatile SingularAttribute<Teacher, String> name;
	public static volatile ListAttribute<Teacher, Student> students;
	public static volatile SingularAttribute<Teacher, Long> id;

	public static final String SUBJECT = "subject";
	public static final String NAME = "name";
	public static final String STUDENTS = "students";
	public static final String ID = "id";

}

