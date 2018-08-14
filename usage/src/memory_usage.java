class memory_usage implements model{
	usage_modeller math_modeller;
	double usageVal;// a system's usage value at a point in time
	double x1;//number of progrms running
	double x2;// number of system processes running
	double y;// amount of memory space being used 
	double c1;// average memory space per program
	double c2;// max memory space for running programs
	double c3;//min memory space for running programs
	double c4; // average memory space per process;
	double c5;// max memory space for running processes
	double c6;// min memory space for running processes
	memory_usage(){
		
	}
	public double computeval(){
		return 0;
	}
	public double findchange(){
		return 0;
	}
	public void learnsys(int t){
		System.out.println("learning memory usage ...");
	}
	public Object findrelationship(){
		return null;
	}
	public void monitor(int t){
	}
	public void showalarm(String info){
		System.out.println(info);
	}
	public void haltprocess(){
	}
	public void predictvals(){
	}
}