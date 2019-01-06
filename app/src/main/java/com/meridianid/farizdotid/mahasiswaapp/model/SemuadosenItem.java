package com.meridianid.farizdotid.mahasiswaapp.model;

import com.google.gson.annotations.SerializedName;

public class SemuadosenItem{

	@SerializedName("nama")
	private String nama;

	@SerializedName("id")
	private String id;

	@SerializedName("email")
	private String email;

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"SemuadosenItem{" + 
			"nama = '" + nama + '\'' + 
			",id = '" + id + '\'' + 
			",matkul = '" + email + '\'' +
			"}";
		}
}