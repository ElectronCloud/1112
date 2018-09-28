package Quiz1;

/**
 *
 * @author Juan Diego Carrero
 */
public class Travel {
    private String start;
    private int duration;
    private Hotel hotel;
    private BookedFlight outbound;
    private BookedFlight retorno;

    public Travel(String start, int duration, Hotel hotel) {
        this.start = start;
        this.duration = duration;
        this.hotel = hotel;
        this.outbound= new BookedFlight();
        this.retorno= new BookedFlight();
    }
    
    public Travel(String start, int duration) {
        this.start = start;
        this.duration = duration;
        this.outbound= new BookedFlight();
        this.retorno= new BookedFlight();
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public BookedFlight getOutbound() {
        return outbound;
    }

    public void setOutbound(BookedFlight outbound) {
        this.outbound = outbound;
    }

    public BookedFlight getRetorno() {
        return retorno;
    }

    public void setRetorno(BookedFlight retorno) {
        this.retorno = retorno;
    }

    

    
}
