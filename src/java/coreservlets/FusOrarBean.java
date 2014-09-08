package somepackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="FusOrarBean")
@SessionScoped
public class FusOrarBean {
	
	long long1=1, long2=2;
	String tiplong1="EST", tiplong2="EST";
	int ora=1, minutul=2;
	
	  public int getOra() {
		return ora;
	}
	public void setOra(int ora) {
		this.ora = ora;
	}
	public int getMinutul() {
		return minutul;
	}
	public void setMinutul(int minutul) {
		this.minutul = minutul;
	}
	public long getLong1() {
		return long1;
	}
	public void setLong1(long long1) {
		this.long1 = long1;
	}
	public long getLong2() {
		return long2;
	}
	public void setLong2(long long2) {
		this.long2 = long2;
	}
	public String getTiplong1() {
		return tiplong1;
	}
	public void setTiplong1(String tiplong1) {
		this.tiplong1 = tiplong1;
	}
	public String getTiplong2() {
		return tiplong2;
	}
	public void setTiplong2(String tiplong2) {
		this.tiplong2 = tiplong2;
	}
	public int calculeazaDiferentaFus(long long1, String tiplong1, long long2, String tiplong2){
		  if (tiplong1.equals("EST")){
				  if (tiplong2.equals("EST")){
					  return( (int)(long2-long1)/15);
				  }
				  if (tiplong2.equals("VEST")){
					  return( (int)(-long2-long1)/15);
				  }		  
		  }
		else  if (tiplong1.equals("VEST")){
				  if (tiplong2.equals("VEST")){
					  return( (int)(long1-long2)/15);
				  }
				  if (tiplong2.equals("EST")){
					  return( (int)(long1+long2)/15);
				  }
		  }	  
	return 0;
	  }
	public String calculeazaOra(int ora, int minutul, int diferenta){
		if (minutul>9) {return((ora+diferenta + 24)%24 + " : " + minutul);}
		else { return((ora+diferenta + 24)%24 + " : " + "0"+minutul);}
		}
	
	public String getDiferentaFus(){
		return ("Diferenta fus: " + calculeazaDiferentaFus(long1, tiplong1, long2, tiplong2) );		
	}
	public String getOraPct2(){
		return ("Ora in punctul 2: " + calculeazaOra(ora, minutul, calculeazaDiferentaFus(long1, tiplong1, long2, tiplong2)));
	}
}
