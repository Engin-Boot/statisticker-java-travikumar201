package statisticker;

import java.util.List;

public class Statistics 
{
    public static class Stats {
		Float average;
		Float min;
	    Float max;
		public Stats(float average, float min, float max) {
			this.average=average;
			this.min=min;
			this.max=max;
		}
	}
    public static Stats getStatistics(List<Float> numbers) {
    	if(!numbers.isEmpty()){
    		float average=0;
        	float min=numbers.get(0);
        	float max=numbers.get(0);
        	for(Float number:numbers ){
        		if(min>number)
        			min=number;
        		if(max<number)
        			max=number;
        		average+=number;
        	}
        	average=average/(float)numbers.size();
        	System.out.println(min+ " "+max+" "+average);
        	Stats obj = new Stats(average,min,max);
        	return obj;
    	}
        return (new Stats(Float.NaN,Float.NaN,Float.NaN));
    }
}
