/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Room34.Decameron.interfaces;

import Room34.Decameron.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Administrador
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer>  {
    
}
