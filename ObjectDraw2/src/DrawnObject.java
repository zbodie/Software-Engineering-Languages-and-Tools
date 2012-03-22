import java.awt.Color;


public class DrawnObject {
	int topLeftX;
	int topLeftY;
	int bottomRightX;
	int bottomRightY;
	String creatorTool;
	Color color;
	boolean filled;
	
	public int getTopLeftX() {
		return topLeftX;
	}

	public void setTopLeftX(int topLeftX) {
		this.topLeftX = topLeftX;
	}

	public int getTopLeftY() {
		return topLeftY;
	}

	public void setTopLeftY(int topLeftY) {
		this.topLeftY = topLeftY;
	}

	public int getBottomRightX() {
		return bottomRightX;
	}

	public void setBottomRightX(int bottomRightX) {
		this.bottomRightX = bottomRightX;
	}

	public int getBottomRightY() {
		return bottomRightY;
	}

	public void setBottomRightY(int bottomRightY) {
		this.bottomRightY = bottomRightY;
	}

	public String getCreatorTool() {
		return creatorTool;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	//Constructor
	public DrawnObject(int TLX, int TLY, int BRX, int BRY, String creatorTool, Color color, boolean filled){
		topLeftX = TLX;
		topLeftY = TLY;
		bottomRightX = BRX;
		bottomRightY = BRY;
		this.creatorTool = creatorTool;
		this.color = color;
		this.filled = filled;
	}
	
	
}
