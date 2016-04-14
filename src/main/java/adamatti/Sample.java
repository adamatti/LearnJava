package adamatti;

public class Sample {
	public int doSum(int x, int y) throws Exception {
		if (x==0 && y==0){
			throw new Exception("X and Y can't be zero");
		}
		return x + y;
	}
}