package Game;

public class Head {
	
		int x ;
		int y ;
		
		Dir dir =Dir.RIGHT;					//direction de base
		Dir dir1 =Dir.LEFT;	
		Dir dir2 =Dir.UP;	
		Dir dir3=Dir.DOWN;
		
		
		public Dir getDir1() {
			return dir1;
		}
		
		public void setDir1(Dir dir1) {
			this.dir1 = dir1;
		}
		
		public Dir getDir2() {
			return dir2;
		}
		
		public void setDir2(Dir dir2) {
			this.dir2 = dir2;
		}
		
		public Dir getDir3() {
			return dir3;
		}
		
		public void setDir3(Dir dir3) {
			this.dir3 = dir3;
		}
		
		public Head(int x, int y) {
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
		
		public Dir getDir() {
			return dir;
		}
		
		public void setDir(Dir dir) {
			this.dir = dir;
		}
}

