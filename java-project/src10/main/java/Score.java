
class Score {
	String name;
	int[] subjects = new int[3];
	int sum;
	float aver;

	Score(String name, int kor, int eng, int math) {
	    this.name = name;
	    this.subjects[0] = kor;
	    this.subjects[1] = eng;
	    this.subjects[2] = math;

	    this.compute();
	}
	
	void compute() {
		for (int sub : this.subjects) {
		    this.sum += sub;
		}
		this.aver = this.sum / (float)this.subjects.length;
	}
	
	void print() {
		compute();
		System.out.printf("%-4s : %4d, %4d, %4d, %4d, %6.1f\n",
			this.name,
			this.subjects[0],
			this.subjects[1],
			this.subjects[2],
			this.sum,
			this.aver);
	}
}

