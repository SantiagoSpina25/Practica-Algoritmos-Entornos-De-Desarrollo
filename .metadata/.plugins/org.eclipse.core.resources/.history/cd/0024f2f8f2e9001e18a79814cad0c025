package modelos;


/**
 * 
 */
public class Circulo extends Figura {

    /**
     * Default constructor
     */
    public Circulo() {
    	radio = 1;
    }

    /**
     * 
     */
    private int radio;



    /**
     * @param base 
     */
    public Circulo(int radio) {
        this.radio = radio;
    }

    /**
     * @return
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param base
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }


    /**
     * @return
     */
    @Override
    public String toString() {
        return "radio=" + radio ;
    }

    /**
     * @return
     */
    @Override
    public double getArea() {
        return Math.PI* (radio * radio);
    }

    /**
     * @return
     */
    @Override
    public double getPerimetro() {
    	return (2 * Math.PI) * radio;
    }

}