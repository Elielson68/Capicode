/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicodesystem;

import com.mycompany.capivaracode.CapicodeLexer;
import com.mycompany.capivaracode.CapicodeParser;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
/**
 *
 * @author Outros
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    Button button;
    
    @FXML
    TextArea textbox_code;
    
    @FXML
    TextArea textbox_tokens;
    
    @FXML
    TextArea textbox_sintatico;
    
    public static String logGeral;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        CharStream cs = CharStreams.fromString(textbox_code.getText());
        CapicodeLexer lex = new CapicodeLexer(cs);
        Token t;
        String tokenString = "";
        while((t = lex.nextToken()).getType() != Token.EOF){
            tokenString += "<"+CapicodeLexer.VOCABULARY.getDisplayName(t.getType())+", "+t.getText()+">\n";
        }
        textbox_tokens.setText(tokenString);
        //System.out.println(tokenString);

    }
    
    @FXML
    private void ClickSintatico(ActionEvent event) throws IOException {
        CharStream cs = CharStreams.fromString(textbox_code.getText());
        CapicodeLexer lex = new CapicodeLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CapicodeParser parser = new CapicodeParser(tokens);
        parser.programa();
        textbox_sintatico.setText(logGeral);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
