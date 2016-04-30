package com.mohammad.test;

public class Game {

	private StringRenderer renderer;
	private int width;
	private int height;

	public Game(int width, int height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}

	public void setObserver(StringRenderer renderer) {
		// TODO Auto-generated method stub

		this.renderer = renderer;
	}

	public void toggleCellAt(int column, int row) {
		// TODO Auto-generated method stub
		renderer.setGrid(row);
	}

}
