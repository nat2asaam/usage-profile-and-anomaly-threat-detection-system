class host_usage implements model{
	boolean is_mobile;
	usage_modeller math_modeller;
	double usageVal;// a system's usage value at a point in time
	memory_usage x1;
	cpu_usage x2;
	session_usage x3;
	program_usage x4;
	host_usage(){
		is_mobile=false;
	}
	public void set_memory_usage(memory_usage x1){
		this.x1=x1;
	}
	public void set_cpu_usage(cpu_usage x2){
		this.x2=x2;
	}
	public void set_session_usage(session_usage x3){
		this.x3=x3;
	}
	public void set_program_usage(program_usage x4){
		this.x4=x4;
	}
	public double computeval(){
		return 0;
	}
	public double findchange(){
		return 0;
	}
	public void learnsys(int t){
		System.out.println("learning host usage ...");
		//x1.learnsys(t);
		//x2.learnsys(t);
		//x3.learnsys(t);
		//x4.learnsys(t);
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