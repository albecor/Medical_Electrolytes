package com.spring.medical.utilities;

import java.util.ArrayList;
import java.util.List;

import com.spring.medical.model.Exam;

public class PanelElectrolytes {
	/**
	 * return initial parameters for panel
	 * 
	 * @param exam
	 * @return exam object
	 */
	public Exam getExam(Exam exam) {

		switch (exam.getCode()) {
		case "2951-2":
			exam.setDisplayCode("Sodium [Moles/volume] in Serum or Plasma");
			exam.setCode("2951-2");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/2951-2.html?sections=Comprehensive");
			exam.setLow("136");
			exam.setHigh("145");
			exam.setUnit("mmol/L");
			break;
		case "2823-3":
			exam.setDisplayCode("Potassium [Moles/volume] in Serum or Plasma");
			exam.setCode("2823-3");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/2823-3.html?sections=Comprehensive");
			exam.setLow("3.5");
			exam.setHigh("5.0");
			exam.setUnit("mmol/L");
			break;
		case "2075-0":
			exam.setDisplayCode("Chloride [Moles/volume] in Serum or Plasma	");
			exam.setCode("2075-0");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/2075-0.html?sections=Comprehensive");
			exam.setLow("98");
			exam.setHigh("106");
			exam.setUnit("mmol/L");
			break;
		case "2028-9":
			exam.setDisplayCode("Carbon dioxide, total [Moles/volume] in Serum or Plasma");
			exam.setCode("2028-9");
			exam.setSystemCode("");
			exam.setLow("21");
			exam.setHigh("30");
			exam.setUnit("mmol/L");
			break;
		case "33037-3":
			exam.setDisplayCode("Anion gap in Serum or Plasma");
			exam.setCode("33037-3");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/33037-3.html?sections=Comprehensive");
			exam.setLow("7");
			exam.setHigh("16");
			exam.setUnit("mmol/L");
			break;
		}
		return exam;
	}

	/**
	 * 
	 * @return name exam list
	 */
	public List<String> listExam() {
		List<String> listExam = new ArrayList<>();
		listExam.add("2951-2");
		listExam.add("2823-3");
		listExam.add("2075-0");
		listExam.add("2028-9");
		listExam.add("33037-3");
		return listExam;
	}

}
