package ssc5094.WebserviceProject.Model;

/**
 * Simple POJO class that represents a package following the description in the
 * document.
 * 
 * @author stevao & marcelo
 *
 */
public class Pacote {
	
	//atributos
	Double width;
	Double height;
	Double length;
	
	//aliquota para os pacotes é definida de maneira fixa porém pode ser alterada por meio de get ou set
	Double aliquot = 5.0;

	public Pacote() {
		super();
	}

	public Pacote(Double width, Double height, Double length) {
		super();
		this.width = width;
		this.height = height;
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getAliquot() {
		return aliquot;
	}

	public void setAliquot(Double aliquot) {
		this.aliquot = aliquot;
	}
	
	//calculo do volume. Simplesmente largura x altura x comprimento
	private Double getVolume() {

		return this.getHeight() * this.getWidth() * this.getLength();
	}
	
	//calcula o valor do frete segundo especificação do trabalho
	public Double calculateShipment() {
		Double value;
		Double volume = this.getVolume();
		
		if(volume <= 10) {
			value = this.aliquot;
			return value;
		}
		else {
			if(volume <= 100) {
				value = (Double) (this.aliquot + (0.10 * this.getVolume()));
				return value;
			}
				
			else {
				value = (Double) (this.aliquot + (0.20 * this.getVolume()));
				return value;
			}
			
		}
				
	}

}
