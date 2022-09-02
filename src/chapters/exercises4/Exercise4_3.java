package chapters.exercises4;

public class Exercise4_3 {
	public static void main(String[] args) {
		double atlantaX = 33.74;
		double atlantaY = -84.38;

		double orlandoX = 28.63;
		double orlandoY = -81.45;

		double savannahX = 32.12;
		double savannahY = -81.33;

		double charlotteX = 35.02;
		double charlotteY = -80.74;

		double disCharlotte_Atlanta = 6371.01
				* Math.acos(Math.sin(Math.toRadians(charlotteX)) * Math.sin(Math.toRadians(atlantaX))
						+ Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(atlantaX))
								* Math.cos(Math.toRadians(charlotteY - atlantaY)));
		double disCharlotte_Savannah = 6371.01
				* Math.acos(Math.sin(Math.toRadians(charlotteX)) * Math.sin(Math.toRadians(savannahX))
						+ Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(savannahX))
								* Math.cos(Math.toRadians(charlotteY - savannahY)));
		double disSavannah_Orlando = 6371.01
				* Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(orlandoX))
						+ Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(orlandoX))
								* Math.cos(Math.toRadians(savannahY - orlandoY)));
		double disOrlando_Atlanta = 6371.01
				* Math.acos(Math.sin(Math.toRadians(orlandoX)) * Math.sin(Math.toRadians(atlantaX))
						+ Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(atlantaX))
								* Math.cos(Math.toRadians(orlandoY - atlantaY)));
		double disSavannah_Atlanta = 6371.01
				* Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(atlantaX))
						+ Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(atlantaX))
								* Math.cos(Math.toRadians(savannahY - atlantaY)));
		double side1 = (disCharlotte_Atlanta + disCharlotte_Savannah + disSavannah_Atlanta) / 2;
		double area1 = Math.sqrt(side1 * (side1 - disCharlotte_Atlanta) * (side1 - disCharlotte_Savannah)
				* (side1 - disSavannah_Atlanta));
		double side2 = (disOrlando_Atlanta + disSavannah_Orlando + disSavannah_Atlanta) / 2;
		double area2 = Math.sqrt(
				side2 * (side2 - disOrlando_Atlanta) * (side2 - disSavannah_Orlando) * (side2 - disSavannah_Atlanta));

		System.out.println("area enclosed by Charlotte  Atlanta  Savannah  Orlando is : " + (area1 + area2));
	}

}
