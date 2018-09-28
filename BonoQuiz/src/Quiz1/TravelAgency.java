package Quiz1;

/**
 *
 * @author Juan Diego Carrero
 */
public class TravelAgency {
    private String name;
    private Hotel[] knownHotels;
    private Travel[] offeredTravels;
    private Airport[] airports;
    private int cont1=0;
    private int cont2=0;
    private int cont3=0;
    
    public TravelAgency(String name){
        this.name=name;
        this.knownHotels=new Hotel[5];
        this.offeredTravels=new Travel[10];
        this.airports=new Airport[4];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hotel[] getKnownHotels() {
        return knownHotels;
    }

    public void setKnownHotels(Hotel[] knownHotels) {
        this.knownHotels = knownHotels;
    }

    public Travel[] getOfferedTravels() {
        return offeredTravels;
    }

    public void setOfferedTravels(Travel[] offeredTravels) {
        this.offeredTravels = offeredTravels;
    }

    public Airport[] getAirports() {
        return airports;
    }

    public void setAirports(Airport[] airports) {
        this.airports = airports;
    }
    
    public void addHotel(Hotel hotel){
                this.knownHotels[cont1]=hotel;
                cont1++;
    }
    
    public void addTravel (Travel travel){
                this.offeredTravels[cont2]=travel;
                cont2++;
    }
    
    public void addAirport (Airport airport){
                this.airports[cont3]=airport;
                cont3++;
    }
    
    public void listarInfo(){
        for(int i=0; i<offeredTravels.length; i++){
            if(offeredTravels[i]!=null){
            System.out.println("Viaje: "+(i+1));
            System.out.println("Numero de reserva del vuelo de salida: "+
                    TravelAgency.this.offeredTravels[i].getOutbound().getFlightNumber());
            System.out.println("Descripcion del aeropuerto de salida: "+
                    TravelAgency.this.offeredTravels[i].getOutbound().getFrom().getDescription());
            System.out.println("Numero de reserva del vuelo de retorno: "+
                    TravelAgency.this.offeredTravels[i].getRetorno().getFlightNumber());
            System.out.println("Descripcion del aeropuerto: "+
                    TravelAgency.this.offeredTravels[i].getRetorno().getFrom().getDescription());
                System.out.println();
        }
        }
    }
}
