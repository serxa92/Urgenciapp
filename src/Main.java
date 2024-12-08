import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int NUSS, sintoma, exploracion;
        double temperatura;

        // Ingreso de NUSS con validación

        System.out.println("+--------------+---------------------------+");
        System.out.println("****** INTRODUZCA SU NUSS ******");
        System.out.println("+--------------+---------------------------+");
        NUSS = scn.nextInt();

        // Validación de NUSS

        while (NUSS < 111111 || NUSS > 999999) {
            System.out.println("+--------------+---------------------------+");
            System.out.println("NUSS inválido. Ingresa el NUSS de nuevo.");
            System.out.println("+--------------+---------------------------+");
            NUSS = scn.nextInt();
        }

        // Ingreso de la temperatura corporal

        System.out.println("+--------------+---------------------------+");
        System.out.println("Indique cual es la temperatura corporal:");
        System.out.println("+--------------+---------------------------+");
        temperatura = scn.nextDouble();

        // Validación de la temperatura

        while (temperatura < 27 || temperatura > 45) {
            System.out.println("+--------------+---------------------------+---------------------------+------+");
            System.out.println("Temperatura fuera de rango. Ingresa una temperatura entre 27 y 45 grados.");
            System.out.println("+--------------+---------------------------+---------------------------+------+");
            temperatura = scn.nextDouble();
        }

        // Ingreso del síntoma

        System.out.println("+--------------+---------------------------+");
        System.out.println("Indique un sintoma:\n(0).Dolor\n(1).Lesion traumatica\n(2).Fiebre alta\n(3).Confusion o desorientacion");
        System.out.println("+--------------+---------------------------+");
        sintoma = scn.nextInt();

        // Validación del síntoma

        while (sintoma < 0 || sintoma > 3) {
            System.out.println("+--------------+---------------------------+");
            System.out.println("Síntoma inválido. Ingresa una opción entre 0 y 3.:\n(0).Dolor\n(1).Lesion traumatica\n(2).Fiebre alta\n(3).Confusion o desorientacion");
            System.out.println("+--------------+---------------------------+");
            sintoma = scn.nextInt();
        }
        String descripcionSintoma = "";
        if (sintoma == 0) {
            descripcionSintoma = "Dolor";
        } else if (sintoma == 1) {
            descripcionSintoma = "Lesión traumática";
        } else if (sintoma == 2) {
            descripcionSintoma = "Fiebre alta";
        } else if (sintoma == 3) {
            descripcionSintoma = "Confusión o desorientación";
        }

        // Ingreso de la exploración asociada al síntoma
        System.out.println("+--------------+---------------------------+-------+");
        System.out.println("Introduce la exploración asociada a su síntoma:");
        System.out.println("+--------------+---------------------------+-------+");

        if (sintoma == 0) {
            System.out.println("+--------------+---------------------------+-------+");
            System.out.println("(0).Dolor toracico\n(1).Dolor abdominal\n(2).Fiebre alta\n(3).Migraña");
            System.out.println("+--------------+---------------------------+-------+");
            exploracion = scn.nextInt();
        } else if (sintoma == 1) {
            System.out.println("+--------------+---------------------------+-------+");
            System.out.println("(0).Fractura ósea\n(1).Herida de bala\n(2).Quemadura\n(3).Lesión cerebral traumática");
            System.out.println("+--------------+---------------------------+-------+");
            exploracion = scn.nextInt();
        } else if (sintoma == 2) {
            System.out.println("+--------------+---------------------------+-------+");
            System.out.println("(0).Neumonía\n(1).Meningitis\n(2).Infección viral\n(3).Reacción alérgica");
            System.out.println("+--------------+---------------------------+-------+");
            exploracion = scn.nextInt();
        } else {
            System.out.println("+--------------+---------------------------+-------+");
            System.out.println("(0).Intoxicación por drogas o alcohol\n(1).Deshidratación severa\n(2).Accidente cerebrovascular\n(3).Hipoglucemia severa");
            System.out.println("+--------------+---------------------------+-------+");
            exploracion = scn.nextInt();
        }

        // Validación de la exploración

        while (exploracion < 0 || exploracion > 3) {
            System.out.println("+--------------+---------------------------+-------+");
            System.out.println("Exploración inválida. Ingresa una opción entre 0 y 3.");
            System.out.println("+--------------+---------------------------+-------+");
            exploracion = scn.nextInt();
        }
        String descripcionExploracion = "";
        if (sintoma == 0) {
            if (exploracion == 0) descripcionExploracion = "Dolor torácico";
            else if (exploracion == 1) descripcionExploracion = "Dolor abdominal";
            else if (exploracion == 2) descripcionExploracion = "Fiebre alta";
            else if (exploracion == 3) descripcionExploracion = "Migraña";
        } else if (sintoma == 1) {
            if (exploracion == 0) descripcionExploracion = "Fractura ósea";
            else if (exploracion == 1) descripcionExploracion = "Herida de bala";
            else if (exploracion == 2) descripcionExploracion = "Quemadura";
            else if (exploracion == 3) descripcionExploracion = "Lesión cerebral traumática";
        } else if (sintoma == 2) {
            if (exploracion == 0) descripcionExploracion = "Neumonía";
            else if (exploracion == 1) descripcionExploracion = "Meningitis";
            else if (exploracion == 2) descripcionExploracion = "Infección viral";
            else if (exploracion == 3) descripcionExploracion = "Reacción alérgica";
        } else if (sintoma == 3) {
            if (exploracion == 0) descripcionExploracion = "Intoxicación por drogas o alcohol";
            else if (exploracion == 1) descripcionExploracion = "Deshidratación severa";
            else if (exploracion == 2) descripcionExploracion = "Accidente cerebrovascular";
            else if (exploracion == 3) descripcionExploracion = "Hipoglucemia severa";
        }

        // Cálculo del nivel de prioridad

        int nivelPrioridad = sintoma + exploracion;
        System.out.println("+--------------+---------------------------+");
        System.out.println("Nivel de prioridad: " + nivelPrioridad);
        System.out.println("+--------------+---------------------------+");

        // Mostrar resultados finales
        System.out.println("+--------------+---------------------------+--------------------------+-------------------+------------------------+");
        System.out.println("| NUSS         | Síntoma                   | Exploración              | Nivel de prioridad| Temperatura actual     |");
        System.out.println("+--------------+---------------------------+--------------------------+-------------------+------------------------+");
        System.out.printf("| %-12d | %-25s | %-24s | %-17d | %-22.1f |\n", NUSS, descripcionSintoma, descripcionExploracion, nivelPrioridad, temperatura);
        System.out.println("+--------------+---------------------------+--------------------------+-------------------+------------------------+");
        }
    }
