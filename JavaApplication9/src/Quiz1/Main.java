package Quiz1;

/**
 *
 * @author Juan Diego Carrero
 */
public class Main {
    public static void main(String[] args) {
        TravelAgency agencia= new TravelAgency("Aviatur");
        Hotel h1 = new Hotel("Fontanar", "Direcion: Cra. 21a #159a-28");
        agencia.addHotel(h1);
        Travel viaje1 = new Travel ("Fecha: 22/03/2017", 30, h1);
        agencia.addTravel(viaje1);
        Airport a1= new Airport("Jose Maria Cordoba");
        Airport a2= new Airport("El Dorado");
        BookedFlight reservaIda1 = new BookedFlight (1345, "22/03/2017", "22/03/2017", a1, a2);
        viaje1.setOutbound(reservaIda1);
        agencia.addAirport(a1);
        agencia.addAirport(a2);
        BookedFlight reservaVuelta1 = new BookedFlight (6789, "30/03/2017", "30/03/2017", a2, a1);
        viaje1.setRetorno(reservaVuelta1);
        
        Hotel h2 = new Hotel("Milanar", "Direccion: Cra. 30b #80a-45");
        agencia.addHotel(h2);
        Travel viaje2 = new Travel ("Fecha: 28/09/2017", 60, h2);
        agencia.addTravel(viaje2);
        Airport a3 = new Airport ("Camilo Daza");
        Airport a4 = new Airport ("Olaya Herrera");
        agencia.addAirport(a3);
        agencia.addAirport(a4);
        BookedFlight reservaIda2 = new BookedFlight (1143, "28/09/2017", "28/09/2017", a3, a4);
        viaje2.setOutbound(reservaIda2);
        BookedFlight reservaVuelta2 = new BookedFlight (7286, "07/09/2017", "07/09/2017", a4, a3);
        viaje2.setRetorno(reservaVuelta2);
        agencia.listarInfo();
    }
}
