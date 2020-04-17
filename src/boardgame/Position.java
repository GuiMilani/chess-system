package boardgame;

public class Position {

	private Integer row;
	private Integer column;
	
	public Position(Integer row, Integer columnInteger) {
		this.row = row;
		this.column = columnInteger;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumnInteger() {
		return column;
	}

	public void setColumnInteger(Integer columnInteger) {
		this.column = columnInteger;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	
	
}
