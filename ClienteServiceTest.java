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

        assertFalse(
                service.validarNome("")
        );
    }

    @Test
    public void deveValidarNomeCorretamente() {

        ClienteService service =
                new ClienteService();

        assertTrue(
                service.validarNome("João")
        );
    }
}
