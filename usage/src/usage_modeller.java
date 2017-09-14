import java.util.*;
class usage_modeller{
	usage_stats stats;
	ArrayList<x_set> x_set_list;
	ArrayList<Double> y_list;
	double x_set[];
	double y;
	int n;
	double average_y;
	double y_standard_deviation;
	x_set average_x_set;
	x_set x_set_standard_deviations;
	boolean end_modeller;
	usage_modeller(int n){
		x_set_list=new ArrayList<x_set>();
		y_list=new ArrayList<Double>();
		x_set=new double[n];
		stats=new usage_stats();
		average_x_set=new x_set(n);
		x_set_standard_deviations=new x_set(n);
		this.n=n;
		end_modeller=false;
	}
	public usage_stats get_usage_stats(){
		if(end_modeller==true){
			average_y=mean_y();
			average_x_set.set_xset(mean_x_set());
			stats.set_average_y(average_y);
			stats.set_y_standard_deviation(y_standard_deviation);
			stats.set_average_xset(average_x_set);
			stats.set_xset_standard_deviations(x_set_standard_deviations);
			return stats;
		}
		return null;
	}
	public void sample_x_set(double x_set[]){
		this.x_set=x_set;
	}
	public void sample_y(double y){
		this.y=y;
	}
	public void queue_sample(){
		y_list.add(y);
		x_set set=new x_set(n);
		set.set_xset(x_set);
		x_set_list.add(set);
		
	}
	private double mean_y(){
		double mean=0;
		for(int i=0;i<y_list.size();i++){
			Double p=(Double)y_list.get(i);
			mean+=p.doubleValue();
		}
		mean/=y_list.size();
		return mean;
	}
	private double[] mean_x_set(){
		double mean[]=null;
		mean=new double[n];
		int w=0;
		double x_vals[]=new double[n];
		for(int i=0;i<x_set_list.size();i++){
			x_set p=(x_set)x_set_list.get(i);
			w=p.n;
			x_vals=p.x_set;
			for(int j=0;j<w;j++){
				mean[j]+=x_vals[j];
			}	
		}
		for(int k=0;k<w;k++){
			mean[k]/=x_set_list.size();
		}
		return mean;
	}	
}