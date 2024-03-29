/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Room34.Decameron.repositorio;

import Room34.Decameron.interfaces.InterfaceRoom;
import Room34.Decameron.modelo.Room;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrador
 */
@Repository
public class RepositorioRoom {
    
    @Autowired
    private InterfaceRoom crud;

    public List<Room> getAll(){
        return (List<Room>) crud.findAll();
    }

    public Optional<Room> getRoom(int id){
        return crud.findById(id);
    }

    public Room save(Room room){
        return crud.save(room);
    }
    public void delete(Room room){
        crud.delete(room);
    }
    
}

