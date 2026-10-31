package serveur;

import jakarta.xml.ws.Endpoint;
import service.Calculatrice;

public class ServeurJWS {

    public static void main(String[] args) {
        String url = "http://localhost:8084/calculatrice";

        System.out.println("Demarrage du service web SOAP CalculatriceWS...");
        Endpoint.publish(url, new Calculatrice());

        System.out.println("Service publie avec succes !");
        System.out.println("WSDL accessible sur : " + url + "?wsdl");
    }
}

