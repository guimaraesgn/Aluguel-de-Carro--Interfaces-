package model.entities;

public class Invoice {
	private Double basicPayment;
	private Double taxi;
	
	public Invoice() {
		
	}

	public Invoice(Double basicPayment, Double taxi) {
		this.basicPayment = basicPayment;
		this.taxi = taxi;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTaxi() {
		return taxi;
	}

	public void setTaxi(Double tax) {
		this.taxi = tax;
	}

		public Double getTotalPayment() {
			return getBasicPayment() - getTaxi();
		}
	}

