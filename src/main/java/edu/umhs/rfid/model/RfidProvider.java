package edu.umhs.rfid.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RfidProvider {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;	
    
    private String providerType;
	private String institutionalId;
    
    protected RfidProvider() {}

    public RfidProvider(String provider_type, String institutional_id) {
		this.providerType = provider_type;
		this.institutionalId = institutional_id;
	}

	public long getId() {
		return id;
	}

	public String getProviderType() {
		return providerType;
	}

	public String getInstitutionalId() {
		return institutionalId;
	}

    
}