package ecualine;

public class fracciones {
    /**
     * @param decFraccion Convierte un numero decimal a fracción
     * @return Retorna la fracción
     */
    public static String decFraccion(double num) {
        String cadena = Double.toString(num);
        if (num - Math.floor(num) == 0) {
            return Integer.toString((int) num);
        } else {
            if (cadena.length() >= 13) {
                return fracGeratriz(num);
            } else {
                int cont = 0, numAb = 1, k = 1;
                double numAr = 0;
                for (int i = cadena.length(); !(cadena.substring(i - 1, i).equals(".")); i--) {
                    cont++;//Determina cuantos digitos hay despues del punto.
                }
                for (int i = 0; i <= cont; i++) {//Operaciones correspondientes
                    numAr = (cont == i) ? num * k : numAr;
                    numAb = (cont == i) ? numAb * k : numAb;
                    k *= 10;
                }
                return simplFrac(numAr, numAb);
            }
        }
    }

    /**
     * @param fracGeratriz Obtiene la fracción geratríz de un numero decimal
     * infinito puro e impuro
     * @return Retorna la fracción geratríz
     */
    public static String fracGeratriz(double x) {
        double numDec = (x < 0) ? x * -1 : x, y = 0, z = 0;
        int i = 0, cont = 1, w = 0;
        boolean band = true;
        String cadena = Double.toString(numDec), resultado = "";
        do {
            if (cadena.substring(i, i + 1).equals(".")) {
                int k = i + 1;
                //do {
                    String a = cadena.substring(k, k + 1);//1
                    for (int j = k + 1; j <= 13; j++) {
                        if (a.equals(cadena.substring(j, j + 1))) {
                            cont *= 10;
                            break;
                        } else {
                            cont *= 10;
                        }
                    }
                //    k++;
                //} while (k < cadena.length());
                band = false;
            }
            i++;
        } while (band == true);
        y = numDec * cont;
        z = y - numDec;
        z = (x < 0) ? z * -1 : z;
        w = cont - 1;
        System.out.println(cadena.length());
        return simplFrac(Math.round(z), w);
    }

    /**
     * @param simplFrac Método para simplificar una fracción
     * @return Retorna una fracción simplificada
     */
    public static String simplFrac(double x, int y) {
        int numAr = (int) Math.round(x);
        int numAb = y, i = 2;
        do {//Simplifico la fraccion obtenida
            if ((numAr % i == 0) && (numAb % i == 0)) {
                numAr /= i;
                numAb /= i;
            } else {
                i++;
            }
        } while (i <= 40);
        if (numAr % numAb == 0) {
            int r = numAr / numAb;
            return Integer.toString(r);
        } else {
            return (int) numAr + "/" + numAb;
        }
    }
}
