import java.util.Iterator;

public class Censo {
    public static Integer contarAnimaisHospedadosNoHotel(Hotel hotel) {
        int quantidade = 0;
        for (AnimalComponent animal : hotel) {
            if (animal.isHospedado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalAnimaisCadastradosHotel(Hotel hotel) {
        int quantidade = 0;
        for (Iterator<AnimalComponent> it = hotel.iterator(); it.hasNext(); ) {
            quantidade++;
            it.next();
        }
        return quantidade;
    }
}
