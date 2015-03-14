package br.com.caelum.argentum.testes;

import java.util.Calendar;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickBuilder;

public class TestaCandlestickBuilder {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();

		CandlestickBuilder builder = new CandlestickBuilder();
		builder.comAbertura(200);
		builder.comFechamento(800);
		builder.comMinimo(200);
		builder.comMaximo(800);
		builder.comVolume(3200);
		builder.comData(hoje);

		Candlestick candle = builder.geraCandle();

		System.out.println(candle);
	}
}
