 package Game;

public class Tail {

		int x,y;
	    boolean wait = true;

	    /**
	     * CONSTRUTOR
	     * @param x
	     * @param y
	     */
	    public Tail(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    public int getX() {
	        return x;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    public boolean isWait() {
	        return wait;
	    }

	    public void setWait(boolean wait) {
	        this.wait = wait;
	    }
	
}
