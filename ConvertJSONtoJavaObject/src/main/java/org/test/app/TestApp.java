package org.test.app;

import org.json.util.JsonUtil;
import org.modelo.empleado.Empleado;

public class TestApp {
	public static void main(String[] args) {
		try {
			//INSTANCIA DE CLASE
			Empleado empleado = new Empleado();
			empleado.setId(100);
			empleado.setNombre("JUAN CARLOS");
			empleado.setSalario(25000.0);
			
			//CONVERT JAVA OBJECT TO JSON
			String formatJson = JsonUtil.convertJavaObjectToJson(empleado);
			System.out.println("FORMATO JSON = " + formatJson);
			
			System.out.println("=======================");
			
			Empleado emp = JsonUtil.converJsonToJavaObject(formatJson, Empleado.class);
			System.out.println("JAVA OBJECT = "+emp.getId()+","+emp.getNombre()+","+emp.getSalario());
			
		} catch (Exception e) {
			System.out.println("Exception:" +e.getMessage());
		}
	}
}
