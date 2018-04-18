package PE3;

public class Sequence {

	private int size;
	
	void setSize(int size) {
		this.size = size;
		ReverseSequenceSelector rss = new ReverseSequenceSelector();
		rss.current(this.size-1);
	}
	
	public class ReverseSequenceSelector implements Selector {

		public void current(int c) {
			if(c==0) {
				System.out.print(c+" ");
				end(c);
			}
			else {
				System.out.print(c+" ");
				next(c-1);
			}
		}

		public void end(int e) {
			if(e==0)
				System.exit(0);
		}

		public void next(int n) {
			current(n);
		}
		
	}
}
