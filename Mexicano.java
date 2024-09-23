import java.util.Scanner;

public class Mexicano {

    public static void main(String[] args) {
        mexicano1.menu();
    }

    static Mexicano mexicano1 = new Mexicano();

    public void generarCurp() {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Bienvenido!\nIngrese su primer nombre: ");

        String primerNombre = leerDatos.nextLine();

        System.out.println("Ingrese su segundo nombre: (Enter si no tiene)");
        String segundoNombre = leerDatos.nextLine();

        System.out.println("Ingrese su apellido paterno: ");
        String apellidoPaterno = leerDatos.nextLine();

        System.out.println("Ingrese su apellido materno: ");
        String apellidoMaterno = leerDatos.nextLine();

        System.out.println("Ingrese dia de nacimiento: (formato: dd)");
        String diaNacimiento = leerDatos.nextLine();

        System.out.println("Ingrese mes de nacimiento: (formato: mm)");
        String mesNacimiento = leerDatos.nextLine();

        System.out.println("Ingrese año de nacimiento: (formato: aaaa)");
        String nacimiento = leerDatos.nextLine();

        System.out.println("Es hombre o mujer (H / M): ");
        String genero = leerDatos.nextLine();

        if (genero.equalsIgnoreCase("H")) {
            genero = "H";
        } else {
            genero = "M";
        }

        System.out.println("En que estado naciste?: ");
        String estado = leerDatos.nextLine();
        String estadoNuevo = "";

        if (estado.equalsIgnoreCase("Baja California")) {
            estadoNuevo = "BC";
        } else if (estado.equalsIgnoreCase("AguasCalientes")) {
            estadoNuevo = "AS";
        } else if (estado.equalsIgnoreCase("Baja california sur")) {
            estadoNuevo = "BS";
        } else if (estado.equalsIgnoreCase("Campeche")) {
            estadoNuevo = "CC";
        } else if (estado.equalsIgnoreCase("coahuila")) {
            estadoNuevo = "CL";
        } else if (estado.equalsIgnoreCase("colima")) {
            estadoNuevo = "CM";
        } else if (estado.equalsIgnoreCase("chiapas")) {
            estadoNuevo = "CS";
        } else if (estado.equalsIgnoreCase("chihuahua")) {
            estadoNuevo = "CH";
        } else if (estado.equalsIgnoreCase("distrito federal")) {
            estadoNuevo = "DF";
        } else if (estado.equalsIgnoreCase("durango")) {
            estadoNuevo = "DG";
        } else if (estado.equalsIgnoreCase("guanajuato")) {
            estadoNuevo = "GT";
        } else if (estado.equalsIgnoreCase("guerrero")) {
            estadoNuevo = "GR";
        } else if (estado.equalsIgnoreCase("hidalgo")) {
            estadoNuevo = "HG";
        } else if (estado.equalsIgnoreCase("jalisco")) {
            estadoNuevo = "JC";
        } else if (estado.equalsIgnoreCase("mexico")) {
            estadoNuevo = "MC";
        } else if (estado.equalsIgnoreCase("michoacan")) {
            estadoNuevo = "MN";
        } else if (estado.equalsIgnoreCase("morelos")) {
            estadoNuevo = "MS";
        } else if (estado.equalsIgnoreCase("nayarit")) {
            estadoNuevo = "NT";
        } else if (estado.equalsIgnoreCase("nuevo leon")) {
            estadoNuevo = "NL";
        } else if (estado.equalsIgnoreCase("oaxaca")) {
            estadoNuevo = "OC";
        } else if (estado.equalsIgnoreCase("puebla")) {
            estadoNuevo = "PL";
        } else if (estado.equalsIgnoreCase("queretaro")) {
            estadoNuevo = "QT";
        } else if (estado.equalsIgnoreCase("quintana roo")) {
            estadoNuevo = "QR";
        } else if (estado.equalsIgnoreCase("san luis potosi")) {
            estadoNuevo = "SP";
        } else if (estado.equalsIgnoreCase("sinaloa")) {
            estadoNuevo = "SL";
        } else if (estado.equalsIgnoreCase("sonora")) {
            estadoNuevo = "SR";
        } else if (estado.equalsIgnoreCase("tabasco")) {
            estadoNuevo = "TC";
        } else if (estado.equalsIgnoreCase("tamaulipas")) {
            estadoNuevo = "TS";
        } else if (estado.equalsIgnoreCase("tlaxcala")) {
            estadoNuevo = "TL";
        } else if (estado.equalsIgnoreCase("veracruz")) {
            estadoNuevo = "VZ";
        } else if (estado.equalsIgnoreCase("yucatan")) {
            estadoNuevo = "YN";
        } else if (estado.equalsIgnoreCase("zacatecas")) {
            estadoNuevo = "ZS";
        } else if (estado.equalsIgnoreCase("extranjero")) {
            estadoNuevo = "NE";
        } else {
            estadoNuevo = "NE";
        }

        int homoclaveUno = (int) (Math.random() * 9) + 1;
        int homoclaveDos = (int) (Math.random() * 9) + 1;

        String primerCaracter = apellidoPaterno.substring(0, 1);
        String segundoCaracter = apellidoPaterno.substring(1, 2);
        String tercerCaracter = apellidoMaterno.substring(0, 1);
        String cuartoCaracter = primerNombre.substring(0, 1);
        String quintoSextoCaracter = nacimiento.substring(2, 4);
        String septimoOctavoCaracter = mesNacimiento.substring(0, 2);
        String novenoDecimoCaracter = diaNacimiento.substring(0, 2);
        String onceavoCaracter = genero.substring(0, 1);
        String doceavoTreceCaracter = estadoNuevo;
        String CatorceCaracter = apellidoPaterno.replaceAll("[AEIOUaeiou]", "").substring(1, 2);
        String quinceCaracter = apellidoMaterno.replaceAll("[AEIOUaeiou]", "").substring(1, 2);
        String dieciseisCaracter = primerNombre.replaceAll("[AEIOUaeiou]", "").substring(1, 2);

        String curp = primerCaracter + segundoCaracter + tercerCaracter + cuartoCaracter + quintoSextoCaracter +
                septimoOctavoCaracter + novenoDecimoCaracter + onceavoCaracter + doceavoTreceCaracter + CatorceCaracter +
                quinceCaracter + dieciseisCaracter + homoclaveUno + homoclaveDos;
        System.out.println("Su curp es " + curp);
    }

    public void generarRFC() {
        Scanner leerDatos = new Scanner(System.in);

        System.out.println("Bienvenido!\nIngrese su primer nombre: ");
        String primerNombre = leerDatos.nextLine();

        System.out.println("Ingrese su segundo nombre: (Enter si no tiene)");
        String segundoNombre = leerDatos.nextLine();

        System.out.println("Ingrese su apellido paterno: ");
        String apellidoPaterno = leerDatos.nextLine();

        System.out.println("Ingrese su apellido materno: ");
        String apellidoMaterno = leerDatos.nextLine();

        System.out.println("Ingrese dia de nacimiento: (formato: dd)");
        String diaNacimiento = leerDatos.nextLine();

        System.out.println("Ingrese mes de nacimiento: (formato: mm)");
        String mesNacimiento = leerDatos.nextLine();

        System.out.println("Ingrese año de nacimiento: (formato: aaaa)");
        String nacimiento = leerDatos.nextLine();

        int rfcUno = (int) (Math.random() * 9) + 1;
        int rfcDos = (int) (Math.random() * 9) + 1;
        int rfcTres = (int) (Math.random() * 9) + 1;

        String primerCaracterRFC = apellidoPaterno.substring(0, 1);
        String segundoCaracterRFC = apellidoPaterno.substring(1, 2);
        String tercerCaracterRFC = apellidoMaterno.substring(0, 1);
        String cuartoCaracterRFC = primerNombre.substring(0, 1);
        String quintoSextoCaracterRFC = nacimiento.substring(2, 4);
        String septimoOctavoCaracterRFC = mesNacimiento.substring(0, 2);
        String novenoDecimoCaracterRFC = diaNacimiento.substring(0, 2);

        String rfc = primerCaracterRFC + segundoCaracterRFC + tercerCaracterRFC + cuartoCaracterRFC +
                quintoSextoCaracterRFC + septimoOctavoCaracterRFC + novenoDecimoCaracterRFC + rfcUno + rfcDos + rfcTres;
        System.out.println("Tu RFC es: " + rfc);
    }

    public void menu() {
        Scanner leerDatos = new Scanner(System.in);

        System.out.println("Bienvenido!, selecciona una opcion: \n1.Sacar Curp\n2.Sacar RFC\nElige una opcion: ");
        int opcion = leerDatos.nextInt();

        switch (opcion) {
            case 1:
                mexicano1.generarCurp();
                break;
            case 2:
                mexicano1.generarRFC();
                break;
            default:
                System.out.println("Elige una opcion valida.");
        }
    }
}
