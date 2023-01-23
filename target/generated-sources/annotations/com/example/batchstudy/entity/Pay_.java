package com.example.batchstudy.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pay.class)
public abstract class Pay_ {

	public static volatile SingularAttribute<Pay, Long> amount;
	public static volatile SingularAttribute<Pay, Long> id;
	public static volatile SingularAttribute<Pay, String> txName;
	public static volatile SingularAttribute<Pay, LocalDateTime> txDateTime;

	public static final String AMOUNT = "amount";
	public static final String ID = "id";
	public static final String TX_NAME = "txName";
	public static final String TX_DATE_TIME = "txDateTime";

}

