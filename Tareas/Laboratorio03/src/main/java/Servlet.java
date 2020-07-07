
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    List<Periferico> perifericos = new ArrayList<Periferico>();
    UnidadCentral unidadC;
    Mouse mouse;
    Teclado teclado;
    Impresora impresora;
    Ordenador ordenador;
    TabletaGrafica tableta;
    PantallaTactil pantallaT;
    Pantalla pantalla;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String uc = request.getParameter("UnidadCentral");
        String PeriN = request.getParameter("periferico");
        String PeriE = request.getParameter("periferico1");
        int i = Integer.parseInt(request.getParameter("incremento")) + 1;
        int j = Integer.parseInt(request.getParameter("increment")) + 1;
        int k = Integer.parseInt(request.getParameter("incremen")) + 1;
        if (uc.compareToIgnoreCase("AMD") == 0) {
            unidadC = new UnidadCentral("AMD"," Ryzen 5 2da gen", 1699);
        } else if (uc.compareToIgnoreCase("Intel7") == 0) {
            unidadC = new UnidadCentral("Intel", "i7 7ma gen", 1500);
        } else {
            unidadC = new UnidadCentral("Intel", "i9 9na gen", 2099);
        }
        if(PeriN != null) {
            for (int s = 0; s < i; s++) {
                if (request.getParameter("DispositivoEntrada" + s).compareToIgnoreCase("teclado") == 0) {
                    teclado = new Teclado("Halion","Teclado HA-K640", 40);
                    perifericos.add(teclado);
                } else if (request.getParameter("DispositivoEntrada" + s).compareToIgnoreCase("mouse") == 0) {
                    mouse = new Mouse("Halion","Mouse HA-m816", 30);
                    perifericos.add(mouse);
                } else {
                    tableta = new TabletaGrafica("Wacon","Tableta gráfica ", 250);
                    perifericos.add(tableta);
                }
            }
            for (int s = 0; s < j; s++) {
                if (request.getParameter("DispositivoSalida" + s).compareToIgnoreCase("monitor") == 0) {
                    pantalla = new Pantalla("LG","Monitor L132", 100);
                    perifericos.add(pantalla);
                } else if (request.getParameter("DispositivoSalida" + s).compareToIgnoreCase("impresoraI") == 0) {
                    impresora = new ImpresoraTinta("HP","Impresora Inyeccion tinta K231", 700);
                    perifericos.add(impresora);
                } else {
                    impresora = new ImpresoraLaser("Canon","Impresora Laser T134", 480);
                    perifericos.add(impresora);
                }
            }
        }
        if (PeriE != null) {
            for (int s = 0; s < k; s++) {
                if (request.getParameter("DispositivoES" + s).compareToIgnoreCase("pantallaT") == 0) {
                    pantallaT = new PantallaTactil("Dell","Pantalla Táctil M12545", 1345);
                    perifericos.add(pantallaT);
                }
            }
        }
        ordenador = new Ordenador(unidadC, perifericos);
        PrintWriter out = response.getWriter();
        out = response.getWriter();
        out.print("<html");
        out.print("<body>");
        out.print("El precio a pagar es: " + ordenador.getPrecio());
        out.print("<br/>");
        out.print("</body>");
        out.print("</html>");

    }
}
