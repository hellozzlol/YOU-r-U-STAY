package co.stay.prj.photo.service;

import lombok.Data;

@Data
public class PhotoVO {
	private int fileNo;
	private int fileSeq;
	private int fileSize;
	private String fileName;
	private String orlgiName;
	private String fileType;
	private int fileGid;
	
	
}
