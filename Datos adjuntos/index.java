import java.util.Scanner;

public class index {
     
    private static Scanner teclado = new Scanner(System.in);
    private static int mayores, menores, edad;
    private static int num1, num2, producto;
    private static int contadorImpares, numeroActual, distancia;
    private static int opcion;

    public static void main(String[] args) {
        do {
            displayMenu();
            opcion = readIntInput("Seleccione un ejercicio (1-20, 0 para salir): ");

            switch (opcion) {
                case 1: ejercicio1(); 
                break;
                case 2: ejercicio2();
                break;
                case 3: ejercicio3(); 
                break;
                case 4: ejercicio4(); 
                break;
                case 5: ejercicio5(); 
                break;
                case 6: ejercicio6(); 
                break;
                case 7: ejercicio7(); 
                break;
                case 8: ejercicio8(); 
                break;
                case 9: ejercicio9(); 
                break;
                case 10: ejercicio10(); 
                break;
                case 11: ejercicio11();
                break;
                case 12: ejercicio12(); 
                break;
                case 13: ejercicio13(); 
                break;
                case 14: ejercicio14(); 
                break;
                case 15: ejercicio15(); 
                break;
                case 16: ejercicio16(); 
                break;
                case 17: ejercicio17(); 
                break;
                case 18: ejercicio18(); 
                break;
                case 19: ejercicio19(); 
                break;
                case 20: ejercicio20(); 
                break;
                case 0: System.out.println("Saliendo del programa..."); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        teclado.close();
    }

    private static void displayMenu() {
        System.out.println("\nMENU DE EJERCICIOS");
        System.out.println("1. Cálculo de la distancia");
        System.out.println("2. Contador de mayores y menores de edad");
        System.out.println("3. Multiplicación por sumas sucesivas");
        System.out.println("4. Mostrar números impares");
        System.out.println("5. Planilla de empleado");
        System.out.println("6. Area de un triangulo");
        System.out.println("7. Conversión de Disco Duro a número de CDs");
        System.out.println("8. Distancia entre dos puntos plano cartesiano");
        System.out.println("9. Verificar si debe solicitar su CUIL");
        System.out.println("10. Comparar edad de dos hermanos");
        System.out.println("11. Evaluación de incentivos por producción semanal");
        System.out.println("12. Determinar el número mayor entre tres números");
        System.out.println("13. Determinar el tipo de triángulo");
        System.out.println("14. Conversión de número entero a número romano (1 al 10)");
        System.out.println("15. Calcular bonificación según monto de venta");
        System.out.println("16. Conversión de número a vocal");
        System.out.println("17. Descomposición en decenas y unidades");
        System.out.println("18. Verificar si un número es par o impar");
        System.out.println("19. Secuencia de números pares");
        System.out.println("20. Cálculo de sueldo promedio");
        System.out.println("0. Salir");
    }

    public static int readIntInput(String message) {
        System.out.print(message);
        while (!teclado.hasNextInt()) {
            System.out.println("Por favor, ingrese un número entero válido.");
            System.out.print(message);
            teclado.next();
        }
        return teclado.nextInt();
    }

    private static double readDoubleInput(String message) {
        System.out.print(message);
        while (!teclado.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido.");
            System.out.print(message);
            teclado.next();
        }
        return teclado.nextDouble();
    }

    private static void ejercicio1() {
        System.out.println("Ejercicio 1: Cálculo de distancia");
        num1 = readIntInput("Introduce la velocidad constante (m/s): ");
        num2 = readIntInput("Introduce el tiempo (segundos): ");
        distancia = num1 * num2;
        System.out.println("La distancia recorrida es: " + distancia + " metros");
    }

    private static void ejercicio2() {
        System.out.println("Ejercicio 2: Contador de edades");
        mayores = 0;
        menores = 0;
        for (int i = 1; i <= 5; i++) {
            edad = readIntInput("Ingrese la edad de la persona " + i + ": ");
            if (edad < 18) {
                menores++;
            } else {
                mayores++;
            }
        }
        System.out.println("Mayores de edad: " + mayores);
        System.out.println("Menores de edad: " + menores);
    }

    private static void ejercicio3() {
        System.out.println("Ejercicio 3: Multiplicación por sumas");
        num1 = readIntInput("Ingrese el primer número: ");
        num2 = readIntInput("Ingrese el segundo número: ");
        producto = 0;
        for (int i = 1; i <= Math.abs(num2); i++) {
            producto += num1;
        }
        if (num2 < 0) producto = -producto;
        System.out.println("Resultado: " + producto);
    }

    private static void ejercicio4() {
        System.out.println("Ejercicio 4: Primeros 10 números impares");
        contadorImpares = 0;
        numeroActual = 1;
        while (contadorImpares < 10) {
            if (numeroActual % 2 != 0) {
                System.out.println(numeroActual);
                contadorImpares++;
            }
            numeroActual++;
        }
    }

    private static void ejercicio5() {
        System.out.println("Ejercicio 5: Planilla de un empleado");
        int horaLaborales = readIntInput("Ingrese la cantidad de horas laborales: ");
        int tarifaPorHora = readIntInput("Ingrese la tarifa por hora: ");
        int planilla = horaLaborales * tarifaPorHora;
        System.out.println("La planilla del empleado es: " + planilla);
    }

    private static void ejercicio6() {
        System.out.println("Ejercicio 6: Área de un triángulo (fórmula de Herón)");
        double ladoA = readDoubleInput("Ingrese la longitud del lado A: ");
        double ladoB = readDoubleInput("Ingrese la longitud del lado B: ");
        double ladoC = readDoubleInput("Ingrese la longitud del lado C: ");
        double semiperimetro = (ladoA + ladoB + ladoC) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * 
                               (semiperimetro - ladoB) * (semiperimetro - ladoC));
        System.out.printf("El área del triángulo es: %.2f\n", area);
    }

    private static void ejercicio7() {
        System.out.println("Ejercicio 7: Conversión de Disco Duro a número de CDs");
        int GB = readIntInput("Ingrese la capacidad del disco duro en GB: ");
        double MG = GB * 1024.0;
        int CD = (int) Math.ceil(MG / 700);
        System.out.println("Se necesitan aproximadamente " + CD + " CD(s) para almacenar " + GB + " GB");
    }

    private static void ejercicio8() {
        System.out.println("Ejercicio 8: Distancia entre dos puntos (plano cartesiano)");
        double AA = readDoubleInput("Ingrese la abscisa del punto A (AA): ");
        double OA = readDoubleInput("Ingrese la ordenada del punto A (OA): ");
        double AB = readDoubleInput("Ingrese la abscisa del punto B (AB): ");
        double OB = readDoubleInput("Ingrese la ordenada del punto B (OB): ");
        double D = Math.sqrt(Math.pow(AB - AA, 2) + Math.pow(OB - OA, 2));
        System.out.printf("La distancia entre los puntos A y B es: %.2f\n", D);
    }

    private static void ejercicio9() {
        System.out.println("Ejercicio 9: Verificar si debe solicitar su CUIL");
        int añoNacimiento = readIntInput("Ingrese el año de nacimiento: ");
        int añoActual = readIntInput("Ingrese el año actual: ");
        int edad1 = añoActual - añoNacimiento;
        System.out.println(edad1 > 17 ? "Debe solicitar su CUIL" : "No debe solicitar su CUIL aún");
    }

    private static void ejercicio10() {
        System.out.println("Ejercicio 10: Comparar edades de dos hermanos");
        int edadPrimerHermano = readIntInput("Ingrese la edad del primer hermano: ");
        int edadSegundoHermano = readIntInput("Ingrese la edad del segundo hermano: ");
        if (edadPrimerHermano > edadSegundoHermano) {
            System.out.println("El primer hermano es el mayor por " + 
                              (edadPrimerHermano - edadSegundoHermano) + " año(s).");
        } else if (edadSegundoHermano > edadPrimerHermano) {
            System.out.println("El segundo hermano es el mayor por " + 
                              (edadSegundoHermano - edadPrimerHermano) + " año(s).");
        } else {
            System.out.println("Ambos hermanos tienen la misma edad.");
        }
    }

    private static void ejercicio11() {
        System.out.println("Ejercicio 11: Evaluación de incentivos por producción semanal");
        int[] produccion = new int[6];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        int produccionTotal = 0;
        for (int i = 0; i < 6; i++) {
            produccion[i] = readIntInput("Ingrese la producción del día " + dias[i] + ": ");
            produccionTotal += produccion[i];
        }
        double produccionPromedio = produccionTotal / 6.0;
        System.out.println("Producción total: " + produccionTotal);
        System.out.printf("Promedio de producción diaria: %.2f\n", produccionPromedio);
        System.out.println(produccionPromedio >= 100 ? "Recibirá Incentivos" : "No Recibirá Incentivos");
    }

    private static void ejercicio12() {
        System.out.println("Ejercicio 12: Determinar el número mayor entre tres enteros");
        int primerNumero = readIntInput("Ingrese el primer número entero: ");
        int segundoNumero = readIntInput("Ingrese el segundo número entero: ");
        int tercerNumero = readIntInput("Ingrese el tercer número entero: ");
        int numeroMayor = Math.max(primerNumero, Math.max(segundoNumero, tercerNumero));
        System.out.println("El número mayor es: " + numeroMayor);
    }

    private static void ejercicio13() {
        System.out.println("Ejercicio 13: Determinar el tipo de triángulo");
        int primerLado = readIntInput("Ingrese la longitud del primer lado: ");
        int segundoLado = readIntInput("Ingrese la longitud del segundo lado: ");
        int tercerLado = readIntInput("Ingrese la longitud del tercer lado: ");
        String tipoTriangulo;
        if (primerLado != segundoLado && segundoLado != tercerLado && tercerLado != primerLado) {
            tipoTriangulo = "Escaleno";
        } else if (primerLado == segundoLado && segundoLado == tercerLado) {
            tipoTriangulo = "Equilátero";
        } else {
            tipoTriangulo = "Isósceles";
        }
        System.out.println("El triángulo es: " + tipoTriangulo);
    }

    private static void ejercicio14() {
        System.out.println("Ejercicio 14: Conversión de número entero a número romano (1 al 10)");
        int numeroEntero = readIntInput("Ingrese un número entero del 1 al 10: ");
        String[] romanos = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String equivalenteRomano = (numeroEntero >= 1 && numeroEntero <= 10) ? 
                                 romanos[numeroEntero - 1] : "Número fuera de rango (1-10)";
        System.out.println("Equivalente en número romano: " + equivalenteRomano);
    }

    private static void ejercicio15() {
        System.out.println("Ejercicio 15: Calcular bonificación según monto de venta");
        double montoVenta = readDoubleInput("Ingrese el monto de venta: ");
        double totalBonificacion;
        if (montoVenta >= 0 && montoVenta < 1000) {
            totalBonificacion = 0;
        } else if (montoVenta < 5000) {
            totalBonificacion = montoVenta * 0.03;
        } else if (montoVenta < 20000) {
            totalBonificacion = montoVenta * 0.05;
        } else {
            totalBonificacion = montoVenta * 0.08;
        }
        System.out.printf("Total de bonificación: %.2f\n", totalBonificacion);
    }

    private static void ejercicio16() {
        System.out.println("Ejercicio 16: Conversión de número a vocal");
        int numeroE = readIntInput("Ingrese un número entero del 1 al 5: ");
        String[] vocales = {"A", "E", "I", "O", "U"};
        String vocal = (numeroE >= 1 && numeroE <= 5) ? vocales[numeroE - 1] : "Valor Incorrecto";
        System.out.println("Vocal: " + vocal);
    }

    private static void ejercicio17() {
        System.out.println("Ejercicio 17: Descomposición en decenas y unidades");
        int numeroEntero3 = readIntInput("Ingrese un número entero de 2 dígitos: ");
        if (numeroEntero3 >= 10 && numeroEntero3 <= 99) {
            int decenas = numeroEntero3 / 10;
            int unidades = numeroEntero3 % 10;
            System.out.println("Número de decenas: " + decenas);
            System.out.println("Número de unidades: " + unidades);
        } else {
            System.out.println("Número incorrecto, debe ser de 2 dígitos.");
        }
    }

    private static void ejercicio18() {
        System.out.println("Ejercicio 18: Verificar si un número es par o impar");
        int numeroEntero4 = readIntInput("Ingrese un número entero: ");
        System.out.println(numeroEntero4 % 2 == 0 ? "Es Par" : "Es Impar");
    }

    private static void ejercicio19() {
        System.out.println("Ejercicio 19: Secuencia de números pares");
        int N = 2;
        for (int i = 0; i < 5; i++) {
            System.out.println(N);
            N += 2;
        }
    }

    private static void ejercicio20() {
        System.out.println("Ejercicio 20: Cálculo de sueldo promedio");
        int numeroEmpleados = readIntInput("Ingrese el número de empleados: ");
        if (numeroEmpleados <= 0) {
            System.out.println("Número de empleados inválido.");
            return;
        }
        double sumaSueldos = 0;
        for (int i = 1; i <= numeroEmpleados; i++) {
            sumaSueldos += readDoubleInput("Ingrese el sueldo del empleado " + i + ": ");
        }
        double sueldoPromedio = sumaSueldos / numeroEmpleados;
        System.out.printf("Sueldo promedio: %.2f\n", sueldoPromedio);
    }
}