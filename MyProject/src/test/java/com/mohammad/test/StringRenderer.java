package com.mohammad.test;

public class StringRenderer {

	private String grid;

	public StringRenderer() {
		// TODO Auto-generated constructor stub
	}

	public String asString() {
		// TODO Auto-generated method stub
		return grid;
	}

	public void setGrid(int column) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < column; i++) {
			sb.append("X");
		}
		this.grid = sb.toString();
	}

}
