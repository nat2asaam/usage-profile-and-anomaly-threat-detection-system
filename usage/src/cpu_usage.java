import java.util.*;
class cpu_usage implements model{
	boolean system_learning;
	usage_modeller math_modeller;
	double usageVal;// a system's usage value at a point in time
	double x1;//number of progrms running
	double x2;// number of system processes running
	double y;// amount of CPU power  being used
	double c1;// average CPU power for programs
	double c2;// max CPU power being used for running programs
	double c3;//min CPU powerbeing used for running programs
	double c4; // average CPU power for processes;
	double c5;// max CPU power being used forrunning processes
	double c6;// min CPU power being used for for running processes
	double d;// cpu speed in megahertz (1000MHZ =1GHz=1000,000,000 cycles per second)
	double x_set[];// for computing usage value
	cpu_usage(){
		system_learning=false;
	}
	public double computeval(){
		return 0;
	}
	public double findchange(){
		return 0;
	}
	public void capture_sample(){
		Random rand=new Random();
		x1=Math.round(rand.nextDouble()*100);// 0 to 100 programs
		x2=Math.round(rand.nextDouble()*100);// 0 to 100 processes
		y=Math.round(rand.nextDouble()*100);//0 t 100 percent of prcessor power
	}
	public void set_sample(){
		double x_set[]=new double[2];
		x_set[0]=x1;
		x_set[1]=x2;
		math_modeller.sample_x_set(x_set);
		math_modeller.sample_y(y);
		math_modeller.queue_sample();
	}
	public void set_x(double x_set[]){
		this.x_set=x_set;
	}
	public void learnsys(int t){
		if(system_learning==false){
			system_learning=true;
			System.out.println("learning auth usage ...");
		}
		for(int i=0;i<t;i++){
			capture_sample();
			set_sample();
		}
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