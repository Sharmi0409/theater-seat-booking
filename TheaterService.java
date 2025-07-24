package project;

public interface TheaterService 
{
	void viewallshows();
	void bookaseat(int showId,int[] seatNos);
	void cancelaseat(int showId,int seatNo);
	void seats(int showId);
}
