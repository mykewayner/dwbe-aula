package dwbe.test.controller;

import dwbe.test.model.Hotel;
import dwbe.test.model.User;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    private List<Hotel> database = new ArrayList<>();

    public void gravar(Hotel hotel){
        database.add(hotel);
    }

    public void alterar(Hotel hotel) {
        int index = database.indexOf(hotel);
        if(index > 0){
            database.set(index, hotel);
        }
    }

    public Hotel buscarPorHotelName(String hotelName){
        int index = database.indexOf(new Hotel(hotelName));
        if(index < 0){
            return new Hotel();
        }
        Hotel selectHotel = database.get(index);
        return selectHotel;
    }

    public List<Hotel> listar(){
        return database;
    }
}
