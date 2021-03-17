package classes;

import javax.swing.JOptionPane;

public class Equacao {

    private int coeficienteA = 1;
    private int coeficienteB = 0;
    private int coeficienteC = 0;

    public int getCoeficienteA() {
        return coeficienteA;
    }

    public void setCoeficienteA(int coeficienteA) throws Exception {
        if (coeficienteA == 0) {
            throw new Exception("O coeficiente A deve ser diferente de 0");
        }

        this.coeficienteA = coeficienteA;
    }

    public int getCoeficienteB() {
        return coeficienteB;
    }

    public void setCoeficienteB(int coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public int getCoeficienteC() {
        return coeficienteC;
    }

    public void setCoeficienteC(int coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

    public float calculaDelta() {

        return (float) (Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC);
    }

    public float calculaRaiz1() {

        float delta = calculaDelta();

        if (delta >= 0) {
            return (float) (-1 * coeficienteB + Math.sqrt(delta) / (2 * coeficienteA));
        } else {
            return 0;
        }
    }

    public float calculaRaiz2() {

        float delta = calculaDelta();

        if (delta >= 0) {
            return (float) (-1 * coeficienteB - Math.sqrt(delta) / (2 * coeficienteA));
        } else {
            return 0;
        }
    }

    public String tipoDaRaiz() {
        float valor = calculaDelta();
        if (valor < 0) {
            return "Raiz imaginária";
        }
        if (valor == 0) {
            return "Raiz única";
        }
        if (valor > 0) {
            return "Duas raízes";
        }
        return null;
    }

}
