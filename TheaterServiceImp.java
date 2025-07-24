package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheaterServiceImp implements TheaterService 
{

    private List<Show> shows = new ArrayList<>();

    public TheaterServiceImp() 
    {
        shows.add(new Show(101, "Avengers"));
        shows.add(new Show(102, "RRR"));
        shows.add(new Show(103, "KGF"));
    }

    public void viewallshows() 
    {
        for (Show s : shows) 
        {
            System.out.println(s.showId + ". " + s.showName);
        }
    }

    public void bookaseat(int showId, int[] seatNos) 
    {
    	 Show show = getShowById(showId);
    	    if (show != null) {
    	        for (int seatNo : seatNos) {
    	            if (show.seats.containsKey(seatNo) && show.seats.get(seatNo)) {
    	                show.seats.put(seatNo, false);
    	                System.out.println("Seat " + seatNo + " booked successfully!");
    	            } else {
    	                System.out.println("Seat " + seatNo + " is already booked or invalid.");
    	            }
    	        }
    	    } else {
    	        System.out.println("Show not found.");
    	    }
    }

    public void cancelaseat(int showId, int seatNo) 
    {
        Show show = getShowById(showId);
        if (show != null) {
            if (show.seats.containsKey(seatNo) && !show.seats.get(seatNo)) 
            {
                show.seats.put(seatNo, true);
                System.out.println("Seat "+seatNo+" cancelled successfully!");
            } 
            else 
            {
                System.out.println("Seat is already available or invalid.");
            }
        } 
        else 
        {
            System.out.println("Show not found.");
        }
    }

    public void seats(int showId) 
    {
        Show show = getShowById(showId);
        if (show != null) 
        {
            System.out.println("Seat Status for Show: " +show.showName);
            for (int i = 1; i <= 10; i++)
            {
                String status = show.seats.get(i)?"Available":"Booked";
                System.out.println("Seat " +i+": "+status);
            }
        }
        else 
        {
            System.out.println("Show not found.");
        }
    }

    private Show getShowById(int id) 
    {
        for(Show s:shows)
        {
            if(s.showId==id) 
            return s;
        }
        return null;
    }
}
