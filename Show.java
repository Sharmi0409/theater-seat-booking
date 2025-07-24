package project;

import java.util.HashMap;
import java.util.Map;

public class Show {
	 int showId;
	    String showName;
	    Map<Integer,Boolean> seats= new HashMap<>();

	    public Show(int showId,String showName) 
	    {
	        this.showId = showId;
	        this.showName = showName;
	        
	        for (int i=1;i<=10;i++) 
	        {
	            seats.put(i,true);
	        }
	    }
}