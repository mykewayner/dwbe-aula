package dwbe.test.view;

import dwbe.test.controller.HotelService;
import dwbe.test.controller.UserService;
import dwbe.test.model.Hotel;
import dwbe.test.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Start implements CommandLineRunner {

    //private final UserService service = new UserService();
    private final HotelService service = new HotelService();
    @Override
    public void run(String... args) throws Exception {
        for(int x = 1; x<=5; x++) {
            service.gravar(new Hotel("hotel" + x));
        }
        Hotel hotel = service.buscarPorHotelName("hotel2");
        hotel.setHotelName("Master");
        service.alterar(hotel);

        for(Hotel hotelaux : service.listar()) {
            System.out.println(hotelaux.getHotelName());
        }
    }
}
