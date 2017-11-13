package com.oracle.datago.cecdoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.io.InputStream;

import java.net.URL;

import org.apache.poi.xslf.usermodel.XMLSlideShow;

import com.oracle.datago.util.Config;

public class DownloadService {

	public String callMethod(String fildId) {

		// StringBuffer sBuffer = new StringBuffer();
		String type = "";
		String disposition = "";
		String expFilePath = "";
		try {
			URL url = new URL(fildId);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");

			connection.setRequestProperty("Authorization", Config.getValue("cec.token"));
			if (connection.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + connection.getResponseCode());
			}

			 type = connection.getHeaderField("Content-Type");
			disposition = connection.getHeaderField("Content-Disposition");
			String fileName = disposition.replaceFirst("(?i)^.*filename=\"([^\"]+)\".*$", "$1");
			
			InputStream in = connection.getInputStream();
			
			if(type.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
				XMLSlideShow ppt = new XMLSlideShow(in);
				String realFilePath = Config.getValue("cec.save_path") + fileName;
				expFilePath = Config.getValue("cec.save_relative_path") + fileName;
				FileOutputStream out = new FileOutputStream(realFilePath);
				ppt.write(out);
				out.close();
				ppt.close();
			}
		

			////
			// BufferedReader res = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			//
			// String inputLine;
			// while ((inputLine = res.readLine()) != null)
			// sBuffer.append(inputLine);

			// res.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// final String expFilePath = "D:\\file\\downloadcec.pptx";
		// File expFile = new File(expFilePath);
		// if (expFile.exists()) {
		// expFile.delete();
		// }
		//

		// BufferedWriter writer = null;
		// try {
		// writer = new BufferedWriter(new FileWriter(expFile, true));
		// writer.write(sBuffer.toString());
		// writer.flush();
		// }catch (Exception e) {
		// e.printStackTrace();
		// } finally {
		// if (writer != null) {
		// try {
		// writer.close();
		// writer = null;
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// }
		// }
		// System.out.println(sBuffer.toString());
		System.out.println(expFilePath);

		return expFilePath;
	}

	public static void main(String[] args) throws IOException {
//		System.out.println(Thread.currentThread().getContextClassLoader().getResource("").getPath()); 
		new DownloadService().callMethod(
				"https://testenvjp-a18025.documents.us2.oraclecloud.com/documents/api/1.2/files/D587767E671118B0DE2336DBDC5412FC8BB6538AE6AC/data");
	}

}
