/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteServiceTest {
    
@Test
public void naoDeveAceitarNomeVazio() {

    ClienteService service =
            new ClienteService();

    boolean resultado =
            service.validarNome("");

    assertFalse(resultado);
}

    @Test
    public void deveValidarNomeCorretamente() {

        ClienteService service =
                new ClienteService();

        boolean resultado =
                service.validarNome("João");

        assertTrue(resultado);
        
        
    }
}