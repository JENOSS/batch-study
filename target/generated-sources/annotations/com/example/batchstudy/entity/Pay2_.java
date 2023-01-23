package com.example.batchstudy.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pay2.class)
public abstract class Pay2_ {

	public static volatile SingularAttribute<Pay2, Long> amount;
	public static volatile SingularAttribute<Pay2, Long> id;
	public static volatile SingularAttribute<Pay2, String> txName;
	public static volatile SingularAttribute<Pay2, LocalDateTime> txDateTime;

	public static final String AMOUNT = "amount";
	public static final String ID = "id";
	public static final String TX_NAME = "txName";
	public static final String TX_DATE_TIME = "txDateTime";

}

