package casco;

public class CascoRunico implements ProteccionElemental {

    public String resistirAtaque(String elemento) {
        if ("FUEGO".equalsIgnoreCase(elemento)
                || "HIELO".equalsIgnoreCase(elemento)
                || "RAYO".equalsIgnoreCase(elemento)
                || "MAGICO".equalsIgnoreCase(elemento)) {
            return "Ataque de " + elemento + " resistido por las runas";
        }
        return "CASCO RUNICO: Las runas no cubren ataques de " + elemento;
    }
}