package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

	@Inject
	SomeCdiDAO someCdiDAO;

	public SomeCdiDAO getSomeCDIDAO() {
		return someCdiDAO;
	}

	public void setSomeCDIDAO(SomeCdiDAO someCdiDAO) {
		this.someCdiDAO = someCdiDAO;
	}

}
