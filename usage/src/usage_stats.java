class usage_stats{
	double average_y;
	x_set average_x_set;
	double y_standard_deviation;
	x_set x_set_standard_deviations;
	usage_stats(){
	}
	void set_average_y(double average_y){
		this.average_y=average_y;
	}
	void set_average_xset(x_set average_x_set){
		this.average_x_set=average_x_set;
	}
	void set_y_standard_deviation(double y_standard_deviation){
		this.y_standard_deviation=y_standard_deviation;
	}
	void set_xset_standard_deviations(x_set x_set_standard_deviations){
		this.x_set_standard_deviations=x_set_standard_deviations;
	}
}