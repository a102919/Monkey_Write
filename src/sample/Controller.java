package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

import java.util.List;
import java.util.Map;

public class Controller {
    @FXML
    public TextArea showid;
    private List<String> data;
    public void chose(ActionEvent actionEvent) {
        fileAdapter fileAdapter = new fileAdapter();
        data = fileAdapter.fileRead();
    }

    public void search(ActionEvent actionEvent) {
        Monkey monkey = new Monkey();
        Map<String,Integer> dataMap = monkey.compare(data);
        for (String key : dataMap.keySet()){
            showid.appendText(key+" : "+dataMap.get(key)+"\n");
        }
    }
}
