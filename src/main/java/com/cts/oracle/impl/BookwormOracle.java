package com.cts.oracle.impl;

import com.cts.oracle.Oracle;

public class BookwormOracle implements Oracle {
	private Encyclopedia encyclopedia;

	public String defineMeaningOfLife() {
		return encyclopedia.getQuote();
	}

	public void setEncyclopedia(Encyclopedia encyclopedia) {
		this.encyclopedia = encyclopedia;
	}
}
