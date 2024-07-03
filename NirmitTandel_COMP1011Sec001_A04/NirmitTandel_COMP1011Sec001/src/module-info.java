module NirmitTandel_COMP1011Sec001 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens nirmittandel_sec001_ex01 to javafx.graphics, javafx.fxml;
}
