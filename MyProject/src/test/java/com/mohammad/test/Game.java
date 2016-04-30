package com.mohammad.test;

public class Game {

	private StringRenderer renderer;

	public Game(int width, int height) {

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
