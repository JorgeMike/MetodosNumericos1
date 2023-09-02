package funcion;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import unidadtres.inversionMatricesParticionadas;

/**
 * pow
 *
 * @author Jorge Alvarado
 */
public class matriz {

    DecimalFormat rd = new DecimalFormat("###.#####");

    public void obtenerCofactor(double[][] matriz, double[][] auxiliar, int p, int q, int n) {
        //p y q son cordenadas de la matriz  
        int i = 0, j = 0;
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                if (fila != p && columna != q) {
                    auxiliar[i][j++] = matriz[fila][columna];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }//llena
    }

    public int determinanteMatriz(double[][] matriz, int n) {
        double determinante = 0;
        if (n == 1) {
            return (int) matriz[0][0];
        }
        double[][] auxiliar = new double[n][n];
        int multiplicador = 1;
        for (int i = 0; i < n; i++) {
            obtenerCofactor(matriz, auxiliar, 0, i, n);
            determinante += multiplicador * matriz[0][i] * determinanteMatriz(auxiliar, n - 1);
            multiplicador = -multiplicador;
        }
        return (int) determinante;
    }

    public double[][] particionMatriz(double[][] matrizA, int dimension, int condicion) {

        switch (condicion) {

            case 11:
                double[][] auxiliarA11 = new double[2][2]; //<--

                for (int fila = 0; fila < 2; fila++) {
                    for (int columna = 0; columna < 2; columna++) {
                        auxiliarA11[fila][columna] = matrizA[fila][columna];
                    }
                }
                return auxiliarA11;

            case 12:
                double[][] auxiliarA12 = new double[2][dimension - 2]; //<--

                for (int fila = 0; fila < 2; fila++) {
                    for (int columna = 2; columna < dimension; columna++) {
                        auxiliarA12[fila][columna - 2] = matrizA[fila][columna];
                    }
                }
                return auxiliarA12;

            case 21:
                double[][] auxiliarA21 = new double[dimension - 2][2]; //<--

                for (int fila = 2; fila < dimension; fila++) {
                    for (int columna = 0; columna < 2; columna++) {
                        auxiliarA21[fila - 2][columna] = matrizA[fila][columna];
                    }
                }
                return auxiliarA21;

            case 22:
                double[][] auxiliarA22 = new double[dimension - 2][dimension - 2]; //<--

                for (int fila = 2; fila < dimension; fila++) {
                    for (int columna = 2; columna < dimension; columna++) {
                        auxiliarA22[fila - 2][columna - 2] = matrizA[fila][columna];
                    }
                }
                return auxiliarA22;

            default:
                inversionMatricesParticionadas error = new inversionMatricesParticionadas();
                JOptionPane.showMessageDialog(error, "Algo salio mal", "ERROR", JOptionPane.ERROR_MESSAGE);
                return matrizA;

        }
    }

    public double[][] particionVector(double[] vectorB, int dimension, int condicion) {

        switch (condicion) {
            case 1:
                double[][] b1 = new double[dimension - (dimension - 2)][1];
                for (int i = 0; i < b1.length; i++) {
                    for (int j = 0; j < b1[0].length; j++) {
                        b1[i][j] = vectorB[i];
                    }
                }
                return b1;
            case 2:
                double[][] b2 = new double[dimension - 2][1];
                for (int i = 0; i < b2.length; i++) {
                    for (int j = 0; j < b2[0].length; j++) {
                        b2[i][j] = vectorB[i + 2];
                    }
                }
                return b2;
            default:
                inversionMatricesParticionadas error = new inversionMatricesParticionadas();
                JOptionPane.showMessageDialog(error, "Algo salio mal", "ERROR", JOptionPane.ERROR_MESSAGE);
                double[][] error2 = new double[0][0];
                return error2;
        }

    }

    public double[][] matrizInversa(double[][] matriz, int dimension) {

        float temp;

        //Creamos la matriz auxiliar de columnas n*2
        double[][] auxiliar = new double[dimension][dimension * 2];
        double temp2;
        //Guardamos los valores que ya tenemos en la matriz auxiliar
        for (int renglon = 0; renglon < dimension; renglon++) {
            for (int columna = 0; columna < dimension; columna++) {
                auxiliar[renglon][columna] = matriz[renglon][columna];
            }
        }

        //Agregamos la identidad a la matriz
        for (int renglon = 0; renglon < dimension; renglon++) {
            for (int columna = 0; columna < dimension * 2; columna++) {
                if (columna == (dimension + renglon)) {
                    auxiliar[renglon][columna] = 1;
                }
            }
        }

        for (int i = dimension - 1; i > 0; i--) {
            if (matriz[i - 1][0] < matriz[i][0]) {
                for (int j = 0; j < 2 * dimension; j++) {

                    temp = (float) auxiliar[i][j];
                    auxiliar[i][j] = auxiliar[i - 1][j];
                    auxiliar[i - 1][j] = temp;
                }
            }
        }

        for (int renglon = 0; renglon < dimension; renglon++) {

            temp = (float) auxiliar[renglon][renglon];
            for (int columna = 0; columna < 2 * dimension; columna++) {

                auxiliar[renglon][columna] = auxiliar[renglon][columna] / temp;
            }

            for (int rengloni = 0; rengloni < dimension; rengloni++) {

                for (int columna = 0; columna < dimension; columna++) {

                    if (columna != rengloni) {

                        temp = (float) (auxiliar[columna][rengloni] / auxiliar[rengloni][rengloni]);
                        for (int i = 0; i < 2 * dimension; i++) {

                            auxiliar[columna][i] -= auxiliar[rengloni][i] * temp;
                        }
                    }
                }
            }
        }

        double[][] inversa = new double[dimension][dimension];

        for (int renglon = 0; renglon < dimension; renglon++) {
            int j = 0;
            for (int columna = auxiliar[0].length - dimension; columna < dimension * 2; columna++) {
                temp2 = auxiliar[renglon][columna];
                inversa[renglon][j] = Double.parseDouble(rd.format(temp2));
                j++;
            }
        }

        return inversa;
    }

    public double[][] multiplicacionMatrices(double[][] matrizA, double[][] matrizB) {
        double[][] matrizResultado = new double[matrizA.length][matrizB[0].length];

        for (int a = 0; a < matrizB[0].length; a++) {
            // Dentro recorremos las filas de la primera (A)
            for (int i = 0; i < matrizA.length; i++) {
                float suma = 0;
                // Y cada columna de la primera (A)
                for (int j = 0; j < matrizA[0].length; j++) {
                    // Multiplicamos y sumamos resultado
                    suma += matrizA[i][j] * matrizB[j][a];
                }
                // Lo acomodamos dentro del producto
                matrizResultado[i][a] = Double.parseDouble(rd.format(suma));
            }
        }

        return matrizResultado;
    }

    public double[][] restaMatriz(double[][] matrizA, double[][] matrizB) {
        double[][] matrizResultado = new double[matrizA.length][matrizB[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                matrizResultado[i][j] = Double.parseDouble(rd.format(matrizA[i][j] - matrizB[i][j]));
            }
        }
        return matrizResultado;
    }

    public double[][] sumaMatriz(double[][] matrizA, double[][] matrizB) {
        double[][] matrizResultado = new double[matrizA.length][matrizB[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                matrizResultado[i][j] = Double.parseDouble(rd.format(matrizA[i][j] + matrizB[i][j]));
            }
        }
        return matrizResultado;
    }

    public double[][] cambioDeSigno(double[][] matriz) {
        double[][] auxiliar = new double[matriz.length][matriz[0].length];
        for (int renglon = 0; renglon < matriz.length; renglon++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                auxiliar[renglon][columna] = -1 * matriz[renglon][columna];
            }
        }
        return auxiliar;
    }                      

    public double[][] armarMatriz(double[][] A11, double[][] A12, double[][] A21, double[][] A22, int n) {
        double[][] auxiliar = new double[n][n];

        for (int i = 0; i < A11.length; i++) {
            for (int j = 0; j < A11[0].length; j++) {
                auxiliar[i][j] = A11[i][j];
            }
        }

        for (int i = 0; i < A12.length; i++) {
            for (int j = 2; j < A12[0].length + 2; j++) {
                auxiliar[i][j] = A12[i][j - 2];
            }
        }

        for (int i = 2; i < A21.length + 2; i++) {
            for (int j = 0; j < A21[0].length; j++) {
                auxiliar[i][j] = A21[i - 2][j];
            }
        }

        for (int i = 2; i < A22.length + 2; i++) {
            for (int j = 2; j < A22[0].length + 2; j++) {
                auxiliar[i][j] = A22[i - 2][j - 2];
            }
        }

        return auxiliar;
    }

    public double[][] armarVector(double[][] x1, double[][] x2, int n) {
        double[][] auxiliar = new double[x1.length + x2.length][x1[0].length];

        for (int i = 0; i < x1.length; i++) {
            for (int j = 0; j < x1[0].length; j++) {
                auxiliar[i][j] = x1[i][j];
            }
        }

        for (int i = 2; i < x1.length + (n - 2); i++) {
            for (int j = 0; j < x1[0].length; j++) {
                auxiliar[i][j] = x2[i - 2][j];
            }
        }

        return auxiliar;
    }

    public double[][] llenaMatriz(int dimension) {
        double[][] matrizA = new double[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrizA[i][j] = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                "Ingrese el valor [" + (i + 1) + "][" + (j + 1) + "]"));
            }
        }
        return matrizA;
    }

    public double[] llenaVector(int dimension) {
        double[] matrizB = new double[dimension];
        for (int i = 0; i < dimension; i++) {

            matrizB[i] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese el valor del vector solucion [" + (i + 1) + "]"));

        }
        return matrizB;
    }

    public double normaVector(double v[]) {
        double norma = 0.0;
        double suma = 0.0;

        for (int i = 0; i < v.length; i++) {
            suma += Math.pow(v[i], 2);
        }
        norma = Math.sqrt(suma);
        return norma;
    }

    public double[] restaVectores(double v1[], double v2[]) {
        double resta[] = new double[v1.length];
        for (int i = 0; i < resta.length; i++) {
            resta[i] = v1[i] - v2[i];
        }
        return resta;
    }

    public double mayorAbsoluto(double[] vector) {
        double aux = 0;
        double auxOriginal = 0;
        for (int i = 0; i < vector.length; i++) {
            if (Math.abs(vector[i]) > aux) {
                aux = Math.abs(vector[i]);
                auxOriginal = vector[i];
            }
        }
        return auxOriginal;
    }

    public int posicionMayorAbsoluto(double[] vector) {
        double aux = 0;
        int posicion = 0;
        for (int i = 0; i < vector.length; i++) {
            if (Math.abs(vector[i]) > aux) {
                aux = Math.abs(vector[i]);
                posicion = i;
            }
        }
        return posicion;
    }

    public double[][] matrizTranspuesta(double[][] matrizL) {
        double[][] matrizU = new double[matrizL.length][matrizL[0].length];
        for (int i = 0; i < matrizL.length; i++) {
            for (int j = 0; j < matrizL[0].length; j++) {
                matrizU[j][i] = matrizL[i][j];
            }
        }
        return matrizU;
    }

    public boolean simetria(double[][] matrizA) {
        boolean flag = true;
        boolean bandera = true;
        int n = matrizA.length;
        double[][] sup = new double[n][n];
        double[][] inf = new double[n][n];

        sup = diagonalSuperior(matrizA);
        inf = diagonalInferior(matrizA);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    if (sup[i][j] == inf[j][i]) {
                        flag = true;
                    }else{
                        bandera = false;
                    }
                }
            }
        }
        return (flag && bandera);
    }

    public double[][] diagonalInferior(double[][] matrizA) {
        int n = matrizA.length;
        double[][] matrizI = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    matrizI[i][j] = matrizA[i][j];
                } else {
                    matrizI[i][j] = 0;
                }
            }
        }
        return matrizI;
    }

    public double[][] diagonalSuperior(double[][] matrizA) {
        int n = matrizA.length;
        double[][] matrizS = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    matrizS[i][j] = matrizA[i][j];
                } else {
                    matrizS[i][j] = 0;
                }
            }
        }
        return matrizS;
    }

//    public double[][] tresParticiones(double[][] matriz, int dimension, int cond) {
//        switch (cond) {
//            case 11:
//                double[][] auxiliarA11 = new double[2][2]; //<--
//
//                for (int fila = 0; fila < 2; fila++) {
//                    for (int columna = 0; columna < 2; columna++) {
//                        auxiliarA11[fila][columna] = matriz[fila][columna];
//                    }
//                }
//                return auxiliarA11;
//            case 12:
//                double[][] auxiliarA12 = new double[2][2]; //<--
//            case 13:
//                double[][] auxiliarA13 = new double[2][2]; //<--
//            case 21:
//                double[][] auxiliarA14 = new double[2][2]; //<--
//            case 22:
//                double[][] auxiliarA15 = new double[2][2]; //<--
//            case 23:
//                double[][] auxiliarA16 = new double[2][2]; //<--
//            case 31:
//                double[][] auxiliarA17 = new double[2][2]; //<--
//            case 32:
//                double[][] auxiliarA18 = new double[2][2]; //<--
//            case 33:
//        }
//    }
}
