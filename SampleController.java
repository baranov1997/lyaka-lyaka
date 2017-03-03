package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {
	
	    @FXML
	    private Button bt1;
	    @FXML
	    private Button bt2;
	    @FXML
	    private Button bt3;
	    @FXML
	    private Button bt4;
	    @FXML
	    private Button bt5;
	    @FXML
	    private Button bt6;
	    @FXML
	    private Button bt7;
	    @FXML
	    private Button bt8;
	    @FXML
	    private Button bt9;
	    @FXML
	    private Button bt10;
	    @FXML
	    private TextField tx1;
	    @FXML
	    private TextField tx2;
	    @FXML
	    private TextField tx3;
	    @FXML
	    private TextField tx4;
	    @FXML
	    private TextField tx5;
	    public String pole4;
	    public String pole3;
		public String pole2;
		public int pole1;
		public int a;
		public int i;
		public int j;
		public String[] ERusf;
		public String[] Engf;
		public String [] mas;
		public String [] masr;
		private int k;
		private boolean log;
	    
	    @FXML
	    public void FBA() throws IOException{
	        bt1.setDisable(true);
	        bt3.setDisable(true);
	        tx1.setDisable(false);
	        tx2.setDisable(false);
	        tx3.setDisable(false);
	        bt5.setDisable(false);
	        
			try {
				int i=0;
				Engf = new String[101];
				InputStream is = getClass().getResourceAsStream("eng.txt");
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader reader1 = new BufferedReader(isr);
				
				String line;
				for (i=0;i<100;i++){
					line = reader1.readLine();
					Engf[i]=line;
					line="";}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				int i=0;
				ERusf = new String[101];
				InputStream is = getClass().getResourceAsStream("GRus.txt");
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader reader2 = new BufferedReader(isr);
				
				String line;
				for (i=0;i<101;i++){
					line = reader2.readLine();
					ERusf[i]=line;
					line="";
					}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	    }
	    public void tx3c(){
	        
	    	try{
	    	pole1 = Integer.parseInt(tx3.getText());
	    	if((pole1>=101)||(pole1<=0)){tx3.clear(); tx3.setText("Некорректный ввод");
	    	bt6.setDisable(true); bt5.setDisable(false);
	    	}
	    	
	    	else{bt6.setDisable(false);}
	    	} catch (Exception e){
	    		tx3.clear();
	    		tx3.setText("Некорректный ввод");
	    		bt5.setDisable(false);
	    	}
			
		}
	    public void ThBC() throws IOException{
	    	bt1.setDisable(true);
	        bt3.setDisable(true);
	        tx1.setDisable(false);
	        tx2.setDisable(false);
	        tx3.setDisable(false);
	        bt5.setDisable(false);
	        
	    	try {
				int i=0;
				Engf = new String[101];
				InputStream is = getClass().getResourceAsStream("Ger.txt");
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader reader1 = new BufferedReader(isr);
				
				String line;
				for (i=0;i<101;i++){
					line = reader1.readLine();
					Engf[i]=line;
					line="";}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	try {
				int i=0;
				ERusf = new String[101];
				InputStream is = getClass().getResourceAsStream("GRus.txt");
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader reader2 = new BufferedReader(isr);
				
				String line;
				for (i=0;i<101;i++){
					line = reader2.readLine();
					ERusf[i]=line;
					line="";
					}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	        
	    public void FvBC(){
	    	
	    	bt4.setDisable(true);
	    	bt5.setDisable(true);
	    	bt6.setDisable(true);
	    	bt7.setDisable(true);
	    	bt8.setDisable(true);
	    	bt9.setDisable(true);
	    	tx1.clear();
	    	tx2.clear();
	    	tx3.clear();
	    	bt1.setDisable(false);
	    	bt3.setDisable(false);
			
		}
	    public void SBC(){
	    	Random rand = new Random();
	    	mas= new String[101];
	    	masr= new String[101];
	    	int j=0;
	    	for(i=0;i<pole1;++i){
	    		j=rand.nextInt(99);
	    		mas[i]=Engf[j];
	    		masr[i]=ERusf[j];
	    	}
	    	bt7.setDisable(false);
	    	i=0; a=0; k=pole1; j=0;
	    	
	    	tx4.setText(mas[i]);
	    	bt10.setDisable(false);
	    	bt6.setDisable(true);
	    	
	    	bt1.setDisable(true);
	    	bt3.setDisable(true);
		}
	    
	    
	    public void SvBC(){
	    	bt7.setDisable(true);
	    	if(k!=0){
	    		if(i==pole1){i=0;}
	    	tx5.setText(masr[i]);
	    	i++; 
	    	bt8.setDisable(false);
	    	bt9.setDisable(false);
	    	bt5.setDisable(true);}
	    	else {
	    		tx4.clear();
	    		tx5.clear();
	    	};
		}
	    
	    public void EBC(){
	    	
	    	if(k!=0){
	    		if(i==pole1){i=0;}
	    	tx4.clear();
	    	tx5.clear();
	    	bt7.setDisable(false);
	    	bt8.setDisable(true);
	    	bt9.setDisable(true);
	    	k--;
	    	if(k==0){ bt7.setDisable(true);}
	    	else{
	    	tx4.setText(mas[i]);}}
	    	
		}
	    public void TBC(){
	    	tx3.clear();
	    	tx4.clear();
	    	tx5.clear();
	    	bt1.setDisable(false);
	    	bt3.setDisable(false);
	    	bt6.setDisable(true);
	    	bt7.setDisable(true);
	    	bt8.setDisable(true);
	    	bt9.setDisable(true);
	    	bt10.setDisable(true);
	    	
		}
	    public void NBC(){
	    	if(k!=0){
	    		if(i==pole1){i=0;}
	    	tx4.clear();
	    	tx5.clear();
	    	bt7.setDisable(false);
	    	bt8.setDisable(true);
	    	bt9.setDisable(true);
	    	tx4.setText(mas[i]);
	    	k+=pole1-1;}
	    	else {bt7.setDisable(true);};
		}
	    public void tx1c(){
	    	pole2 = tx1.getText();
	    	bt4.setDisable(false);
		}
	    public void tx2c(){
		}
	    public void FoBC(){
	    for(i=0;i<100;++i){
    		if(pole2.equals(ERusf[i])){tx2.clear(); tx2.setText(Engf[i]); log = true;}
    	}
	    if(!log){tx1.clear();};
	    log = false;
	    bt4.setDisable(true);
	    bt5.setDisable(false);
	    }
	}
