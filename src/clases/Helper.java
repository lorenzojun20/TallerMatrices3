/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lorenzo
 */
public class Helper {
     public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static int cantidadPares(JTable tabla1) {
        int nf, nc, aux, cont = 0;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (aux % 2 == 0) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void pares(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (aux % 2 == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void letraC(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == nf - 1 || j == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void diagonalPrincipal(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void letraH(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1 || i == (nf - 1) / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static int[][] pasoDeDatos(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        int m[][] = new int[nf][nc];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                m[i][j] = (int) tabla1.getValueAt(i, j);
            }

        }
        return m;

    }

    public static void diagonalSecundaria(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nf - 1 - i) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void triangularSuperior(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == j || i < j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void triangularInferior(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == j || i > j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void transpuestaMatriz(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                tabla2.setValueAt(aux, j, i);
            }
        }
    }

    public static void letraA(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1 || i == 0 || i == nf / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraZ(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == nf - 1 - i || i == nf - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraT(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == nc / 2) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
    public static void letraV(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == i/2 || j == nf - 1 - i/2) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
    public static void letraE(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == 0 || i == nf - 1 || i == (nf - 1)/2 ) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
    public static void letraF(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == 0 || i == (nf - 1)/2 ) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
    
    public static void letraP(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == nf/2 || j == 0 || j == nc - 1/ i ) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
     public static void letraI(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == nf - 1 || j == nc/2) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
     public static void letraN(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || i == j || j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
     public static void letraY(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc / 2 && j <= i || (i + j == nf - 1 && i <= j) || (i == j && i + j <= nf)) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
      public static void letraX(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == i || j == nf - 1 - i) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
      //SEGUNDO TALLER//
      //SEGUNDO TALLER//
      //SEGUNDO TALLER//
      //SEGUNDO TALLER//
      //SEGUNDO TALLER//
      //SEGUNDO TALLER//
      //SEGUNDO TALLER//
      //SEGUNDO TALLER//
      //SEGUNDO TALLER//
      public static void letraB(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || (i == 0 && j != nc - 1)|| (i == nf/2 && j != nc - 1) 
                        || (i == nf-1 && j != nc - 1) || (j == nc - 1 && i != 0 && i != nf/2 && i != nf - 1 )) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
      public static void letraK(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || i + (j - 1) == nf/2 || i - (j - 1) == nf/2) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
      public static void letraM(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc -1 || (j == i && i <= nc/2) || (j == nf - 1 - i && j >= nc/2)) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
      public static void letraW(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc -1 || (i == nf - 1- j && i >= nc/2) || (i == j && j >= nc/2) ) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
      public static void letraQ(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((i == 0 && j != 0 && j != nc - 1)|| (j == 0 && i != 0 && i != nf - 1 && i != nf -2) || 
                        (j == nc - 1 && i != 0 && i != nf -2) || (i == nf -2 && j != 0 && j != nc - 1) 
                         ) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
      public static void letraJ(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == nc / 2 || (j == 0 && i >= nf/2) || (i == nf - 1 && j < nc/2   )) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
      public static void letraG(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || i == nf - 1 || i == 0 || (j == nc/2 && j > nc/2) || 
                        i == nf/2 || j == nc - 1/ i || (j == nc -1 && i > nf/2)) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
      public static void letraR(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == nf/2 || j == 0 || (j == nc - 1 && i < nf/2)
                        || (i == j && j >= nc/2)) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
     public static void relojArena(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((i <= j && nc - 1 -i >=j) || (j < i && nf - 1 -i <= j) ) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
        public static void relojArenaInvertido(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((j <= i && nf - 1 -j >= i) || (i < j && nc - 1 - j <= i)) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
        public static void cruz(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc/2 || j == (nc - 1)/2 || i == nf/2 || i == (nf - 1)/2) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }
         public static void rombo(JTable tabla1, JTable tabla2) {
        int aux, nf, nc;

        nf = tabla1.getRowCount();
        nc = tabla2.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == i + nc/2 ||  nf /2 - i == j || i == j + nc/2 ||nf - i + nf / 2 - 1 == j ) {
                    tabla2.setValueAt(aux, i, j); 

                }
            }
        }
    }
         
      
}



