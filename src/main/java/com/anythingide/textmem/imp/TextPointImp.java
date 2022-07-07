package com.anythingide.textmem.imp;

import java.util.Objects;

import com.anythingide.textmem.TextPoint;

public class TextPointImp implements TextPoint {

	private final int row;
	private final int column;

	public TextPointImp(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	@Override
	public int getRow() {
		return row;
	}

	@Override
	public int getColumn() {
		return column;
	}
	
	@Override
	public boolean equals(Object o) {
		return
			o instanceof TextPoint &&
			((TextPoint) o).getRow() == getRow() &&
			((TextPoint) o).getColumn() == getColumn();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(row, column);
	}

}
