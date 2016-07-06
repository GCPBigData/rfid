package edu.umhs.rfid;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RfidEvent {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;	
    
    public String readerName;
	public String EPC;
	public String timeStamp;
	public String peakRSSI;
	public String readCount;
	
    protected RfidEvent() {}
	
	public RfidEvent(String readerName, String ePC, String timeStamp, String peakRSSI, String readCount) {
		System.out.println(readerName);
		this.readerName = readerName;
		this.EPC = ePC;
		this.timeStamp = timeStamp;
		this.peakRSSI = peakRSSI;
		this.readCount = readCount;
	}
	
	@Override
	public String toString() {
		return "RfidEvent [readerName=" + readerName + ", EPC=" + EPC + ", timeStamp=" + timeStamp + ", peakRSSI="
				+ peakRSSI + ", readCount=" + readCount + "]";
	}
		
}
