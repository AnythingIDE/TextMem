package com.anythingide.textmem.imp;

import java.util.Objects;

import com.anythingide.textmem.TextOffset;

public class TextOffsetImp implements TextOffset {

	private final int lineOffset;
	private final int charOffset;

	public TextOffsetImp(int lineOffset, int charOffset) {
		this.lineOffset = lineOffset;
		this.charOffset = charOffset;
	}
	
	@Override
	public int getLineOffset() {
		return this.lineOffset;
	}

	@Override
	public int getCharOffset() {
		return this.charOffset;
	}
	
	@Override
	public boolean equals(Object o) {
		return
			o instanceof TextOffset &&
			((TextOffset) o).getCharOffset() == getCharOffset() &&
			((TextOffset) o).getLineOffset() == getLineOffset();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(lineOffset, charOffset);
	}

}
