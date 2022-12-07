package prak15_zikwan;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InputController {
    
    @FXML
    private Button btnTambah;

    @FXML
    private TextField fieldAlamat;

    @FXML
    private TextField fieldNPM;

    @FXML
    private TextField fieldNama;

    
    @FXML
    void sendData(ActionEvent event)throws IOException {
        Mahasiswa mhs = new Mahasiswa (fieldNPM.getText(),fieldNama.getText(),fieldAlamat.getText());
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Output.fxml"));
        Parent root = loader.load();
        
        OutputController outputController = loader.getController();
        outputController.showValue(mhs);
        
        Stage stage = (Stage) btnTambah.getScene().getWindow();
        stage.setScene(new Scene(root));
}
}