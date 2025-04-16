import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {
    @Test
    void deveContarAnimaisHospedadosComServicos() {
        AnimalComponent a1 = new Banho(new Animal("Marie", true, new Tutor("Nathalia")));
        AnimalComponent a2 = new ConsultaVeterinaria(new Animal("Nina", false, new Tutor("Nathalia")));
        AnimalComponent a3 = new ConsultaVeterinaria(new Banho(new Animal("Thor", true, new Tutor("Marco"))));

        Hotel hotel = new Hotel(a1, a2, a3);

        assertEquals(2, Censo.contarAnimaisHospedadosNoHotel(hotel));
    }

}