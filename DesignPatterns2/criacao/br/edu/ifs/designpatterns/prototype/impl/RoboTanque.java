package br.edu.ifs.designpatterns.prototype.impl;

import br.edu.ifs.designpatterns.prototype.Robo;

public class RoboTanque extends Robo {

	private RoboTanque roboTanque;

	public RoboTanque(int at1, int at2, String at3) {
		super(at1, at2, at3);
		// TODO Auto-generated constructor stub
	}

	public RoboTanque(Robo roboTanque) {
		this(roboTanque.getAt1(),roboTanque.getAt2(),roboTanque.getAt3());
	}

	public Robo clonar() {
		// TODO Auto-generated method stub
		return new RoboTanque(this);
	}

}
